package basics;
class Hello {
    public static void main(String args[])
    {
        /*int num1 = 3;
        int num2 = 5;
        int result = num1 + num2;
        System.out.println(result); */


        /* Primitive Data types */
        // int num1 = 9;
        // byte by = 127;
        // short sh = 558;
        // long l = 5854l;
        // float f = 5.8f;
        // double b = 5.8;

        // char c = 'k';

        // boolean myb = true;

        // int num1 = 0b101; // Binary

        // int num1 = 0x7E; // Binary

        // int num1 = 10_00_00_000; // Binary

        // double num1 = 56;

        // double num1 = 12e10;

        // System.out.println(num1);

        // Literals example //

        // char myChar = 'd';
        // myChar++;
        // expected output d //
        // System.out.print(myChar);

        // byte b = 125;

        // Type casting

        int a = 257;
        // This makes an explicit type casting
        // 257 % 256 = 1

        byte k = (byte)a;
        // expected output 1
        System.out.println(k);

       float f = 5.6f;
       // This makes an explicit type casting
       int t = (int)f;
        // expected output 5
       System.out.println(t);

       byte d = 10;
       byte e = 20;
        // Java compiler makes an promotion of the result
       int result = d * e;

       System.out.println(result);
    }
}








