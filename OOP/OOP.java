// Object Oriented Programming
// Object - properties and behaviors

// Class : is like blueprint for objects
// JVM creates object from class
// Class is a template for objects

// The programmer creates the class file it gets compile to create  bytecode ,
// Then the bytecode is taken by JVM and it creates the object


class Calculator
{
    // Public means that the method can be accesed from everywhere else
    // Static means that the method belongs to the class and not to the object
    // Void means that the method does not return any value
    // int before the method name means that the method returns an integer
    public int add(int n1, int n2)

    {
        int r = n1 + n2;
        return r;
    }
}

public class OOP
{
    public static void main(String[] args)
        {
            int num1=4;
            int num2=5;

            // int result = num1 + num2; Instead of this line we can call the add method from the Calculator class
            // We can create an object of the class Calculator
            // First mention the class then the object name and then the new keyword and then the class name
            Calculator calc = new Calculator();

            // We can call the add method from the Calculator class
            int result = calc.add(num1, num2);
            System.out.println(result);
        }
}






