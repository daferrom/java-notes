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
}   



public class StaticKeyWord
{ 
    public static void main(String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        /* Static variables should be called with the class name
        can be called with the instance name but it isn't a good practice */
        // obj1.name = "SmartPhone";
        Mobile.name = "Smartphone";

    


        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        Mobile.name = "SmartPhone";

        // with the static keyword on variable name o Mobile class it affects all the instances// 
        // obj1.name = "phone";

        obj1.showDetails();
        obj2.showDetails();
    }
}
