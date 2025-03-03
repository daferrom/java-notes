abstract class Car
{
    /* abstract method helps to only declare a not defined method
     * and it must belong to an abstact class
     * abstract class jhas normal methods too
     */
    public abstract void drive();
    public abstract void fly();

    public void playMusic()
    {
        System.out.println("play music");
    }
}


abstract class WaggonR extends Car 
{
    /* Definition of an abstract method 
     * 
    */
    public void drive()
    {
        System.out.println("...Driving...");
    }
}

class UpdatedWagonR extends WaggonR // concrete class
{

    public void fly() {
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }
    
}

public class AbstractKeyword {
    public static void main(String[] args){
        /* It can not be create an object from an abstrac class
         * it requires a not abstract class
         */
        // Car obj = new Car();
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
    }
}