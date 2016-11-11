package quizprogram;
public class QuizProgram {
    public static void main(String[] args) {
        Asset[] investments = new Asset[2];
        investments[0] = new Cash(500.00);
        investments[1] = new Cash(5500.00);
        
        for(int i = 0; i < investments.length; i++){
            System.out.println(investments[i]);
            System.out.println("Market value is: " + investments[i].getMarketValue() + ", profit is: " + investments[i].getProfit());
            System.out.println();
        }
        
        if(investments[0].equals(investments[1]))
            System.out.print("The two investments are equal.");
        else
            System.out.print("The two investments are not equal.");
        
        System.out.println();
    }
}


class Cash implements Asset{
    private double amount;
    
    Cash(double amount){
        this.amount = amount;
    }
    
    boolean equals(Asset other){
        if(other.getMarketValue() == amount){
            return true;
        }
            
        return false;
    }
    
    @Override
    public String toString(){
        return "cash@ $" + amount;
    }
    
    @Override
    public double getProfit(){
        return 0.0;
    }
    
    @Override
    public double getMarketValue(){
        return amount;
    }
}


interface Asset{
    double getMarketValue();
    double getProfit();
}
