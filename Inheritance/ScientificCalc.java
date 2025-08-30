package Inheritance;

public class ScientificCalc extends AdvCalc{ // this is multilevel inheritance
    // here ScientificCalc extends AdvCalc and bydefault it inherits all the properties of Calculator
    public double power(int a,int b){
        return Math.pow(a, b);
    }
}
