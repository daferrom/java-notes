import calculator.Calc;

class A
{
    public void show()
    {
        System.out.println("In A show ");
    }
    public void config()
    {
        System.out.println("In A Config");
    }
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
}
class B extends A 
{
    /*This overrides the show method of Class A */
    public  void show(){
        System.out.println("in B Show");
    }
}

class AdvCalc extends Calc
    {
        /*This overrides the add method of Class A 
         * METHOD OVERRIDING
        */
        public int add(int n1, int n2)
        {
            return n1 + n2 + 1;
        }
    }


public class MethodOverriding
{ 
    public static void main(String a[])
    {
        B obj = new B();
        obj.show();
        obj.config();

        AdvCalc obj1 = new AdvCalc();
        int res = obj1.add(3,4);
        System.out.println(res);
    }
}
