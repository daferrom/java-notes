class Computer
{   
    // For each method requires to be specified the access public or private
    // When a method doesn't return any value we use void
    // When a method returns a value we specify the type of the value
    public void playMusic()
    {
        System.out.println("Playing music");
    }
    // The returned value is a String then the String keyword is used
    public String getMeAPen(int cost){
        if(cost >= 10)
            // when the return is achived it stops the execution of the next lines
            return "Pen";
        // this  "return" is not reached if the cost is greater than 10
        return "Not enough money bro!";
    }
}

public class MyMethodsMain
{
    public static void main(String arg[])
    {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(5);
        System.out.println(str);
    }

}
