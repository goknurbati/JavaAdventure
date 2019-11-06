package Fibonacci;

public class Fibonacci {

    public static void main(String[] args){
        System.out.println(calculateFibonacciWithRecursive(4));
    }

    public static int calculateFibonacciWithRecursive(int n){
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else{
            return calculateFibonacciWithRecursive(n-2)+calculateFibonacciWithRecursive(n-1);
        }
    }

   /*public static int calculateFibonacciWithRecursive(int n){
        if (n <=2){
            return n;
        }
        else{
            return calculateFibonacciWithRecursive(n-2)+calculateFibonacciWithRecursive(n-1);
        }
    }*/
}
