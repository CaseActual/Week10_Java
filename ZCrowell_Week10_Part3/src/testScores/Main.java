/* ZCrowell_Week10_Part3.java
 *
 * Updated Java I-P-O program - utilizes the code from "ZCrowell_Part2_Corrected12.17.java
 *
 * For CSCI 111 Section 002
 * Last edited December 17, 2020 by Zane Crowell
 */

package testScores;

public class Main {

    public static void main(String[] args) throws Exception {

        // creating instances of the other classes
        fromFile from = new fromFile();
        topScore t = new topScore();
        lowestScore b = new lowestScore();
        avgScore a = new avgScore();
        toFile to = new toFile();

        // run class methods
        from.getScores();
        t.getMax();
        b.getMin();
        a.avgAndSum();
        to.enterResults();

        // print results
        System.out.println("The highest test score is: " + t.max);
        System.out.println("The lowest test score is: " + b.min);
        System.out.printf("The average of the test scores is: %.1f%n", a.avg);
        System.out.println("\nProgram has executed successfully. The file 'testResults.txt has been updated.");


    } // end main() method

} // end Main Class



