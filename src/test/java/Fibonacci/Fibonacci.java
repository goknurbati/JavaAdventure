package Fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args){

        for(int enteredNumber=1;enteredNumber<=10;enteredNumber++) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Please enter the number: ");
            enteredNumber = scn.nextInt();

            int fibonacciValue=(enteredNumber-2)+(enteredNumber-1);
            System.out.println("Fibonacci value of the number: "+fibonacciValue);
        }
    }
}
