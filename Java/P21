package rps.game;
import java.util.Scanner;
import java.util.Random;


public class RPSGame {
    
    public static String toText(int num){
        switch (num) {
            case 1:
                return "rock";
            case 2:
                return "paper";
            case 3:
                return "scissors";
            default:
                break;
        }
        
        return "Error";
    }
    
    public static String getUserChoice(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Choose rock, paper, or scissors: ");
        String userChoice = input.next();
        
        while(!"rock".equals(userChoice) && !"paper".equals(userChoice) && !"scissors".equals(userChoice)){
            System.out.print("Sorry, that is not rock, paper, or scissors. Try again, and be sure to input your choice exactly as it is displayed: ");
            userChoice = input.next();
        }
        
        return userChoice;
    }
    
    public static void rockPaper(){
        System.out.println("The paper covers the rock!");
    }
    
    public static void rockScissors(){
        System.out.println("The rock crushes the scissors!");
    }
    
    public static void scissorsPaper(){
        System.out.println("The scissors cut the paper!");
    }
    
    public static String resolveCombat(String playerString, String compString){
        if(playerString.equals(compString)){
            System.out.println("A tie! The game must be played again to determine a winner!");
            return "tie";
        }
        else if("rock".equals(playerString) && "paper".equals(compString)){
            rockPaper();
            return "lose";
        }
        else if("rock".equals(playerString) && "scissors".equals(compString)){
            rockScissors();
            return "win";
        }
        else if("scissors".equals(playerString) && "rock".equals(compString)){
            rockScissors();
            return "lose";
        }
        else if("scissors".equals(playerString) && "paper".equals(compString)){
            scissorsPaper();
            return "win";
        }
        else if("paper".equals(playerString) && "rock".equals(compString)){
            rockPaper();
            return "win";
        }
        else if("paper".equals(playerString) && "scissors".equals(compString)){
            scissorsPaper();
            return "lose";
        }
        
        return "Error";
    }
    
    public static String playGame(){
        Random rand = new Random();
        
        int compChoice = rand.nextInt(3) + 1;
        String compText = toText(compChoice);
        
        String userChoice = getUserChoice();
        
        System.out.printf("You have chosen %s!\n", userChoice);
        System.out.printf("The computer has chosen %s!\n", compText);
        
        String checkWin = resolveCombat(userChoice, compText);
        
        return checkWin;
    }
    
    public static void main(String[] args) {
        String status = "tie";
        
        while("tie".equals(status)){
            status = playGame();
        }
        
        if("win".equals(status)){
            System.out.println("You win! Nice!");
        } else {
            System.out.println("You lose! Better luck next time!");
        }
    }
}
