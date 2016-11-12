package fileinout;
import java.util.Scanner; 
import java.io.File;
import java.io.PrintWriter;
import java.util.Random;


public class FileInOut {
    
    public static void writeInt(PrintWriter outFile) throws Exception{
        Random rand = new Random();
        
        outFile.print((rand.nextInt(9) + 1)+ " ");
    }
    
    public static void main(String[] args) throws Exception{
        java.io.File file = new java.io.File("C:\\Users\\rmcpartlan01\\Desktop\\in.txt");
        if (file.exists()) {
          System.out.println("File already exists");
          System.exit(0);
        }


        try (java.io.PrintWriter output = new java.io.PrintWriter(file);) {
            for (int i = 0; i < 20; i++){
                writeInt(output);
            }
        }
        
        Scanner reader = new Scanner(file);
        System.out.println(reader.nextLine());
    }
}
