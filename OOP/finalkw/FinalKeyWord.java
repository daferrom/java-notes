// final  variable, method, class //

final class Calc
{
    public void show()
    {
        System.out.println("In calc Show");
    }


    public void add(int a, int b)
    {
        System.out.println(a + b);
    }
}

class CalcExt
{
    /*
     * Here Final Stops the overrinding of the show method
     */
    public final void show()
    {
        System.out.println("By Diego");
    }


    public void add(int a, int b)
    {
        System.out.println(a + b);
    }
}


/* The type AdvCal cannot subclass the final class Calc 
* because the class has "final" keyword 
* final stops the inheritance
*/ 

// class AdvCal extends Calc
// {

// }

class AdvCal2 extends CalcExt 
{
    /* Adding "final" to the show() method of the parent class
     * The method can not be overrided
     */
    // public void show()
    // {
    //     System.out.println("By CalcExt");
    // }
}




public class FinalKeyWord {
    public static void main(String a[])
    {   
        /* final keyword
         *  makes the variable a constant it means
         * It can not be reassigned
         */
        final int num = 8;
        // num = 9; // num can't be reassigned is constant
        System.out.println(num);

        Calc obj = new Calc();
        obj.show();
        obj.add(4,5);

        AdvCal2 obj1 = new AdvCal2();
        obj1.show();
        obj1.add(4,5);

    }
}

// final  variable, method, class //