import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    
}

public class ConstructorRef {
    public static void main (String[] args) {
        System.out.println("Hello from  ConstructorRef");


        List <String> names = Arrays.asList("Navin", "Harsh", "John");

        List <Student> students = new ArrayList<>();

        // for(String name : names){
        //     students.add(new Student(name));
        // }

        /* Also you can do it with Stream API */
        // students = names.stream()
        //                     .map(name -> new Student(name))
        //                     .toList();

        /* Also you can do it with  */

        students = names.stream()
                        .map(Student::new) // THIS IS constructor reference is a type of method refernece
                        .toList();

        System.out.println(students);
    }
}
