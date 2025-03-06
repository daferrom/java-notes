/*
 * Interface is not a class
 * by default every method in an Interface is public abstract
 * 
 */

import annotations.A;
import annotations.B;

interface A
{
    /* The variables on an interface are final and static */
    int age = 10;
    String area = "Pital";
    void show();
    void config();
}

class B implements A
{
    public void show()
    {
        System.out.println("In show");
    }

    public void config()
    {
        System.out.println("In config");
    }
}

public class Interfaces {
    public static void main (String[] args)
    {
        System.out.println(" Hello from  Interfaces !!!!!!");

        A obj;
        obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.age);
        System.out.println(A.area);

        // A.area = "El Agrado"; // variable age of the interface can not be reassigned is static and final //
    }
}
