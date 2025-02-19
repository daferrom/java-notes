
class Calculator {
    // vara a is an instance variable
    int a = 5;

    public int add(int n1, int n2)
    // n1 and n2 are local variables
    // Every method has its own stack
    {
        int r = n1 + n2;
        return r;
    }
}

public class StackAndHeap {
    public static void main(String[] args) {
        int data = 10;

        int num1 = 4;
        int num2 = 5;

        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();

        // variable reassignment in the instance obj.a made in the Heap
        obj.a = 8;
        int r1 = obj.add(num1, num2);
        System.out.println(r1);

        // variable reassignment only affects the output of the instance
        // Expected output 8 //
        System.out.println(obj.a);

        // The object instantiated with same class doesn't be affected 
        // Expected output 5 //
        System.out.println(obj1.a);
    }
}
