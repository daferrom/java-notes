import calculator.VeryAdvCalc;

public class Inheritance {
    public static void main(String a[])
    {
        // It compiles the Calc.class java file //
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(4,5);
        System.out.println(r1);
        int r2 = obj.substract(r1, 3);
        System.out.println(r2);

        int r3 = obj.multi(r1, 3);
        System.out.println(r3);

        int r4 = obj.div(r1, 3);
        System.out.println(r4);

        int r5 = (int)obj.power(2,5);
        System.out.println(r5);


    }
}
