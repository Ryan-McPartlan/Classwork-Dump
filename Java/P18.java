package beanmachine;
import java.util.Scanner;
import java.util.Random;


public class BeanMachine {
    
    public static int getUserInteger(){
        Scanner input = new Scanner(System.in);
        
        int userIn = input.nextInt();
        
        return userIn;
    }
    
    public static int dropBall(int numSlots){
        Random rand = new Random();
        
        float aboveSlot = numSlots / 2f + 0.5f;
        String pathString = "";
        
        for(int i = 0; i < numSlots - 1; i++){
            float path = rand.nextInt(2) - 0.5f;
            aboveSlot += path;
            if(path > 0){
                pathString += "R";
            }
            else{
                pathString += "L";
            }
        }
        
        if("".equals(pathString)){
            System.out.println("|");
        }else{
            System.out.println(pathString);
        }
        
        int finalSlot = (int) aboveSlot;
        
        return finalSlot;
    }
    
    public static void printHistogram(int[] slots){
        int highest = 0;
        
        for(int i = 0; i < slots.length; i++){
            if(slots[i] > highest){
                highest = slots[i];
            }
        }
        
        for(int i = 0; i < highest; i++){
            for(int j = 0; j < slots.length; j++){
                if(slots[j] >= highest - i){
                    System.out.print("0");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
        
    }
    
    public static int validateInput(int variable, String varName){
        while(variable < 1){
            System.out.printf("You must have at least one %s. Enter a number of %ss: \n", varName, varName);
            variable = getUserInteger();
        }
        
        return variable;
    }
    
    public static void main(String[] args) {
        System.out.print("Enter the number of balls to drop: ");
        int numBalls = getUserInteger();
        numBalls = validateInput(numBalls, "ball");
        
        System.out.print("Enter the number of slots in the machine: ");
        int numSlots = getUserInteger();
        numSlots = validateInput(numSlots, "slot");
        if(numSlots == 1 && numBalls == 1){
            System.out.println("Your bean will fall straight down with one slot, but sure.");
        } else if(numSlots == 1){
            System.out.println("Your beans will fall straight down with one slot, but sure.");
        }


        
        int[] slots = new int[numSlots];
        
        int intoSlot;
        for(int i = 0; i < numBalls; i++){
            intoSlot = dropBall(numSlots);
            slots[intoSlot - 1]++;
        }
        
        printHistogram(slots);
    }
}


