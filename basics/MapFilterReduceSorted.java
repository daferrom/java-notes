import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Function;

public class MapFilterReduceSorted {
    public static void main (String[] args) {
        System.out.println("Hello from  NeedOfStreamAPI");

        List<Integer> nums = Arrays.asList(2,3,4,5,5,7,2);

        // Predicate<Integer> pred = new Predicate<Integer>() {
        //     public boolean test(Integer n){
        //         // if(n%2==0)
        //         //     return true;
        //         // else
        //         //     return false;
        //         return n%2==0;
        //     }
        // };
        

        /*THis is the Same as .Filter */
        Predicate<Integer> pred = n -> n%2==0;
                    // if(n%2==0)
                    //     return true;
                    // else
                    //     return false;

        /*This is the Same as .Map */
        // Function<Integer, Integer> fun = new Function<Integer, Integer>()
        // {
        //     @Override
        //     public Integer apply(Integer n) {
        //         return n*2;
        //     };
        // };
        Function<Integer, Integer> fun = n -> n*2;


        // int result = nums.stream()
        //                 .filter(n -> n%2==0)
        //                 .map(fun)
        //                 .reduce(0, (a,b) -> a+b);

        /* For using with different threads could be used parallelStream
         * Just don't use it with sorted
         * cuz  you're iterating elements to sort
         */
        Stream <Integer> sortedValues = nums.stream()
                        .filter(n -> n%2==0)
                        .sorted();


        sortedValues.forEach(n -> System.out.println(n));
    }
}
