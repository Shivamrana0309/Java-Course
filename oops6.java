class A{
    public void show(){
        System.out.println("in A show");
    }
    public void config(){
        System.out.println("in config");
    }
}

class B extends A{
    public void show(){ // method overriding -> this method will override the show method to print "In B show"
        System.out.println("in B show");
    }
}

public class oops6 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
