/* ZCrowell_Part1.java
 * Java I-P-O program, iterates lists of test scores, prints min, max, avg.
 * For CSCI 111 Section 002
 * Last edited on November 19, 2020 by Zane Crowell
 */

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // declare variables
        double scoreArray[] = new double[5];    // array of 5 test scores
        int count = 0;
        double sum = 0.0;
        double avg;
        double min = 101.0;
        double max = 0.0;


        // set up scanner
        Scanner kb = new Scanner(System.in);

        // for loop - get input from user, enter it into array
        System.out.println("Hello, please enter the test scores below (exclude '%' symbol).");

        for (int i=0; i<scoreArray.length; i++) {
            count++;
            System.out.println("\nScore " + count + ": ");
            scoreArray[i] = kb.nextDouble();
        }

        // for loop - iterate array, calculate highest, lowest, & average scores
        for (int i=0; i<scoreArray.length; i++) {
            sum = sum + scoreArray[i];
        }

        // min for loop
        for (int b=0; b<scoreArray.length; b++) {
            if (scoreArray[b] < min) {
                min = scoreArray[b];
            }
        }

        // max for loop
        for (int n=0; n<scoreArray.length; n++) {
            if (scoreArray[n] > max) {
                max = scoreArray[n];
            }
        }

        // calculate average
        avg = (sum/scoreArray.length);

        // print results
        System.out.println("The minimum test score is: " + min);
        System.out.println("The maximum test score is: " + max);
        System.out.printf("The average test score is: %.1f %n", avg);



    } // end method main()

} // end class Main
