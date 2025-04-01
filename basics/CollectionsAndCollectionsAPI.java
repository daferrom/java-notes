import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionsAndCollectionsAPI {
    public static void main (String[] args) {
        System.out.println("Hello from  CollectionsAndCollectionsAPI");


        /* Collection Interface
         * Belongs to java.util package
         * Collection API works with objects
         * The angular brackets <> especifies the collection members Integers
         * Always mention the type in collections, ALWAYS!!!!!
         * ArrayList is an implementation of List
         */

        // Collection<Integer> nums = new ArrayList<Integer>();
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);


        System.out.println(nums.get(2));
        System.out.println("The index of 2 is :" + nums.indexOf(2));

        for(int n: nums)
        {
            System.out.println(n);
        }
        System.out.println(nums); // [6, 5, 8, 2]


    }
}
