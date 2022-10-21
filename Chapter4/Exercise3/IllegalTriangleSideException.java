/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: October 16, 2022
 * Description: In this class, a custom exception that extends from the exception class. This custom exception will be
 * used in the triangle class
 */

package Chapter4.Exercise3;

public class IllegalTriangleSideException extends Exception{

    public IllegalTriangleSideException(String message){
        super(message);
    }

    public IllegalTriangleSideException(){
        super("Invalid Triangle Side Exception");
    }
}
