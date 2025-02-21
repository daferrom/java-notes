class Mobile {
    // instance varaiables
    String brand;
    int price;

    // String name;
    /* Adding static keyword to the variable name
    were are making the variable statically common
    for all the instances */

    // static makes the variable or method belongs to the class //


    static String name;


    public void showDetails()
    {
        System.out.println(brand + " : " + name + " : " + price );
    }
    public static void show1()
    {   
        /* You can use a static variable in a static method
        But you can not use not static variables in a static method
         */
        System.out.println("In Static method");
        System.out.println(name);
    }

    /*
     * But What if you need to access not static variables in a static method?
     * 
     */
    public static void show2(Mobile obj)
    {   
        System.out.println("In Static method Show 2 with obj parameter");
        System.out.println(obj.brand + " : " + obj.price + " : ");
    }
}   



public class StaticKeyWordMethods
{ 
    /*
     * The main method must be static because it serves as the program's entry point.
     * If main were not static, an instance of the class would be required to call it,
     * which would not be possible at startup without an already running instance.
     * By making it static, the JVM can invoke it directly without needing an object.
     */
    
    public static void main(String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
          /* Static variables should ideally be accessed using the class name.
       Although they can be accessed through an instance, this is not recommended
       as it reduces readability and may cause confusion. */

        // obj1.name = "SmartPhone"; // Not recommended
        Mobile.name = "Smartphone"; // Correct way to access static variables

    


        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "SmartPhone";

        // with the static keyword on variable name o Mobile class it affects all the instances// 
        // obj1.name = "phone";

        obj1.showDetails();
        obj2.showDetails();

        /* The commented line throwns an error 
            A not static method can not be called from class directly
        */ 
        // Mobile.showDetails();

        /* A Static Method can only be called from the class */
        Mobile.show1();

        
        Mobile.show2(obj1);
    }
}
