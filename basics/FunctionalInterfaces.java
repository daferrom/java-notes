/* The @FuntionalInterface annotation guarantees that there's only one method on th interface */

@FunctionalInterface
interface A
{
    void show();
    // void run();
}

// class B implements A
// {
//     public void show()
//     {
//         System.out.println("Hello from B");
//     }
// }






public class FunctionalInterfaces {
    public static void main (String[] args) {
        System.out.println("Hello from  FunctionalInterface");

        // A obj = new B();
        // obj.show();


        A obj = new A()
        {
            public void show()
            {
                System.out.println("In show with an anomymous class implementation");
            }
        };
        obj.show();
    }
}
