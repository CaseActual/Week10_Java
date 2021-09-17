

package testScores;

public class lowestScore {

    // declare variables
    public static double min = 100.0;

    // create instance of fromFile class for scoreArray access
    public static fromFile b = new fromFile();

    // method - uses for loop to iterate scoreArray and find lowest score
    public static void getMin() throws Exception {

        for (int i=0; i<b.scoreArray.length; i++) {
            if (b.scoreArray[i] < min)
                min = b.scoreArray[i];
        }
    } // end method getMin()

} // end class lowestScore




