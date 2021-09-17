

package testScores;

public class topScore {

    // declare variables
    public static double max = 0.0;

    // create instance of fromFile class
    public static fromFile n = new fromFile();

    // method - uses for loop to iterate array and find highest score
    public static void getMax() throws Exception {

        for (int i=0; i<n.scoreArray.length; i++) {
            if (n.scoreArray[i] > max)
                max = n.scoreArray[i];
        }
    } // end method getMax()

} // end class topScore


