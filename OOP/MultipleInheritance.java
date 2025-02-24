class A {
    public int methodInA(){
        return 1;
    }
}

class B extends A{
    public int methodInB(){
        return 1;
    }
}


/*
 * MUltiple inheritance is not allowed in Java
 * Because it creates Ambiguity problem
 * Then Java removes the featrue with ambiguity
 */


class C extends A , B {  //THIS IS NOT A VALID SYNTAX IN JAVA !!! //
    public int methodInC(){
        return 1;
    }
}





public class MultipleInheritance 
{ 
    public static void main(String a[]) {

    } 
}
