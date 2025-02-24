class A
{
    public A()
    {
        /* Every class in Java extends  the object class */
        super();
        System.out.println("In A");
    }
    public A(int n)
    {
        super();
        System.out.println("in A int");
    }
}

class B extends A {
    public B()
    {
        /* Every constructor has a "super" method even if its not explicitly mentioned */
        /* Call the constructor of a superclass  in this case
         * class A constructor
        */
        super();
        System.out.println("in B");
    }

    public B(int n)
    {   
        /* this() executes the constructor of the same class */
        this();
        System.out.println("In B int");
    }
}

public class ThisAndSuperMethod
{ 
    public static void main(String a[])
    {
        B obj = new B(5);
    }
}
