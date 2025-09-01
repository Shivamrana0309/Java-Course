abstract class car{
    // abstract class is used to declare some methods which may be defined later
    // It's object cannot be created but it's ref variable can be created
    // It is not necessary for an abstract class to have abstract methods
    public abstract void drive(); // abstract keyword is used to declare a method which can be defined later
    public void playMusic(){
        System.out.println("playing music");
    }
}

class WagonR extends car{
    public void drive(){
        System.out.println("Driving");
    }
}

public class oops10 {
    public static void main(String[] args) {
        // car obj = new car(); -> we cannot create an object of an abstract class
        car obj = new WagonR(); // we can create ref variable of abstract class
        obj.drive();
        obj.playMusic();
    }
}
