enum Status{ // enum is used to define constants
    Runnng, Failed, Success, Pending; // Named Constants 
    // these are also the object of the enum class
}

enum Laptop{ // we can use enum as a class and set constructor for it
    Macbook(2000), XPS(2233), Surface(1900), ThinkPad(1500);
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private Laptop(int price){
        this.price = price;
    }
}

class A{
    public void show(){
        System.out.println(" in A Show");
    }
}
class B extends A{
    @Override // this is an annotation, which is used to tell the compiler about our intentions
    public void show(){
        System.out.println("in B Show");
    }
}

public class oops13 {
    public static void main(String[] args) {
        Status s = Status.Success; // to access a constant in an enum
        // the constants are indexed from 0 in enum
        System.out.println(s);

        for( Laptop lap : Laptop.values()){ // this is used to get all the constants from the enum
            System.out.println(lap+" : "+lap.getPrice());
        }

        // Annotations 
        B obj = new B();
        obj.show();
    }
}

// Types of Interfaces 
// Normal Interface -> have more than two interfaces
// Functional/ SAM -> have only one interface
// Marker -> it is empty interface , used to command the compiler, used to store object's values in hard-drive
