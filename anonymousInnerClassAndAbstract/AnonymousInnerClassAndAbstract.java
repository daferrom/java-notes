abstract class A
{
    public abstract void show();
    public abstract void config();
}


public class AnonymousInnerClassAndAbstract
{
    public static void main(String[] args)
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("In the new show");
            }
            public void config()
            {
                System.out.println("Here we are in config ...");
            }
        };

        obj.show();
        obj.config();
    }
}
