class Counter
{
    int count;
    /*
     * syncronized keyword allows to the Tread method to be call one at time
     */
    public synchronized void increment() {
        count++;
    }
}


public class RaceConditions {
    public static void main (String[] args) throws InterruptedException {
        System.out.println("Hello from  RaceConditions");

            Counter c = new Counter();

            /* Reference of an interface Runnable
             * and object of a class C or D
             * The Runnable interface doesnt have the Thread Methods
             */
            Runnable obj1 = () -> {
                for(int i=1; i<=10000; i++)
                {
                    c.increment();
                }
            };
    
            Runnable obj2 = () -> {
                for(int i=1; i<=10000; i++)
                {
                    c.increment();
                }
            };
    
            // Runnable obj2 = new Runnable();
    
            Thread t1 = new Thread(obj1);
            Thread t2 = new Thread(obj2);
    
            t1.start();
            t2.start();

            t1.join();
            t2.join();
            
            /* Everytime we run this code the output is diferent
            */
            System.out.println(c.count); 


            // We need to wait for the finishing of the Treads

    }
}
