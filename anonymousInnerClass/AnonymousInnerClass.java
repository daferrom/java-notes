class A 
{
    public void show()
    {
        System.out.println("In A show");
    }
}

// class B extends A {
//     public void show(){
//         System.out.println("In B Show");
//     }
// }



public class AnonymousInnerClass
{ 
    public static void main(String[] args)
    {
        A obj = new A()
        /* This is AnonymousInnerClass
         * the design is applied here
         * Here the method is provided overriding the original class
         */
        {
            public void show(){
                System.out.println("In B Show");
            }
        };
        
        obj.show();
    }
}
