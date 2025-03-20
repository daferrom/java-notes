class C extends Thread {
    public void run()
    {
        for(int i=1; i<=100; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }// wait for 10 miliseconds //
        }
    }
}
class D extends Thread {
    public void run()
    {
        for(int i=1; i<=100; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }// wait for 10 miliseconds //
        }
    }
}

public class ThreadPriorityAndSleep {
    public static void main (String[] args) {
        System.out.println("Hello from  ThreadPriorityAndSleep");

        System.out.println("Hello from  MultipleThreads");

        C obj1 = new C();
        D obj2 = new D();


        /* YOu you want to make your objects threads 
         * For example to run it in parallel
         * start is method blengs to Thread class
         * every Thread needs its run method 
         * Behind the scenes the machine is excuting the Treads on parallel
         */
        /* Priority goes  less (1) to top priority (10)*/

        // this suggest the priorit but the scheduller decides //
        // obj2.setPriority(Thread.MAX_PRIORITY);

        // System.out.println(obj1.getPriority()); // some number between 1 - 10

        obj1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }// wait for 10 miliseconds //
        obj2.start();
    }
}

