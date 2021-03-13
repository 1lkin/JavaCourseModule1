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
 *      Write to console 8 facts about yourself using primitive types. (1 point)
 *
 * @version 1.10 13-03-2021
 * @author Ilkin Hasanov
 */
public class Task1 {
    public static void main(String[] args) {
//      8 primitive types

        byte siblings = 4;
        short day = 13_540;
        int seconds = day * 24 * 3600;
        long totalCell = 15_714_285_714_285L;
        float cellWeight = 0.0000000035F;
        double cellWeightInKilograms = 0.0000000000035 ;
        char who = 'I';
        boolean right = true;

//      usage of my variables

        System.out.println("My name is Ilkin. \n" + who + " have " + siblings +
                " siblings.");
        System.out.println("Since " + who + " was born, " + who + " have lived "
                + day + " days.");
        System.out.println("If calculate it to seconds, it will be " + seconds +
                " seconds.");
        System.out.println("According to Scientists the weight of a human " +
                "cell is " + cellWeight + "gram or " + cellWeightInKilograms +
                "kilogram");
        System.out.println("So then " + who + " have " + totalCell +
                " cells. " + "But " + who + " do not exactly know if it is " +
                right);
    }
}
