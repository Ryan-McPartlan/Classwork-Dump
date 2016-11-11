Ryan McPartlan
package esp.game;
import java.util.Scanner;
import java.util.Random;


public class ESPGame {
    
    public static String getUserChoice(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Choose a color: ");
        String userChoice = input.next();
        userChoice = userChoice.toLowerCase();
        
        return userChoice;
    }
    
    public static void main(String[] args) {
        Random rand = new Random();
        
        String[] colorsList = {"red", "green", "blue", "orange", "yellow"};
        int count = 0;
        
        System.out.println("Guess a color, and see if you can pick the one the computer was thinking!");
        for(int i = 0; i < 10; i++){
            
            int compGuess = rand.nextInt(4);
            String compChoice = colorsList[compGuess];
            
            String userChoice = getUserChoice();
            
            System.out.println("The computer was thinking " + compChoice);
            
            if(compChoice.equals(userChoice)){
                count++;
            }
        }
        
        System.out.printf("\nCorrect guesses: " + count + "\n");
        
    }
}
