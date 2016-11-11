package classwork;
import java.util.Scanner;


public class Classwork {
    
    public static int sumOfOddPlace(double cardNum){
        
       int cardNumLength = (int)Math.log(cardNum);
       int numOdds = cardNumLength / 2; 
       
       if(cardNumLength % 2 == 1){
           numOdds += 1;
       }
       
       for(int i = 0; i < numOdds; i++){
           int thisOdd = (int) (cardNum % Math.pow(10, i*2));
       }
       
        return 1;
    }
    
    public static int sumOfDoubleEvenPlace(double cardNum){
        return 1;
    }
    
    public static boolean luhnCheck(double cardNum){
        
        int sum1 = sumOfDoubleEvenPlace(cardNum);
        int sum2 = sumOfOddPlace(cardNum);
        
        return (sum1 + sum2) % 10 == 0;
    }
    
    public static boolean sizeIsValid(double cardNum){
        
        int length = (int) Math.log(cardNum);
        
        if(length < 13 || length > 16){
            return false;
        }
        
        return true;
    }
    
    public static int getPrefix(double cardNum, int prefixLength){
        
        int prefix = 0;
        System.out.print("Dubug: " + prefixLength);
        
        for(int i = 0; i < prefixLength; i++){
            prefix += cardNum % Math.pow(10, i) - cardNum % Math.pow(10,i-1);
        }
        
        return prefix;
    }
    
    public static boolean prefixIsValid(double cardNum){
        
        int validPrefixs[] = new int[4];
        validPrefixs[0] = 4;
        validPrefixs[1] = 5;
        validPrefixs[2] = 37;
        validPrefixs[3] = 6;
        
        for(int i = 0; i < validPrefixs.length; i++){
            if(getPrefix(cardNum, (int) Math.log(validPrefixs[i])) == validPrefixs[i]){
                break;
            }
            if(i == validPrefixs.length -1){
                return false;
            }
        }
        
        return true;
    }
    
    public static boolean isValid(double cardNum){
        
        if(!prefixIsValid(cardNum)){
            return false;
        }
        else if(!sizeIsValid(cardNum)){
            return false;
        }
        else if(!luhnCheck()){
            return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a credit card number. I will check if it is valid!");
        double cardNumber = input.nextDouble();
        
        if(isValid(cardNumber)) {
            System.out.print("That is a valid card number!");
        } else {
            System.out.print("That is not a valid card number!");
        }
        
    }
    
}
