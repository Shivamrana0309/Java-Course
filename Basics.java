public class Basics {
    // Java is WORA -> Write Once Run Anywhere, also strongly typed lang
    public static void main(String[] args) {

        // variables -> used to store data during processing
        int num = 5; // a variable
        int num2 = 10;
        int res = num + num2 ;
        System.out.println(res);

        // Datatypes
        // Primitive -> Integer , Float , Char , Boolean;
        // Integer -> byte(1), short(2), int(4), long(8)
        // Float -> double(8) , float(2)
        float f=10.56f;
        System.out.println(f);

        // Type Conversion
        byte b=127;
        int a = 256;
        // b=a; -> not possible 
        // b=(byte)a; -> possible if a is inside byte range or it will be using modulus operation, Explicit Conversion
        // a=b; -> possible
        System.out.println(a+" "+b);
    }
}