class Human{
    // Encapsulation is binding of the class data with methods so that no-one of the outside world
    // will be able to access that
    // to use that data we need to define methods

    private int age ;
    private String name;
    // private keyword ensures that the instance variables are not used outside of the class

    public Human(){ // default constructor
        // constructor is a special type of function with no return type
        // it is used to initialize the values
        this.age=12;
        this.name="John";
        // System.out.println("in constructor");
    }

    public Human(int age,String name){ // parameterized constructor
        this.age=age;
        this.name=name;
    }

    public void setAge(int age){ // setter function
        this.age=age; // this keyword is used to point towards the instance variable of the class
    }
    // or instead of using this keyword we can do it by
    public void setAge(int age, Human obj){ // method overloading -> methods with same name but different parameters
        obj.age = age;
    }
    public void setName(String s){ // setter function or method
        this.name=s;
    }
    public int getAge(){ // getter method
        return age;
    }
    public String getName(){ // getter method
        return name;
    }
}

public class oops3 {
    public static void main(String[] args) {
        Human h1 = new Human();
        Human h2 = new Human(20,"Shivam");
        // h1.setAge(20,h1);
        // h1.setName("Shivam");
        System.out.println("Name: "+h1.getName());
        // System.out.println("Age: "+h1.getAge());
        System.out.println("Name: "+h2.getName());
    }
}
