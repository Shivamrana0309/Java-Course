class Calculator{
    int a; //instance variable
    public int add(int num1,int num2){ // method
        // System.out.println("in add");
        int r=num1+num2;
        return r;
    }

    public int add(int n1, int n2, int n3){ // method overloading
        return n1+n2+n3;
    }
}

public class oops {
    public static void main(String[] args) {
        // here cal is a ref variable 
        // Calculator cal = new Calculator();
        // int res = cal.add(4,5);
        // System.out.println(res);

        // array
        // int nums[]={1,2,3,4}; // or int nums[]= new int[4]; -> bydefault all the values ae zero
        // int a = nums[0];
        // nums[2]=6;
        // System.out.println(nums[2]);
        // int nums[][] =new int[3][4] -> 2D Array
        // int nums[][] =new int [3][] -> Jagged Array
        // need to define like this -> nums[0] =new int[3];
        // Drawbacks -> finite size and are of homogeneous datatypes

        
    }
}

// OOPs
// object - properties and behaviours

// class - blueprint or design of an object

