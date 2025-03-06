/*
 * Interface is not a class
 * by default every method in an Interface is public abstract
 * class - class -> extends
 * class - interface -> implements
 * interface - interface -> extends
 */

 interface A
 {
     /* The variables on an interface are final and static */
     int age = 10;
     String area = "Pital";
     void show();
     void config();
 }

 interface X
 {
    void run();
 }

interface Y extends X
{

}


/* A class can implement multiple interfaces
 * 
 */

 class B implements A  ,Y
 {
     public void show()
     {
         System.out.println("In show");
     }
 
     public void config()
     {
         System.out.println("In config");
     }

     public void run()
     {
        System.out.println("...running");
     }
 }
 
 public class Interfaces2 {
     public static void main (String[] args)
     {
         System.out.println(" Hello from  Interfaces !!!!!!");
 
         A obj;
         obj = new B();
         obj.show();
         obj.config();
        //  obj.run(); // this brings an error because the is a B instance of type A and run() in on X interface
        
        X obj1 = new B();
        /* obj1.run() works because the X type has the method run() */
        obj1.run(); // 

        System.out.println(A.age);
        System.out.println(A.area);
 
         // A.area = "El Agrado"; // variable age of the interface can not be reassigned is static and final //
     }
 }
 