class A {
    public A()
    {
        System.out.println("Object created");
    }
    public void show(){
        System.out.println("In A show");
    }
}

public class AnonymousObject
{ 
    public static void main(String a[])
    {
        int marks;
        marks = 99;

        // A obj;
        // obj =
        // This is created the object just in the Heap not in the stack//
        new A(); // Anonymous Object

        new A().show(); // Anonymous object method call

        // This is the regular way a reference object //
        // obj = new B();
        // obj.show();
    }
}
