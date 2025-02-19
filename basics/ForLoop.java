public class ForLoop {
    public static void main(String[] args)
    {
        for(int i=4; i>=1;i--){
            System.out.println("Hi descending numbers" + i);
        }

        for(int i=1; i<4;i++){
            System.out.println("Hi ascending numbers" + i);
        }

        for(int i=1; i<=5;i++)
        {
            System.out.println("Day: " + i);
            for(int j=0; j<=8;j++)
            {
                System.out.println("Time: " + (j + 9) + " - " + (j + 10));
            }
        }

        // while makes sense to reading database files
        // for loop makes senses when tou know the number of iterations (the more frequently used loop)
        // do while loop makes sense when you have to execute the code at least once
    }   
}