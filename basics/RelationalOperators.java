package basics;
public class RelationalOperators {
    public static void main(String[] args)
    {   
        int x = 6;
        int y = 7;
        
        boolean result = x > y; // false
        boolean result2 = x < y; // true
        boolean result3 = x >= y; // false
        boolean result4 = x <= y; // true

        boolean result5 = x != y; // true
        boolean result6 = x == y; // false

        System.out.println(result5);


        double a = 8.8;
        double b = 9.8;

        boolean result7 = a >= b; // false

        System.out.println(result7);

        
    }
}