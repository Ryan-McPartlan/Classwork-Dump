package uppercasecheck;
import java.util.Scanner;


public class UppercaseCheck {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input a string and I will tell you how many capitol letters it has: ");
        String userString = input.nextLine();
        int numCaps = 0;
        
        int numCharacters = userString.length();
        String[] characters = new String[numCharacters];
        
        for(int i = 0; i < numCharacters; i++){
            characters[i] = userString.substring(i, i+1);
        }
        
        for(int i = 0; i< numCharacters; i++){
            if(characters[i].equals(characters[i].toUpperCase()) && characters[i] != characters[i].toLowerCase()){
                numCaps += 1;
            }
        }
        
        System.out.println("There are " + numCaps + " capitol letters in your string!");
    }
}
