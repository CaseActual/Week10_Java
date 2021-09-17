

package testScores;

public class avgScore {

    // declare variables
    public static double scoreSum = 0.0;
    public static double avg = 0.0;

    // create instance of fromFile class for scoreArray access
    public static fromFile v = new fromFile();

    // method - find sum of test scores and average of scores
    public static void avgAndSum() {

        for (int i=0; i<v.scoreArray.length; i++) {
            scoreSum = scoreSum + v.scoreArray[i];
        }

        avg = (scoreSum/v.scoreArray.length);
    } // end method avgAndSum()

} // end class avgScore




