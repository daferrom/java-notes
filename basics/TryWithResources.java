import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main (String[] args) throws NumberFormatException, IOException {
        System.out.println("Hello from  TryWithResources");

        int i = 0;
        int j = 0;
        int num = 0;

        // try {
        //     j = 18/2;
        // }
        // catch(Exception e){
        //     System.out.println("Something went wrong");
        // }
        // finally {
        //     System.out.println("Bye");
        // }
        // BufferedReader br = null;

        // try {
        //     InputStreamReader in = new InputStreamReader(System.in);
        //     br = new BufferedReader(in);
        //     num = Integer.parseInt(br.readLine());
        //     System.out.println(num);
        //     br.close();
        // }
        // finally {
        //     /* Finally is used to close the resource */
        //     br.close();
        //     System.out.println("2nd BYE finally");
        // }

        /* TRY WITH RESOURCES  
         * The Resource autoclosables is added as parameter
         * No need of closing it in finally block
        */

        try(BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)))
        {
            num = Integer.parseInt(br1.readLine());
            System.out.println(num);
        }

    }
}
