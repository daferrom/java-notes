/* The @FuntionalInterface annotation guarantees that there's only one method on th interface */

@FunctionalInterface
interface B
{
    int add(int a, int b);
}

// class B implements A
// {
//     public void show()
//     {
//         System.out.println("Hello from B");
//     }
// }




public class LambdaExpressionsWithReturn {
    public static void main (String[] args) {
        System.out.println("Hello from  LambdaExpressions");

        /* The default lambada expresions with only one statement has only one return */
        B obj = (int i, int j) ->  i + j;


        int result = obj.add(5,4);
        System.out.println("Result: " + result);
    }
}

