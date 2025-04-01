
/* Thread is a class that implements Runnable */

// class C implements Runnable {
//     public void run()
//     {
//         for(int i=1; i<=5; i++){
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }// wait for 10 miliseconds //
//         }
//     }
// }
// class D implements Runnable {
//     public void run()
//     {
//         for(int i=1; i<=5; i++){
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }// wait for 10 miliseconds //
//         }
//     }
// }

public class RunnableVsThread {
    public static void main (String[] args) {
        System.out.println("Hello from  RunnableVsThread");

        /* Reference of an interface Runnable
         * and object of a class C or D
         * The Runnable interface doesnt have the Thread Methods
         */
        Runnable obj1 = new Runnable() {
            public void run()
            {
                for(int i=1; i<=5; i++){
                    System.out.println("Hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }// wait for 10 miliseconds //
                }
            }
        };

        Runnable obj2 = () -> {
            {
                for(int i=1; i<=5; i++){
                    System.out.println("Hello");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }// wait for 10 miliseconds //
                }
            }
        };

        // Runnable obj2 = new Runnable();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}


