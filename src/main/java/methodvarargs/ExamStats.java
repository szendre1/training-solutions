package methodvarargs;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results){
        if (results==null || results.length==0){
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        int goodResult =0;
        for (int x:results) {
            if (x>=(maxPoints*limitInPercent/100.00)){
                goodResult++;
            }
        }
        return goodResult;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results){
        if (results==null || results.length==0){
            throw new IllegalArgumentException("Number of results must not be empty!");
        }
        int badResult =0;
        for (int x:results) {
            if (x<(maxPoints*limitInPercent/100.00)){
                return true;
            }
        }
        return false;
    }


}
