/**
 * class: Intermediate Programming
 * @author: Amy Venegas
 * version:1.0
 * course: ITEC 2150 03 Fall 2022
 * written: October 16, 2022
 * Description: In this class, a triangle constructor is created and contains 3 int length values. A function called
 * checkSide() is created and returns a boolean value if the program deems it to be an illegal triangle. If the triangle
 * side is deemed an error then it throws the IllegalTriangleSideException created in another class.
 */

package Chapter4.Exercise3;

public class Triangle {
    private double length1;
    private double length2;
    private double length3;

    public Triangle(double length1, double length2, double length3) throws IllegalTriangleSideException{
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
        checkSides();
    }

    public double getLength1() {
        return length1;
    }

    public void setLength1(double length1) {
        this.length1 = length1;
    }

    public double getLength2() {
        return length2;
    }

    public void setLength2(double length2) {
        this.length2 = length2;
    }

    public double getLength3() {
        return length3;
    }

    public void setLength3(double length3) {
        this.length3 = length3;
    }

     boolean checkSides() throws IllegalTriangleSideException{
        if((length1 + length2 > length3) && (length2 + length3 > length1) && (length1 + length3 > length3)) {
            return true;
        }
        else{
            throw new IllegalTriangleSideException("This is an invalid triangle");
        }


    }
}
