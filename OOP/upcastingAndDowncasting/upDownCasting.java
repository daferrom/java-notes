class A
{
    public void show1()
    {
        System.out.println("In A show");
    }
}

class B extends A
{
    public void show2()
    {
        System.out.println("In B Show2");
    }
}


public class upDownCasting {
    public static void main(String a[])
    {
        double d = 4.5;
        // Type casting converting the type of a value //
        int i = (int)d;

        System.out.println(d);
        System.out.println(i);

        A obj = new A();
        obj.show1();

        // We can hava as referce of A in  object of B

        /*
        * Upcasting Type casting in a object class A
        * This occurs behind the scenes in java
        */

        A obj1 = (A)new B();
        obj1.show1();


        /* obj is a object of A type
         * (B) makes explicit the casting to Type B for obj3 assigment
         * This is Downcasting
        */
        
        B obj3 = (B) obj;
        obj3.show2();

    }
}
