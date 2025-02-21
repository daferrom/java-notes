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

    /* If a Default constructor is not specified explicitly
     * it still works because Java creates one behind the Scenes
     */

    

    public Human() // Default constructor
    {
        /* The DB connection is usually initialized on the constructor */
        age = 12;
        name = "John";
        System.out.println("...constructor initialized");
    }

    public Human(int age, String name)  // Parametrized Constructor
    {
        this.age = age;
        this.name = name;
    }

    // public Human(int a, String n) // Parametrized Constructor
    // {
    //     /* The DB connection is usually initialized on the constructor */
    //     age = a;
    //     name = n;
    //     System.out.println("...constructor initialized");
    // }


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

public class Constructor2 {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getName() + " : " + obj.getAge()); // null : 0

        Human obj1 = new Human(28, "Yenni");
        System.out.println(obj1.getName() + " : " + obj1.getAge()); // null : 0

    }
}
