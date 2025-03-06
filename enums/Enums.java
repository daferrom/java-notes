public class Enums {
    public static void main (String[] args) {
        System.out.println("Hello from  enums");

        Status s = Status.Failed;

        System.out.println(s);

        System.out.println(s.ordinal()); // 1 is the ordinal of Failed named constant

        Status[] statusValues = Status.values();

        System.out.println(statusValues[3]);

        for(Status  sv : statusValues)
        {
            System.out.println(sv);
        }
    }
}
