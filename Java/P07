package changeforsomemoney;
import java.util.Scanner;
/**
 *
 * @author rmcpartlan01
 */
public class ChangeForSomeMoney {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        // TODO code application logic here
        double value = input.nextDouble();
        
        int dollars = (int) (value / 1);
        int quarters = (int) (((value) - dollars) / 0.25);
        int dimes = (int) ((value - dollars - quarters * .25) / .1);
        int nickles = (int) ((value - dollars - quarters * .25 - dimes * .1) / .05);
        int pennies = (int) ((value - dollars - quarters * .25 - dimes * .1 - nickles * .05) / .01);
        
        System.out.println(value + " can be broken into " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickles + " nickles, and " + pennies + " pennies");
    }
}




