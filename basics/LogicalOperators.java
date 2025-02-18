package basics;
class LogicalOperators {
    public static void main(String[] args) {
        System.out.println("Hello Logical Operators");

        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        // AND
        boolean result1 = x > y && a > b; // false
        boolean result2 = x > y && a < b; // true

        System.out.println(result1);
        System.out.println(result2);

        // OR

        boolean result3 = x < y || a < b; // true
        boolean result4 = x < y || b < a || b > x; // true

        System.out.println(result3);
        System.out.println(result4);

        // NOT

        boolean result5 = (!result4); //false

        System.out.println(result5);

    }
}