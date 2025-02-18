package basics;
class ArithmeticOperators {
    public static void main(String args[])
    {
        System.out.println("Hello Arithmetic Operators");

        int num1 = 7;
        // int num2 = 5;

        // int result = num1 % num2;

        // int sumResult = num1 + num2;
        // int subsResult = num1 - num2;
        // int mulResult = num1 * num2;
        // int divResult = num1 / num2;
        // int modResult = num1 % num2;

        // num1 = num1 + 2;
        // num1 += 2;
        // num1 -= 2;
        // num1 *= 2;
        // num1 /= 2;
        // num1 %= 2;

        // increment
        // num1++; // post increment
        // decrement
        // num1--;

        // ++num1;  // pre increment

        // int result = ++num1; // first increment and then fetch the value
        // pre increment expected output 8

        int result = num1++; // fetch the value and then increment
        // post increment expected output 7


        System.out.println(result);
    }
    
}
