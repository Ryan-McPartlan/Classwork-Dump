package babalonianroot;
import java.util.Scanner;


public class BabalonianRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input a number to square root: ");
        double userIn = input.nextDouble();
        System.out.println("The square root of " + userIn + " is about equal too " + sqrt(userIn));
    }
    
    public static double sqrt(double n){
        
        double nextGuess = 1;
        double lastGuess = 1;
        double difference = 100;
        
        while(difference > 0.0000001 || difference < -0.0000001){
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
            difference = nextGuess - lastGuess;
        }
        
        return nextGuess;
    }
}
