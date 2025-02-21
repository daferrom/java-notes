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

    /* Static Block only be called once 
    * It is used to call static variables
    */ 

    static
    {
        name= "Phone";
        System.out.println("in static block");
    }

    // Mobile constructor
    public Mobile()
    {
        brand = "";
        price = 200;
        /*
        * We could initialize name variable each
        time the contructor intanciates an Mobile object
        but we dont' want that instead we will use static block
        */
        
        // name = "Phone";
        System.out.println("in constructor");
    }


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



public class StaticBlock
{ 
    /*
     * The main method must be static because it serves as the program's entry point.
     * If main were not static, an instance of the class would be required to call it,
     * which would not be possible at startup without an already running instance.
     * By making it static, the JVM can invoke it directly without needing an object.
     */
    
    public static void main(String args[]) throws ClassNotFoundException
    {
        //Java has Class for calling static block without creating an instance //
        Class.forName("Mobile"); // "in static block"

        // The class loader with the static block is called and then the object is instantiated 
        // when an object is created

        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1500;
        // Mobile.name = "SmartPhone";

        // Mobile obj2 = new Mobile();
        // obj2.brand = "Apple";
        // obj2.price = 1500;
        // Mobile.name = "SmartPhone";

        // System.out.println(Mobile.name);
        // System.out.println(Mobile.name);
    }
}
