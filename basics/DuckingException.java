// class A {
//     public void show() {
//         try {
//             Class.forName("DuckingException");
//         }
//         catch(ClassNotFoundException e) {
//             System.out.println("!!!!!!! NOT ABLE TO FIND CLASS !!!!!!!" + e );
//         }
//     }
// }
class A {
        public void show() throws ClassNotFoundException {
            Class.forName("DuckingsdldfldfException");
        }
    }

public class DuckingException {

    static{
        System.out.println("Class Loaded");
    }
    public static void main (String[] args) {
        System.out.println("Hello from  DuckingException");

        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
