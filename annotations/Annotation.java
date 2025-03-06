
class A
{

    public void showTheDataWhichBelongsTothisClass()
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    /* Override annotation */
    @Override
    public void showTheDataWhichBelongsTothisClass()
    {
        System.out.println("in B show");
    }
}




public class Annotation {
    public static void main (String[] args) {
    /* A supplement to the compiler or the runtime
     * Supply extra information, metadata
     * You can create tyou own annotations
     * Pure Java doestn implement to much annotations
     * Frameworks implements a lot of annotations
     */

        System.out.println("Hello from  Annotation");

        B obj = new B();
        obj.showTheDataWhichBelongsTothisClass();


    }
}
