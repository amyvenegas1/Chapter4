/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: October 16, 2022
 * Description: In this exercise, the program is set up in a try/catch block. It will first try to take two inputs from the
 * user and if the inputs match the integer type, then it print the sum. If the user put in a character for example, then
 * it will catch the exception and print out a complaint.
 */

package Chapter4.Exercise1;

import java.util.InputMismatchException;

public class Exercise1 {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        try{
            System.out.println("Enter an integer: ");
            int num1 = input.nextInt();

            System.out.println("Enter another integer: ");
            int num2 = input.nextInt();

            int answer = num1 + num2;

            System.out.println(num1 + "+" + num2 + "=" + answer);
        }catch(InputMismatchException e){
            System.out.println("This is not an integer type.");
        }
    }
}
