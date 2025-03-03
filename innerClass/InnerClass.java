class A
{
    int age;
    
    public void show()
    {
        System.out.println("in B");
    }
    
    static class B
    {
        public void config()
        {
            System.out.println("In config");
        }
    }
}

public class InnerClass
{
    public static void main(String[] args)
    {

        /*To instantiate a B class you need first an instance of A 
         * Because is not an static metho
        */
        
        A obj1 = new A();
        obj1.show();

        // A.B obj2 = obj1.new B(); // In config
        // obj2.config();


        /* Other way is make the inner class static */

        A.B obj3 = new A.B();
        obj3.config();
    }
}
