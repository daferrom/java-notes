import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>
{
    int age;
    String name;

    

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }



    @Override
    public String toString(){
        return "Student [age=" + age + ", name=" + name + "]";
    }



    public int compareTo(Student that) {
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class SortingCollection {
    public static void main (String[] args) {
        System.out.println("Hello from  SortingCollection");

        List<Integer> nums = new ArrayList<>();
        nums.add(41);
        nums.add(82);
        nums.add(53);
        nums.add(22);
        nums.add(39);

        // Collections.sort(nums);

        /* Sorting base on the last digit */

        /* Comparator is an Interface */

        Comparator<Integer> com = new Comparator<Integer>()
        {
            public int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(nums, com);
        System.out.println("Sorted List: " + nums);


        /* This Cna be implemented in a lambda function */
        // Comparator<Student> compStuds = new Comparator<Student>()
        // {
        //     public int compare(Student i, Student j)
        //     {
        //         if(i.age > j.age)
        //             return 1;
        //         else
        //             return -1;
        //     }
        // };

        Comparator<Student> compStuds = (Student i, Student j) -> i.age > j.age?1:-1;
            // {
                // if(i.age > j.age)
                //     return 1;
                // else
                //     return -1;
            // };


        List<Student> studs = new ArrayList<>();

        studs.add(new Student(21, "Diego"));
        studs.add(new Student(12, "Yenni"));
        studs.add(new Student(18, "Rey"));
        studs.add(new Student(20, "Aguedita"));

        /* Sorting base on the length of the string */


        Collections.sort(studs, compStuds);
        System.out.println("Sorted Students by age: " + studs);

        for(Student s: studs)
            System.out.println(s);
    //     Comparator<String> compLength = new Comparator<String>() {
    //         {
    //             public int compare(Integer i, Integer j)
    //             {
    //                 if(i.length() > j.length())
    //                     return 1;
    //                 else
    //                     return -1;
    //             }
    //         }
    //     };

    }
}
