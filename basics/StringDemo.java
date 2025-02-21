class StringDemo
{
    public static void main(String a[]) {
        // String are always in double quotes
        String name = new String("Diego");
        String name2 = "Alejandro";
        // it should print Diego
        System.out.println(name);

        // hash cde of trings creates the hashed numeri version of the String forlloing the formula 
        // hash=s[i]^(n−1)
        System.out.println(name.hashCode());
        System.out.println(name2);

        // Concatenator in Strings
        System.out.println("Hello " + name);

        System.out.println(name.concat(" Ferro"));

        System.out.println(name.charAt(0));

        //
        String s1 = "Yenni";
        String s2 = "Yenni";

        System.out.println(s1 == s2);

        /* A string literal is always a constant in Java
            this saves memory
            The string is created in the String constant pool inside the Heap of JVM
            Unused candidates are elllegible for garbage collector to save memory
            by default Strings are unmutable in java
        */

        // String Buffer and String builder are mutable Strings //

        StringBuffer sb = new StringBuffer("Hi");
        // It brings extra space //
        System.out.println("String buffer capacity in characters: " + sb.capacity());
        // The length is 2 for "Hi"
        System.out.println("Length of the StringBuffer sb: " + sb.length());

        sb.append(" Diego");

        System.out.println("Modified sb: " + sb);

        //A StringBuffer can be converted to String //
        // String str = sb.toString();

        sb.deleteCharAt(0);

        System.out.println("Modified by deleteCharAt: " + sb);

        sb.insert(6,"Java");

        System.out.println("Modified by insert: " + sb);

        sb.setLength(30);
        
        System.out.println("Modified by setLength: " + sb);

        sb.ensureCapacity(100);
        
        System.out.println("Modified by setLength: " + sb);
        
        // String Buffer is thread safe and String Builder is not//

        // String Builder //

        /* Use String Builder when:
            You repeteadly want to modify String in the same method
            For building big amount of text
            there isn't a big deal the synchronization between threads
        */

        StringBuilder sbd = new StringBuilder("Hola");

        sbd.append(" Mundo");
        sbd.insert(5, "Java ");
        sbd.replace(0, 4, "Hola,");
        sbd.delete(10, 15);
        System.out.println(sbd.toString()); // Salida: "Hola, Java"

        
    }
}