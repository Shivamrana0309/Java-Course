class Calculator{
    int a;
    public int add(int num1,int num2){
        // System.out.println("in add");
        int r=num1+num2;
        return r;
    }
}

public class oops {
    public static void main(String[] args) {
        // here cal is a ref variable 
        Calculator cal = new Calculator();
        int res = cal.add(4,5);
        System.out.println(res);
    }
}

// OOPs
// object - properties and behaviours

// class - blueprint or design of an object

