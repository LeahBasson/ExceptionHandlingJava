package za.ac.cput;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {

    // demonstrates throwing an exception when a divide-by-zero occurs
    public static int quotient(int n, int d) {
        return n / d; // possible division by zero
    } // end method quotient

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner for input

        try // read two numbers and calculate quotient                   
        {
            System.out.print("Please enter an integer numerator: ");
            int numerator = scanner.nextInt();
            System.out.print("Please enter an integer denominator: ");
            int denominator = scanner.nextInt();

            int result = quotient(numerator, denominator);
            System.out.printf("\nResult: %d / %d = %d\n", numerator,
                    denominator, result);
        } // end try   
        catch (ArithmeticException a) {
            System.out.println(
                    "**Zero is an invalid denominator. Please try again.\n");
            System.out.println("exception message:" + a.toString());
        } // end catch    
        catch (InputMismatchException inMisMatchException) {
            System.out.println(inMisMatchException.toString());
            System.out.println(
                    "**A non-numeric value was entered. Please try again.\n");
            scanner.next();
        } // end catch    
        catch (Exception e) {
            System.out.println(
                    "**This is the catch all executing........" + e.toString());
            scanner.next();
        }
        // end catch    
//           finally
//           {
//              System.out.println(                                           
//                 "**This is the FINALLY block executing........");  
//             //System.flush();
//           }

        System.out.println("rest of program continues");
        //???????????
    }// end of main

}// end of class
