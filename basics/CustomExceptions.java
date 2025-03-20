class MyCustomException extends Exception {
    
    public MyCustomException(String message) {
        super(message);
    }
}




public class CustomExceptions {
    public static void main (String[] args) {
        System.out.println("Hello from  CustomExceptions");

            int i = 20;
            int j = 0;
            int nums[] = new int[5];

            try {
                j = 18/i;
                if(j==0){
                    throw new MyCustomException("Cannot divide by zero");
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
