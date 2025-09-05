// Exceptions are the runtime error like file does not exist or divide by zero
// creating a custom exception

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyException extends Exception{ // custom Exception
    public MyException(){}
    public MyException(String str){
        super(str);
    }
}

class A{
    public void show() throws ClassNotFoundException{
        // here instead of using these try catch blocks we can also use the throws keyword
        // try{
            Class.forName("oops15");
        // }
        // catch(ClassNotFoundException e){
        //     System.out.println("Class does not exist");
        // }
    }
}

public class oop15 {
    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        int i=1;
        int j=0;
        try
        {
            j=18/i; // here we put the critical statements which might give an exception
            if(j==0){
                throw new ArithmeticException();
            }
            else if(j==18){
                throw new MyException();
            }
        }
        catch(MyException e){
            System.out.println("Answer is 18 "+e);
        }
        catch(ArithmeticException e){
            j=18/1;
            // here we used throw keyword , because we want to make one exception
            System.out.println("J cannot be zero");
        }
        catch(Exception e){
            // this block catches the exception which the try block throws
            // this keeps the continuation of the program
            System.out.println("Exception "+ e );
        }
        System.out.println(j);
        System.out.println("Bye");

        // Throws Keyword
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e);
        }

        // Taking Input other than using Scanner class
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        try {
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        } catch (java.io.IOException e) {
            System.out.println("IO Error: " + e);
        }
        // bf.close();

        // Try with resources
        try{
            // try(exception prone lines of code){ // this automatically closes the resource
            // }
            InputStreamReader in1 = new InputStreamReader(System.in);
            BufferedReader bf1 = new BufferedReader(in1);
            int num1 = Integer.parseInt(bf1.readLine());
            System.out.println(num1);
        }
        finally{
            bf.close();
            // used to close resources
        }
    }
}
