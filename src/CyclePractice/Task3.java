/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */
package CyclePractice;

/**
 * IKIN HASANOV's response to Homework "Cycle practice", Module 1.
 *
 *   Task:
 *      Get the area limited by the following functions:
 *      x = 0 .. 3.14;    y = sin(x);   y = 0.1 * k, where k is the last cipher
 *      in your student card. (2 points)
 *
 * @version 1.10 13-03-2021
 * @author Ilkin Hasanov
 */
public class Task3 {
    public static void main(String[] args) {

//      initializing the variables

        double deltaX = 0.01;
        double totalArea = 0;
        double y = 0.5;
        double sectionArea;

//      calculating the area

        for (double x = 0; x < Math.PI; x+=deltaX) {
//      calculating the section area where the value of y is less than 0.5
            if (Math.sin(x) < 0.5){
                sectionArea = Math.sin(x) * deltaX;
//      calculating the section area where the value of y is 0.5
            } else {
                sectionArea = y * deltaX;
            }
//      adding all result together
            totalArea += sectionArea;
        }
//      output the determined result to the console
        System.out.println("Area limited by the given functions is: "
                + totalArea);
    }
}