public class WrapperClass 
{ 
    public static void main(String args[]) 
    {
        /* Wrapper Classes
         * Primitive values doesnt extend ObjectClass
         * Collection framework similiar to Array with multiple variables
         * For ecery primitive we have a Class for it like
         * int > Integer
         * char > Character
         * double > Double
         */


         int num = 7;
        //  Integer num1 = new Integer(8); // Deprecated Syntax
        Integer num1 = 8;

         System.out.println(num1);

        int num2 = 7;
        Integer num3 = num2; // autoboxing

        System.out.println(num3.intValue()); // Unboxing

        String str = "12";
        int num4 = Integer.parseInt(str);

        System.out.println(num4*2);
    }
}
