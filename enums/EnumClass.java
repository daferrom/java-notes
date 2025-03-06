/*Enum can not be extended in another Class */

enum Laptop {
    /* this loks like constructor */
    Macbook(2000), XPS(2200), Surface(), Thinkpad(1800);

    private int price;

    private Laptop() {
        System.out.println("Default Laptop constructor called by: " + this.name() );
        price = 500;
    }

    /* This is the Laptop constructor */
    private Laptop(int price) {
        System.out.println("In Laptop parametrized constructor: " + this.name());
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}




public class EnumClass {
    public static void main (String[] args) {
        System.out.println("Hello from  EnumClass");

        Status s = Status.Running;

        System.out.println(s.getClass().getSuperclass()); // class java.lang.Enum


        Laptop laptop1 = Laptop.Macbook;

        // System.out.println(laptop1 + " : " + laptop1.getPrice()); // 2000

        for(Laptop lap: Laptop.values())
        {   
            // int priceB = 2000;
            // lap.setPrice(priceB + 1000);
            System.out.println(lap + " : " + lap.getPrice()); // 2000
        }


    }
}
