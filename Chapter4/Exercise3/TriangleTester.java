/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: October 16, 2022
 * Description: The triangle tester class is used to test the triangle constructor as well as the checkSides method that was
 * implemented within it. New triangle objects will be created and if they encounter an exception then the catch block
 * will throw this exception.
 */

package Chapter4.Exercise3;

public class TriangleTester {
    public static void main(String[]args) throws IllegalTriangleSideException{
        try{
            Triangle t1 = new Triangle(10,20,25.5);
            Triangle t2 = new Triangle(15.2,4.3,33);
            Triangle t3 = new Triangle(12.4,14,10.1);
        }catch(IllegalTriangleSideException e){
            System.out.println(e);
        }



    }
}
