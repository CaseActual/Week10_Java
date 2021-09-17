

package testScores;

import java.io.File;
import java.io.PrintWriter;

public class toFile {

    // create array for score calculations
    public static double[] resultsArray = new double[3];

    // create instances of topScore, lowestScore, & avgScore
    public static topScore t = new topScore();
    public static lowestScore b = new lowestScore();
    public static avgScore a = new avgScore();

    // method to put min, max, and avg in results array
    public static void enterResults() throws Exception {
        resultsArray[0] = b.min;
        resultsArray[1] = t.max;
        resultsArray[2] = a.avg;

        // set up Scanner for outputting array to text file
        File statResults = new File("testResults.txt");
        PrintWriter fileOut = new PrintWriter(statResults);

        fileOut.println("The lowest test score is: " + resultsArray[0]);
        fileOut.println("The maximum test score is: " + resultsArray[1]);
        fileOut.printf("The average of the scores is: %.1f%n", resultsArray[2]);
        fileOut.close();
    } // end method enterResults()

} // end class toFile





