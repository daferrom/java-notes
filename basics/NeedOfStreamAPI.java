import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.Arrays;

public class NeedOfStreamAPI {
    public static void main (String[] args) {
        System.out.println("Hello from  NeedOfStreamAPI");

        List<Integer> nums = Arrays.asList(2,3,4,5,5,7,2);

        // int sum = 0;
        // for(int n : nums){
        //     if(n%2==0)
        //     {
        //         n = n*2;
        //         sum = sum + n;
        //     }
        // }
        // System.out.println(sum);

         // for(int i=0 ; i<nums.size(); i++)
        // {
        //     System.out.println(nums.get(i));
        // }

        /* Stream API allows functionalities like
        * Filter, Map, reduce, collect, etc.
        * It is a new abstraction for processing sequences of elements
        * in a functional style.
        */

        /* ForEach method */
        // nums.forEach(n-> System.out.println(n));

        // Consumer<Integer> consumer = new Consumer<Integer>()
        // {
        //     int sum = 0;
        //     public void accept(Integer n)
        //     {
        //         if(n%2==0)
        //         {
        //             n = n*2;
        //             sum = sum + n;
        //         }
        //         System.out.println(sum);
        //     }
        // };

        // Consumer<Integer> consumer = n -> System.out.println(n);
        // nums.forEach(consumer);

        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n -> n*2);

        // int result = s3.reduce(0, (a,b) -> a+b);

        // s3.forEach(n -> System.out.println(n));
        // System.out.println(nums);
        
        /* this is equivalent to the whole previous lines
         * Stream API allows us to chain operations
         * and write in a more readable way.
         * The filter method is used to filter the elements of the stream
         * like in BigData
         */

        int result = nums.stream()
                        .filter(n -> n%2==0)
                        .map(n -> n*2)
                        .reduce(0, (a,b) -> a+b);


        System.out.println(result);
    }
}
