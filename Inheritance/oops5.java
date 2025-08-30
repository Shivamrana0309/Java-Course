package Inheritance;

class B extends Object{ 
    B(){
        super(); // this method is always there in every constructor
        System.out.println("in B");
    }
    B(int n){
        super();
        System.out.println("in B int");
    }
    // every class in java extends the object class
    // when we call super method in a class which itself is a super class then we are calling the contructor of the object class

}

class C extends B{
    C(){
        super();
        System.out.println("in C");
    }
    C(int n){
        this(); // it is used to call the constructor of the same class
        // super(n); // this parameterized super method helps us to call parameterized constructor of super class
        System.out.println("in C int");
    }
}

public class oops5 {
    public static void main(String[] args) {
        C obj = new C(5);
    }
}
