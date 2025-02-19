class Calculator
{
    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }
    // This is method overloading several methods with the same name but different number or types of parameters
    public double add(double n1, int n2)
    {
        return n1 + n2;
    }
}

public class MethodOverloading
{
    public static void main(String args[])
    {
        double numd = 3.56;
        Calculator obj = new Calculator();
        int r1 = (int) obj.add(numd,45);
        System.out.println(r1);
    }
}