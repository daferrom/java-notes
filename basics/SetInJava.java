
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class SetInJava {
    public static void main (String[] args) {
        System.out.println("Hello from  SetInJava");


        /* Collection Interface
         * Sometimes you want a collection that supports unique values
         * Set is a collection of unique values
         * Set extends from Collection Interface
         * Collection implemenst interface Iterable
         */

        // Set<Integer> nums = new HashSet<Integer>();
        /* IF you want sorted values you can uise TreeSet */
        Set<Integer> nums = new TreeSet<Integer>();

        nums.add(6);
        nums.add(54);
        nums.add(84);
        nums.add(2);
        nums.add(6);

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext())
            System.out.println(values.next());

        // for(int n: nums)
        // {
        //     System.out.println(n); 
        //     // 2
        //     // 5
        //     // 6
        //     // 8
        //     // It doesnt print two times the 6 because is a Set
        //     /*
        //      * It doesnt have index of the elements
        //      */
        // }
    }
}
