/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: October 16, 2022
 * Description: In this exercise, a try/catch block is set up. Within the try block, an array is set up of length 50, and using
 * a for loop these places are filled with random double values. Then it prompts the user for an index number and prints out
 * the corresponding value for this index number. If this number is not within bounds, then the catch block will catch the
 * ArrayIndexOutOfBoundsException and will print a message.
 */

package Chapter4.Exercise2;

public class Exercise2 {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);

        try {
            double[] array = new double[50];
            for (int i = 0; i < array.length; i++) {
                array[i] += Math.random();
            }

            System.out.println("Enter an index number: ");
            int index = input.nextInt();

            System.out.println(array[index]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("This index is out of bounds");
        }

    }
}
