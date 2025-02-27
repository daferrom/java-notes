class A
{
    public void show()
    {
        System.out.println("In A Show");
    }
}
class B extends A
{
    /* If an instance of B is created
    * And the show method is call from the instance
    * it calls Show() from class B
    * overriding the method of  the extended  A
    */
    public void show()
    {
        System.out.println("In B Show");
    }
}
class C extends A
{
    public void show()
    {
        System.out.println("In C Show");
    }
}

public class Demo {
    public static void main(String a[])
    {
        /* 
        * The refering obj of type A
        * but the object can be the class
        */
        // A obj = new B();
        // obj.show();


        /* Which show() is called during the runTime
        OVERRIDING POLYMORFISM
        */

        /* DYNAMIC METHOD DISPATCH */
        A obj = new A(); // "In A Show"
        obj.show(); 

        obj = new B();
        obj.show(); // "In B Show"

        obj = new C();
        obj.show(); // In C Show

        /*This works only because the B and C are subclasses of A */
    }
}