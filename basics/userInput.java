import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class userInput {
    public static void main (String[] args) throws IOException {
        /* println is a method of PrintStream
         * The PrintStream instance is already create is the out object
         * out is created as a static variable od the SYstem class
        */


        System.out.println("Hello from  userInput");

        // System.out.println("Enter a number");
        // /* read returns the Ascii value */
        // int num = System.in.read();
        // /* This brings the Ascii value 
        //  *  -48 substracts the 
        // */
        // System.out.println(num - 48);

        /* A Better option to avoid that is Bufferedreader */

        InputStreamReader in = new InputStreamReader(System.in);

        /* BufferReader takes is value from  
        * whatever place not only from a file for example
        * bf is a resource 
        */
        // BufferedReader bf = new BufferedReader(in);

        // int num = Integer.parseInt(bf.readLine()) ;
        // System.out.println(num);

        // // A good practice is to close the resource //
        // bf.close();
    

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        System.out.println(num1);

        sc.close();


    }
}
