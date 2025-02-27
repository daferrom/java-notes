class Laptop
{
    String model;
    int price;
    String serial;

    // public String toString()
    // {
    //     return model + " : " + price;
    // }

    


    public boolean equals(Laptop that)
    {
        // if(this.model.equals(that.model) && this.price == that.price)
        //     return true;
        // else
        // return false;

        // return this.model.equals(that.model) && this.price == that.price;

    
    }
    
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + ", serial=" + serial + "]";
    }


    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

}

public class objectClass {
    public static void main(String a[])
    {
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo yoga";
        obj1.price = 2000;

        System.out.println(obj1); // Print the accessible value
        // System.out.println(obj.toString());

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo yoga";
        obj2.price = 2000;

        System.out.println(obj2); // Print the accessible value

        boolean result1 = obj1 == obj2; // It returns false even with the same values on the instance
        
        boolean result2 = obj1.equals(obj2); // it Returns true 


        System.out.println(result1);
        System.out.println(result2);
    }
}
