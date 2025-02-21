class Human {
    // the keyword private makes the variable only accesible in the class //
    /* Everytime we create an instane variable It must be private */

    // private int age = 11;
    // private String name = "Diego";
    // this are instance variables;
    private int age;
    private String name;

    /* The way of access private variables is through a method */

    // Getters returns the current values of a variable //
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // Setters make variable assignments //
    public void setAge(int a) {
        // int a is a local variable
    //     Human obj1 = obj;
    //     obj1.age = a;
    //  "This" Keyword represents the object wher is called the method
        this.age = a;
    }

    public void setName(String b) {
        this.name = b;
    }
}

public class ThisKeyWord {
    public static void main(String[] args) {
        /*
         * keeping it closed
         * 
         * 
         */
        /* Everytime we create an instane variable It must be private */
        Human obj1 = new Human();
        // obj1.age = 11;
        // obj1.name = "Diego";
        // obj1.setAge(30, obj1);
        obj1.setAge(30);
        obj1.setName("Diego");

        /* name can't be accesed directly // System.out.println(obj1.name); */
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}
