class Human
{   
    // the keyword private makes the variable only accesible in the class //
    /* Everytime we create an instane variable It must be private  */
    
    // private int age = 11;
    // private String name = "Diego";
    private int age;
    private String name;

    /*The way of access private variables is through a method */

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int a)
    {
        age = a;
    }

    

    public void setName(String b)
    {
        name = b;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        /* keeping it closed
         * 
         * 
         */
         /* Everytime we create an instane variable It must be private  */
         Human obj1 = new Human();
        //  obj1.age = 11;
        //  obj1.name = "Diego";
        obj1.setAge(30);
        obj1.setName("Diego");


        /* name can't be accesed directly  //  System.out.println(obj1.name);*/
         System.out.println(obj1.getAge());
         System.out.println(obj1.getName());
    }
}
