public class Loops 
{
    public static void main(String args[])
    {
        // loop : while, do while , for
        // Loops depends on how many times you want to execute the code or
        // or execute the code until the condition is true

        // while loop
        int i = 1;

        while(i <= 5){
            System.out.println("Hi " + i);
            int j = 1;
            while(j <= 3)
            {
                System.out.println("Hello");
                j++;
            }
            i++;
        }

        System.out.println("Bye" + i);
    }
}