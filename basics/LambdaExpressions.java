/* The @FuntionalInterface annotation guarantees that there's only one method on th interface */

@FunctionalInterface
interface A
{
    void show(int a);
    // void run();
}

// class B implements A
// {
//     public void show()
//     {
//         System.out.println("Hello from B");
//     }
// }







public class LambdaExpressions {
    public static void main (String[] args) {
        System.out.println("Hello from  LambdaExpressions");


        /*The Code below is lambda expression 
        *
        */
        A obj = (i) -> System.out.println("In show with a lambda expression : " + i);
        obj.show(5);
    }
}


