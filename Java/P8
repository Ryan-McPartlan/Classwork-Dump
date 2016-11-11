package usdtormb;
import java.util.Scanner;


public class USDtoRMB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String money = "";
        String newMoney = "";
        
        System.out.print("Enter the exchange rate for USD to RMB: ");
        double exchangeRate = input.nextDouble();  
        
        System.out.print("Input 0 to convert USD to RMB or 1 vice versa: ");
        int conversionType = input.nextInt();
        
        if(conversionType == 0){
            money = "dollars";
            newMoney = "yuan";
        }
        else if(conversionType == 1){
            money = "yuan";
            newMoney = "dollars";
        }
        else{
            System.out.println("Bad input, defaulting to USD-->RMB");
            conversionType = 0;
        }
        
        System.out.printf("Input a value in %s: ",money);
        double value = input.nextDouble();
        double newValue = value;
        
        if(conversionType == 0){
            newValue *= exchangeRate;
        }
        else{
            newValue /= exchangeRate;
        }
        
        System.out.printf("%1.2f %s is equal to %1.2f %s.\n", value, money, newValue, newMoney );
    }
}




Lowecase letters:
package numberlowercase;
import java.util.Scanner;


public class NumberLowercase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char checkChar = '0';
        int count = 0;
        
        System.out.print("Input a string and I will count the lowercase letters: ");
        String userString = input.nextLine();
        
        for(int i = 0; i < userString.length(); i++){
            checkChar = userString.charAt(i);
            
            if(Character.isLowerCase(checkChar)){
                count++;
            }
        }
        
        System.out.printf("There are %d lowercase letters in this string.\n", count);
    }
}


