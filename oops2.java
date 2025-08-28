class Mobile{
    // instance variables
    String brand;
    int price;
    // when we want a variable to be same for all objects then we define that variable as static
    // here all the instance variables belong to an object but if they are static they belong to a class not objects
    static String name; // this name will be same for each object as it is declared static

    static{
        // static block used to initialize a static variable 
        // called when a class is loaded -> class is loaded when it's object is created 
        // it called only once when the class is loaded
        name = "Phone";
    }

    public void show(){ // instance method
        System.out.println(brand + " : "+ price +" : "+ name ); // static variables can be used in non-static objects
    }

    public static void show1(Mobile obj){ // static method can be called without creating an object of the class 
        // but inside a static method only static variables can be used
        // to use non-static variable we should use the object as an argument for the function and then use the instance variable with (.) operator
        // System.out.println("in static");
        System.out.println(obj.brand+" : " + obj.price +" : "+name);
    }
}

public class oops2 {
    public static void main(String[] args) throws ClassNotFoundException {

        // Class.forName("Mobile"); -> it is used to load a class without creating it's object

        Mobile m1 = new Mobile();
        m1.brand="Apple";
        m1.price=1400;
        Mobile.name="Smartphone"; // static variables are used with the class_name

        Mobile m2= new Mobile();
        m2.brand="Samsung";
        m2.price=1500;
        Mobile.name="Smartphone";

        m1.show();
        m2.show();
        Mobile.show1(m2); // static methods are also called using the class_name
    }
}
