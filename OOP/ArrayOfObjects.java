class Student {
    int rollno;
    String name;
    int marks;
}



public class ArrayOfObjects {
    public static void main(String args[])
    {
        // int nums[] = new int[6];

        // nums[0] = 4;
        // nums[1] = 8;
        // nums[2] = 3;
        // nums[3] = 9;

        // for(int i=0; i<nums.length; i++)
        // {
        //     System.out.println(nums[i]);
        // }

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Diego";
        s1.marks = 36;

        Student s2 = new Student();
        s2.rollno = 1;
        s2.name = "Yenni";
        s2.marks = 76;

        Student s3 = new Student();
        s3.rollno = 1;
        s3.name = "Alice";
        s3.marks = 97;

        // Here are creating an array that can hold student references //
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length; i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }
    }
}
