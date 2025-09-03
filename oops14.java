@FunctionalInterface // use annotation to mark it as functional interface
interface A{
    void show();
}
interface B{
    void show(int i);
}
interface C{
    int add(int a, int b);
}

public class oops14 {
    public static void main(String[] args) {
        A obj = () ->
        {
            System.out.println("in show");
        }; // this is lambda expression
        A obj1 = () -> System.out.println("in obj1"); // this is also a lambda expression
        obj1.show();
        obj.show();

        B obj2 = i -> System.out.println(i); // lambda expression for single argument
        obj2.show(6);

        C obj3 = (i,j) -> i+j; // lambda expression for multiple arguments , it does not require the return keyword
        System.out.println((obj3.add(5, 4)));
    }
}
