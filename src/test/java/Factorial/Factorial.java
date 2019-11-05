package Factorial;

import java.util.Scanner;


public class Factorial {


    public static void main(String[] args) {

        for (int enteredNumber = 1; enteredNumber >= 1; enteredNumber++) {

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter your number : ");
            enteredNumber = input.nextInt();

            int result = (enteredNumber - 2) * (enteredNumber - 1) * enteredNumber;
            System.out.println("Result :" + result);
        }
    }

}









