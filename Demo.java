
/* Whichever class in Java belongs to a package */
import java.util.ArrayList;

// import calculator.AdCalc;
// import calculator.Calc;
/* 
*The whole content of the package can be imported with * 
* The * refers to all the files not folders
*/
import calculator.*;

public class Demo {
    public static void main(String[] args) {
        Calc obj = new Calc();
        AdCalc obj1 = new AdCalc();

        ArrayList list = new ArrayList<>();
        /* By default is imported java.lang */
        System.out.println("some string");
    }
}
