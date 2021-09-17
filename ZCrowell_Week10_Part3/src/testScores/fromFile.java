

package testScores;

import java.util.*;
import java.io.*;

public class fromFile {

    // create array for test scores from text file
    public static double scoreArray[] = new double[5];
    public static int i = 0;

    // method to grab test scores from text file
    public static void getScores() throws Exception {

        // set up scanner
        Scanner ff = new Scanner(System.in);

        File fileScores = new File("scores.txt");
        Scanner outFile = new Scanner(fileScores);

        for (i=0; i<scoreArray.length; i++)
            scoreArray[i] = outFile.nextDouble();

        outFile.close();
    } // end getScores() method

} // end fromFile class

