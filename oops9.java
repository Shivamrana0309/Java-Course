
class One{
    public void show1(){
        System.out.println("in 1");
    }
}
class Two extends One{
    public void show2(){
        System.out.println("in 2");
    }
}

public class oops9{
    public static void main(String[] args) {
        // One obj = (One) new Two(); -> Upcasting 

        One obj = new Two();
        obj.show1();

        Two obj1 = (Two) obj; // Downcasting
        obj1.show2();

        // int num =7;
        Integer num1 = 8; // autoboxing
        // int num2 = num1.intValue(); // auto-unboxing
        System.out.println(num1);
    }
}