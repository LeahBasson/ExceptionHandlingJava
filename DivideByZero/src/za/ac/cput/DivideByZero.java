package za.ac.cput;

import java.util.Scanner;

public class DivideByZero {

    public static int quotient(int numerator, int denominator) {
        return numerator / denominator; // possible division by zero
    } // end method quotient

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner for input

        System.out.print("Please enter an integer numerator: ");
        int firstNum = scanner.nextInt();
        System.out.print("Please enter an integer denominator: ");
        int secondNum = scanner.nextInt();

        int result = quotient(firstNum, secondNum);
        System.out.printf(
                "\nResult: %d / %d = %d\n", firstNum, secondNum, result);
        System.out.println("rest of program continues");
        //????????????
        //..............
        //?????????????
    }// end of main

}// end of class
