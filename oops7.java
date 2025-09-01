class Aa{
    public void show(){
        System.out.println("in A Show");
    }
}

class Bb extends Aa{
    public void show(){
        System.out.println("in B show");
    }
}

class Cc extends Aa{
    public void show(){
        System.out.println("in C Show");
    }
}

public class oops7 {
    // Access Modifiers

    // public can be accessed anywhere
    // private can only be accessed within the class
    // default i.e. if we don't write anything , it is accessed within the same package 
    // protected can be accessed in the same package and also outside the package within the subclass
    // class -> public 
    // instance variable -> private 
    // methods -> public or private , depends on use

    // Polymorphism -> many behaviour -> runtime or compile time
    // method overloading(compile time) , method overriding(runtime)
    
    public static void main(String[] args) {
        // Dynamic Method Dispatch
        Aa obj = new Aa(); // irrespective of what type of ref var we create , it is depended on the type of object we create , only works with inheritance
        obj.show();

        obj = new Bb();
        obj.show();

        obj = new Cc();
        obj.show();

        // Final Keyword - variable, method or class
        // final int num=8; -> it is used to make constants
        // num=9; ->cannot be done
        // final class cannot be inherited, no-one can extend it
        // final methods cannot be overridden
    }
}
