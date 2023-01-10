package ChapterSeven;

public class SchoolAdmin {
    private int[][] nativeScores = new int[2][5];
    private double[] averageScores = new double[2];

    public SchoolAdmin(){}
    public SchoolAdmin(int[][] scores){
        nativeScores = scores;
    }
    public void calculateAveragesScore() {
        int totalScore = 0;
        for (int counter = 0; counter < nativeScores.length; counter++) {
            for(int counter2 = 0; counter2 < nativeScores.length; counter2++){
                totalScore += nativeScores[counter][counter2];
            }
            averageScores[counter] = (double) totalScore / nativeScores.length;
        }
    }

    public int[][] getNativeScores() {
        return nativeScores;
    }

    public void setNativeScores(int[][] nativeScores) {
        this.nativeScores = nativeScores;
    }

    public double[] getAverageScores() {
        return averageScores;
    }
}
