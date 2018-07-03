package BowlingKata;

import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class BowlingGameTests {

    BowlingGame game = new BowlingGame();

    @Test
    public void allGutterBallsReturnZero(){
        int [][] scores = new int[10][2];
        scores[9]= new int[3];
        assertEquals(0,game.scoreGame(scores));

    }

    @Test
    public void allSinglePinFirstBallsReturnTen(){
        int [][] scores = new int[10][2];
        scores[9]= new int[3];
        for(int i = 0; i<10; i++){
            scores[i][0]=1;
        }
        assertEquals(10,game.scoreGame(scores));

    }
    @Test
    public void allSinglePinAllBallsReturnTwenty(){
        int [][] scores = new int[10][2];
        scores[9]= new int[3];
        for(int i = 0; i<10; i++){
            scores[i][0]=1;
            scores[i][1]=1;
        }
        assertEquals(20,game.scoreGame(scores));

    }

    @Test
    public void spareFirstFrameThreeSecondFrameBallOneReturnSixteen(){
        int [][] scores = new int[10][2];
        scores[9]= new int[3];
        scores[0][0] = 9;
        scores[0][1] = 1;
        scores[1][0] = 3;
        assertEquals(16,game.scoreGame(scores));

    }
    @Test
    public void strikeFirstFrameThreeSecondFrameBallOneFourSecondBallReturnTwentyFour(){
        int [][] scores = new int[10][2];
        scores[9]= new int[3];
        scores[0][0] = 10;
        scores[1][0] = 3;
        scores[1][1] = 4;
        assertEquals(24,game.scoreGame(scores));

    }@Test
    public void perfectGameReturnThreeHundred(){
        int [][] scores = new int[10][2];
        scores[9]= new int[3];
        for(int i = 0; i<9; i++){
            scores[i][0]=10;
        }
        scores[9][1] = 10;
        scores[9][0] = 10;
        scores[9][2] = 10;
        assertEquals(300,game.scoreGame(scores));

    }@Test
    public void almostPerfectGameWithSpareInTenthReturnTwoHundredSeventy(){
        int [][] scores = new int[10][2];
        scores[9]= new int[3];
        for(int i = 0; i<9; i++){
            scores[i][0]=10;
        }
        scores[9][0] = 0;
        scores[9][1] = 10;
        scores[9][2] = 10;
        assertEquals(270,game.scoreGame(scores));

    }@Test
    public void randomGameReturnOneHundredThirtyFive(){
        int [][] scores = new int [][] {{3,5},{10,0},{7,3},{4,4},{7,0}, {10,0}, {10,0}, {7,3}, {0,6}, {9,1,5}};
        assertEquals(135,game.scoreGame(scores));

    }
}
