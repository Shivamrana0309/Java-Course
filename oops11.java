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

public class oops11 {
    public static void main(String[] args) {

        Students obj = new Students();
        // obj.show();

        Students.Monitor obj1 = obj.new Monitor(); // this is how object of an inner-class is created
        // new keyword is used with an object ref variable because the inner-class is non-static one
        obj1.config();
    }
}
