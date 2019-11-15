package Factorial;

public class Factorial {
    public static void main(String[] args){
        //System.out.println(calculateFactorialWithLoop(20));
        System.out.println(calculateFactorialWithRecursive(20));
    }
    public static long calculateFactorialWithLoop(int n){
        long result=1;
        for(int i=1;i<=n;i++){
            result=result*i;
        }
        return result;

    }
    public static long calculateFactorialWithRecursive(int n) {
        long result = 1;
        if (n==1) {
            return result;
        }
        else{
            result = calculateFactorialWithRecursive(n - 1) * n;
        }
        return result;
    }
}