class Laptop{
    String model;
    int price;

    public String toString(){
        return "Hello";
    }
}

public class oops8 {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model="Yoga";
        obj1.price=100000;
        // System.out.println(obj1.toString()); // when we don't define a method than the method is called from the super class here object class is super class
        
        Laptop obj2 = new Laptop();
        obj2.model="Yoga";
        obj2.price=100000;

        boolean res= obj1.equals(obj2); // object class has these methods which we can use
        System.out.println(res);
    }
}
