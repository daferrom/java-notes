interface Computer
{
    void code();
}


class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code , compile ,run");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code, compile and run faster");
    }
}


class Developer
{
    public void devApp(Computer comp)
    {
        System.out.println("...coding");
        comp.code();
    }
}

public class InterfaceClass {
    public static void main (String[] args) {
        System.out.println("Hello from InterfaceClass");

        Computer lap = new Laptop();
        Computer desktop = new Desktop();

        Developer diego = new Developer();
        diego.devApp(lap);
    }
}
