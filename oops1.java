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

public class oops1 {
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
        // Calculator cals[] = new Calculator[5]; -> array of objects
        // cals[i] -> it is an ref variable for each object
        // for(int n:nums){print(n)} -> Enhanced for loop

        // String
        // String name = "Shivam"; -> it works and generally used but string is a class
        // String str = new String("Shivam");// -> String is a class and here we have created it's object
        // System.out.println("Hello "+ str);
        // String are immutable in Java i.e. they cannot be changed and when we concatenate a string it's ref variable points to an different object with the concatenated string
        // String name ="shivam"; // points to an object storing shivam
        // name = name + " rana"; // this creates a new object storing "shivam rana" and now name will point to this object
        // String s1 = "Shivam";
        // String s2 = "Shivam"; // both s1 and s2 points to the same object as they both store the String that's why Strings are immutable in java
        // this is done to have optimal memory utilisation in java
        
        // Mutable String -> StringBuffer or StringBuilder
        // StringBuffer str = "name"; -> this is how a StringBuffer is created 
        // we can perform any operation on this StringBuffer object
        // StringBuffer is Thread safe and StringBuilder is not

    }
}

// OOPs
// object - properties and behaviours

// class - blueprint or design of an object

