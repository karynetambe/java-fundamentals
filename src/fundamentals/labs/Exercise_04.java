package fundamentals.labs;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        Double pi = Math.PI;
        Double radius;
        Double height;
        Double area;
        Double volume;

        Scanner input = new Scanner(System.in);
        //input variables
        System.out.print("Type in radius for cylinder: ");
        radius = input.nextDouble();
        System.out.print("Type in the height for the cylinder: ");
        height = input.nextDouble();

        //calculate area and volume
        area = radius*radius*pi;
        volume = area*height;

        //output data
        System.out.println("area is: " + area);
        System.out.println("volume is:" + volume);







    }
}
