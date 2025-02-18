package basics;
class ConditionalStatements {
    public static void main(String[] args){
        // int x = 28;
        // int y = 7;

        // if(x>10 && x<=20) // 11 -20
        //     System.out.println("Hello");
        // else
        //     System.out.println("Bye");


        int x = 8;
        int y = 7;
        int z = 9;

        if(x>y && x>z) /*{
            // For more that one statement, use curly braces */
            System.out.println(x);
            /* System.out.println("Hey this is an if with multiple statements");
        }*/
        else if(y>z)
            System.out.println(y);
        else
            System.out.println(z);
    }
}