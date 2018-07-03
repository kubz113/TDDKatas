package BowlingKata;

public class BowlingGame {


    public int scoreGame(int[][] score){
        if(score.length!=10){
            return -1;
        }

        int totalScore = 0;

        for(int frame = 0; frame<9; frame++){
            int frameScore = score[frame][0]+score[frame][1];
            if(frameScore>10 || score[frame].length>2){
                return -1;
            }

            if(score[frame][0]==10){
                frameScore = calculateStrikeVal(score, frameScore, frame);
            }
            else if(score[frame][0]+score[frame][1] == 10) {
                frameScore = calculateSpareVal(score, frameScore, frame);
            }
            totalScore+=frameScore;
        }
        totalScore+= calculateScoreWithTenthFrame(score);

        return totalScore;
    }

    private int calculateScoreWithTenthFrame(int[][] score) {

        return score[9][0]+score[9][1]+score[9][2];
    }
    private int calculateStrikeVal(int[][] score, int frameScore, int frame) {
        if (score[frame+1][0]==10){
                if(frame==8){
                    frameScore+=10 + score[frame+1][1];
                }
                else {
                    frameScore += 10 + score[frame + 2][0];
                }
        }

        else {
            frameScore += score[frame + 1][0] + score[frame + 1][1];
        }
        return frameScore;
    }
    private int calculateSpareVal(int[][] score, int frameScore, int frame) {

        return frameScore+score[frame+1][0];
    }
}
