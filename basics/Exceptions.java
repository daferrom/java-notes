public class Exceptions {
    public static void main (String[] args) {

        /* Types of errors
            *  1) Compile time errors // the code does not compile
            *  2) Run time errors // the code runs but the output is not what you expected // Handled by exceptions
            *  3) Logical errors // the code runs but the output is not what you expected
         */

        /*
          * Normal statements
          * Critical statements
        */

        System.out.println("Hello from  Exceptions");

            int i = 2;
            int j = 0;
            int nums[] = new int[5];

            try
            {
                j = 18/i;
                System.out.println(nums[1]);
                System.out.println(nums[5]);

            }
            /* catch the error instantiating an Exception error class 
             * Try Catch block allows to continue the execution of the code
            */
            catch(ArithmeticException e)
            {
                System.err.println("Cannot divide by zero");
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.err.println("Array Index Out of Bounds");
            }
            /*
             * PArent class exception should be at the bottom
             */
            catch(Exception e)
            {
                System.err.println("Something Went Wrong. Error: " + e);
            }
            /*
             * Exception is the parent class of all the exceptions
            */
            // catch(Exception e)
            // {
            //     if(e instanceof ArithmeticException)
            //     {
            //         System.out.println("Cannot divide by zero");
            //     }
            //     else if(e instanceof ArrayIndexOutOfBoundsException)
            //     {
            //         System.out.println("Array Index Out of Bounds");
            //     }
            //     else
            //     {
            //         System.out.println("Something Went Wrong. Error: " + e);
            //     }
            // }

            System.out.println("Result: " + j);
    }
}
