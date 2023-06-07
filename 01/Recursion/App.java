package Recursion;

public class App {
    public static void main(String[] args) {
        int value =  4;
        // calculate(value);
       System.out.println(factorial(value));
        // System.out.println(value);
    }

    private static void calculate(int value){
        // A recursion is simply a method calling its self or a subroutine calling itself
        // value = value + 1;
        System.out.println(value);
        if(value == 1){
            return;
        }
        calculate(value - 1);
    }

    private static int factorial(int value){
        // using this to calculate factorial -------- 4! =  4*3*2*1 
        if(value == 1){
            return 1;
        }
        // Tower of hanoi on wikipedia page for practice
        return factorial(value - 1) * value;
    }
}
