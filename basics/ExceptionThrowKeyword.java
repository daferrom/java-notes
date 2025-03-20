public class ExceptionThrowKeyword {
    public static void main (String[] args) {

        System.out.println("Hello from  ExceptionThrowKeyword");

        /* Types of errors
            *  1) Compile time errors // the code does not compile
            *  2) Run time errors // the code runs but the output is not what you expected // Handled by exceptions
            *  3) Logical errors // the code runs but the output is not what you expected
         */

        /*
          * Normal statements
          * Critical statements
        */


            int i = 20;
            int j = 0;
            int nums[] = new int[5];

            try {
                j = 18/i;
                if(j==0){
                    throw new ArithmeticException("Cannot divide by zero");
                }

            }
            /* catch the error instantiating an Exception error class
             * Try Catch block allows to continue the execution of the code
            */
            catch(ArithmeticException e) {
                j = 18/1;
                System.out.println("That the default output : " + e);
            }
            catch(Exception e){
                System.out.println("Something Went Wrong. Error: " + e);
            }


            System.out.println("Result: " + j);
    }
}
