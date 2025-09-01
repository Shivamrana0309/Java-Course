class Students{
    int marks;

    public void show(){
        System.out.println("in show");
    }

    class Monitor{ // inner-class
        public void config(){
            System.out.println("in config");
        }
    }
}

abstract class Classroom{
    public abstract void show();
}

public class oops11 {
    public static void main(String[] args) {

        Students obj = new Students();
        // obj.show();

        Students.Monitor obj1 = obj.new Monitor(); // this is how object of an inner-class is created
        // new keyword is used with an object ref variable because the inner-class is non-static one
        obj1.config();

        Students obj2 = new Students(){
            // to get new implementation of the show() method we can create it here
            public void show(){ // this is anonymous inner-class
                System.out.println("in new show");
            }
        };
        obj2.show();

        Classroom obj3 = new Classroom() {
            // here an abstract class's object can also be created using this anonymous inner-class
            public void show(){
                System.out.println("in classroom");
            }
        };
        obj3.show();
    }
}
