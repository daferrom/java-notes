package accessModifiers.other;

class Launch
{
    public void abc()
    {
        A obj = new A();
        /* marks2 is protected it means it can be accessed in the same package but not from outside */
        System.out.println(obj.marks2);
    }
}

public class A {
    /* Can only be used in the same class */
    private public int marks = 6;
    /* If it is not private or public specified 
    * then its uses default.
    * Default means it can be used in the same package level
    */

    protected int marks2 = 7;

    /* Public can be used everywhere */
    public void show()
    {

    }
}
