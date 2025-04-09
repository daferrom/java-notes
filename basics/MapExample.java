import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExample {
    public static void main (String[] args) {
        System.out.println("Hello from  MapExample");

        /* Map Interface
         * A map is a collection of key-value pairs
         * Each key is unique and maps to a single value
         * Map extends from Collection Interface
         * Collection implements interface Iterable
         * Map is not a collection
         * Map has unique keys
         */


        Map<String, Integer> students = new HashMap<>();

        students.put("Diego", 36);
        students.put("Yenni", 27);
        students.put("Aguedita", 56);
        students.put("Rafa", 70);

        students.put("Diego", 100);

        System.out.println(students);

        System.out.println(students.get("Diego"));

        System.out.println(students.keySet());

        // print all the values fof a Map
        for(String name : students.keySet())
        {
            System.out.println(name + " " + students.get(name));
        }


        /* Hashtable uses sincronized
         * 
         * Hashtable is a synchronized version of HashMap
         * It is thread-safe
         * It is slower than HashMap
         */
        Map<String, Integer> teachers = new Hashtable<>();

        teachers.put("Pepe", 36);
        teachers.put("Daniel", 27);
        teachers.put("Ernesto", 56);
        teachers.put("Chuck", 70);

        teachers.put("Diego", 100);

        System.out.println(teachers);

        System.out.println(teachers.get("Chuck"));

        System.out.println(teachers.keySet());

        // print all the values fof a Map
        for(String name : teachers.keySet())
        {
            System.out.println(name + " " + teachers.get(name));
        }
    }
}
