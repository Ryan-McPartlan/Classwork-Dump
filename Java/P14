/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flip.a.coin;
import java.util.Random;
/**
 *
 * @author rmcpartlan01
 */
public class FlipACoin {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random generator = new Random();
        int flip;
        String side;
        
        for(int i = 0; i < 50; i++)
        {
            flip = generator.nextInt(2) + 1;
            if(flip == 1){
                side = "tails";
            }
            else
                side = "heads";
            
            
            System.out.println("The result of flip #" + (i + 1) + " is " + side);
        }
    }
    
}




