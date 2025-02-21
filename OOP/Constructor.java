class Human {
    private int age;
    private String name;

    /* Constructor
     * It looks like a method itself
     * The constructor method  the same name of the class
     * It doest returns anything
     * It is called when the class in instantiated
     * each time that an object of the calss is created
    */

    public Human()
    {
        /* The DB connection is usually initialized on the constructor */
        age = 12;
        name = "John";
        System.out.println("In constructor");
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public void setName(String b) {
        this.name = b;
    }
}

public class Constructor {
    public static void main(String[] args) {

        Human obj1 = new Human();
        
        System.out.println(obj1.getName() + " : " + obj1.getAge()); // null : 0

        obj1.setAge(30);
        obj1.setName("Diego");

        System.out.println(obj1.getName() + " : " + obj1.getAge()); // Diego : 30
    }
}
