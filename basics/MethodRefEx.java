import java.util.Arrays;
import java.util.List;


public class MethodRefEx {
    public static void main (String[] args) {
        System.out.println("Hello from  MethodRefEx");

        List <String> names = Arrays.asList("Navin", "Harsh", "John");

        // List <String> upperNames = names.stream()
        //                                 .map(name -> name.toUpperCase())
        //                                 .toList();


        /* This is call method reference 
         * passing a function as a param as refererence
         */
        List <String> upperNames = names.stream()
                                        .map(String::toUpperCase) // This is calling UpperCase as a method reference from String class
                                        .toList();

        // System.out.println(upperNames);
        upperNames.forEach(System.out::println); // this is calling as ref the method "println" form "System.out"
    }
}
