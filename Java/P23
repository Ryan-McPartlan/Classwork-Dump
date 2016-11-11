package javaapplication1;
import java.util.Scanner;


public class JavaApplication1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your email: ");
        
        String playerEmail = input.next();
        
        if(validateEmail(playerEmail) && validateUserName(playerEmail) && validateServerName(playerEmail) && validateDomain(playerEmail)){
            System.out.println("Email verified.");
        }else{
            System.out.println("Email invalid.");
        }
    }
    
    static boolean validateEmail(String email){
        return email.matches(".+@.+\\..+");
    }
    
    static boolean validateUserName(String email){
        String[] test = email.split("@");
        return test[0].matches(".{5,}") && test[0].matches(".*\\d.*");
    }
    
    static boolean validateServerName(String email){
        String[] test = email.split("@");
        test = test[1].split("\\.");
        return (test[0].equals("mancol") || test[0].equals("manhattan"));
    }
    
    static boolean validateDomain(String email){
        String[] test = email.split("@");
        test = test[1].split("\\.");
        return "edu".equals(test[1]);
    }
    
}


