package Inheritance;
class A{ // to understand anonymous object
    public A(){
        System.out.println(("object created"));
    }

    public void show(){
        System.out.println("in show");
    }
}

// multiple inheritance in java does not work, multiple inheritance is extend two non-inherited classes

public class oops4{
    public static void main(String[] args) {
        // A obj -> reference variable 
        // obj = new A(); // object creation
        // new A(); // anonymous object -> we can't use it in future because no ref variable is pointing towards it
        // new A().show(); // we can use the methods but everytime we use the new keyword it creates a new object

        // Inheritance
        AdvCalc cal = new AdvCalc();
        System.out.println(cal.add(12, 13)); // here using inheritance we used the add function of calculator class for the object AdvClac class
        System.out.println(cal.mul(12, 13));
        ScientificCalc cal1 = new ScientificCalc();
        System.out.println(cal1.add(14,15)); // here ScientificCalc class inherits AdvCalc class which inherits Calculator class
    }
}