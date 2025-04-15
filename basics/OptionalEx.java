import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {
    public static void main (String[] args) {
        System.out.println("Hello from  OptionalEx");

        List <String> names = Arrays.asList("Diego", "Yenni", "Aguedita", "Heiner");
    
        /* Optional exception introduces in java 1.8
         * with the purpouse of not found hte value and its returned null
         * Optional can be empty or can have some values
         * this avoid the error NullPointerException
         */
        
        // Optional <String> name = names.stream()
        //                     .filter(str -> str.contains("Y"))
        //                     .findFirst();

        // System.out.println(name.get());
        /*
         * orElse allows
         * In the case there wasn't found  a value then it prints "Not Found"
         */
        // System.out.println(name.orElse("Not found"));

        /* The other way to do this with the optional class
        * is with the orElse at the end
         */
        String name = names.stream()
                            .filter(str -> str.contains("x"))
                            .findFirst()
                            .orElse("Not Found");

        System.out.println(name);

    }
}
