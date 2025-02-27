
/* Whichever class in Java belongs to a package */
import java.util.ArrayList;

import accessModifiers.other.*;

// import calculator.AdCalc;
// import calculator.Calc;
/* 
*The whole content of the package can be imported with * 
* The * refers to all the files not folders
*/
import calculator.*;

class C extends A {

    public void abc()
    {   
        /* marks2 a protected variabe can be accesed in other packages
        * Onlu thought a subclass
        */
        System.out.println(marks2);
    }
}

public class Demo {
    public static void main(String[] args) {
        /*
            We are creating an A instance object through
            accessModifiers.other.*
        */
        A obj = new A();
        B obj1= new B();
        System.out.println(obj.marks);

        /* marks2 is not visible because is not protected */
        System.out.println(obj.marks2);

        /* B instance variables are accesible from here because
        The B.java file is in the same level not a different package
        */
        // System.out.println(obj1.marks);

        System.out.println(obj.marks2);
    }
}
