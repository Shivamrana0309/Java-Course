// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface  A {
    // all the methods is an interface are by-default public abstract
    // interface is an abstract class with all methods are abstract

    int age = 55; // final and static -> this is the property of the interface
    String name = "Shivam";

    void show();
    void config();
}
interface X {
    void run();
}
interface Y extends X{

}

class B implements A,X { // a class can implement multiple interfaces but a class can only extend one abstract class
    public void show(){
        System.out.println("in Show");
    }
    public void config(){
        System.out.println("in config");
    }
    public void run(){
        System.out.println("running");
    }
}

abstract class Computer{ // here Computer is a design of Laptop and Desktop class
    // we can also use interface here
    public abstract void code();
}
class Laptop extends Computer{
    public void code(){
        System.out.println("code, compile, run");
    }
}
class Desktop extends Computer{
    public void code() {
        System.out.println("Code, compile, run : Faster");
    }
}
class Developer{
    public void DevApp(Computer obj){ // now here was a problem that if we send an object of Laptop then Computer object will fail and vice-versa
        // that's why we passed their superclass
        obj.code();
    }
}

public class oops12 {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        System.out.println(A.name);

        Computer lap = new Laptop(); // here we created a ref variable of Computer so that we can use it for any class we want
        Computer desk = new Desktop();
        Developer dev = new Developer();
        dev.DevApp(desk);
        dev.DevApp(lap);
    }
}
