public class EnumsIfAndSwitch {
    public static void main (String[] args) {
        System.out.println("Hello from  enumsIfAndSwitch");

        Status s = Status.Running;

        // if(s == Status.Running)
        //     System.out.println("All good");
        // else if(s == Status.Failed)
        //     System.out.println("Try again");
        // else if(s == Status.Pending)
        //     System.out.println("Please wait");
        // else
        //     System.out.println("Done");

        switch(s)
        {
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Try again");
                break;
            case Pending:
                System.out.println("Please wait");
                break;
            default:
                System.out.println("Done");
                break;
        }
    }
}
