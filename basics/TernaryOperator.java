public class TernaryOperator {
    public static void main(String args[])
    {
        // The commented code can be rewritten as a Ternary Operator
        int n = 4;
        int result = 0;

        // if(n%2==0)
        //     result = 10;
        // else
        //     result = 20;
        // System.out.println(result);

        result = n%2==0 ? 10: 20;

        System.out.println(result);
    }
}