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
 *      Check a string as a palindrome ( 3 points)
 *
 * @version 1.10 13-03-2021
 * @author Ilkin Hasanov
 */
public class Task2 {
    public static void main(String[] args) {

//      Some examples

        String expression1 = "A man, a plan, a canal--Panama!";
        String expression2 = "Drab as a fool, aloof as a bard.";
        String expression3 = "Are we not drawn onward, we few, drawn onward " +
                "to new era?";
        String expression4 = "Doc: note, I dissent. A fast never prevents a " +
                "fatness. I diet on cod.";
        String expression5 = "Some men interpret nine memos.";

//      removing all non-letter symbols and then checking statements with their
//      reverse copies and displaying the result on the consul weather
//      they are palindrome or not

        System.out.println("----------------------------------");
        if (expression1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()
                .equals(new StringBuilder(expression1).reverse().toString()
                        .replaceAll("[^a-zA-Z0-9]", "").toLowerCase())) {
            System.out.println("The expression \"" + expression1 + "\" is" +
                    " a palindrome");
        } else {
            System.out.println("The expression \"" + expression1 + "\" is " +
                    "not a palindrome");
        }

        if (expression2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()
                .equals(new StringBuilder(expression2).reverse().toString()
                        .replaceAll("[^a-zA-Z0-9]", "").toLowerCase())) {
            System.out.println("The expression \"" + expression2 + "\" is" +
                    " a palindrome");
        } else {
            System.out.println("The expression \"" + expression2 + "\" is " +
                    "not a palindrome");
        }

        if (expression3.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()
                .equals(new StringBuilder(expression3).reverse().toString()
                        .replaceAll("[^a-zA-Z0-9]", "").toLowerCase())) {
            System.out.println("The expression \"" + expression3 + "\" is" +
                    " a palindrome");
        } else {
            System.out.println("The expression \"" + expression3 + "\" is " +
                    "not a palindrome");
        }

        if (expression4.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()
                .equals(new StringBuilder(expression4).reverse().toString()
                        .replaceAll("[^a-zA-Z0-9]", "").toLowerCase())) {
            System.out.println("The expression \"" + expression4 + "\" is" +
                    " a palindrome");
        } else {
            System.out.println("The expression \"" + expression4 + "\" is " +
                    "not a palindrome");
        }

        if (expression5.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()
                .equals(new StringBuilder(expression5).reverse().toString()
                        .replaceAll("[^a-zA-Z0-9]", "").toLowerCase())) {
            System.out.println("The expression \"" + expression5 + "\" is" +
                    " a palindrome");
        } else {
            System.out.println("The expression \"" + expression5 + "\" is " +
                    "not a palindrome");
        }
    }
}
