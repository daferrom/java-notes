class A extends Thread {
    public void run()
    {
        for(int i=1; i<=100; i++){
            System.out.println("Hi");
        }
    }
}
class B extends Thread {
    public void run()
    {
        for(int i=1; i<=100; i++){
            System.out.println("Hello");
        }
    }
}



public class MultipleThreads {
    public static void main (String[] args) {
        System.out.println("Hello from  MultipleThreads");

        A obj1 = new A();
        B obj2 = new B();

        

        /* YOu you want to make your objects threads 
         * For example to run it in parallel
         * start is method blengs to Thread class
         * every Thread needs its run method 
         * Behind the scenes the machine is excuting the Treads on parallel
         */

        obj1.start();
        obj2.start();
    }
}
