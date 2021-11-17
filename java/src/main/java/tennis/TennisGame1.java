package tennis;

import java.util.HashMap;
import java.util.Map;

public class TennisGame1 implements TennisGame {

    private int score1 = 0;
    private int score2 = 0;
    private String player1Name;
    private String player2Name;
    private Map<Integer,String> scoresMap=new HashMap<>();
    private Map<Integer,String> scoresTempMap=new HashMap<>();
    
    public void initScoresMap(){
    scoresMap.put(0, "Love-All");
    scoresMap.put(1, "Fifteen-All");
    scoresMap.put(2, "Thirty-All");    
    }
    
    public void initScoresTempMap(){
    	scoresTempMap.put(0, "Love");
    	scoresTempMap.put(1, "Fifteen");
    	scoresTempMap.put(2, "Thirty");    
    	scoresTempMap.put(3, "Forty");    
    }
    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        initScoresMap();
        initScoresTempMap();
    }

    public void wonPoint(String playerName) {
        if (playerName == "player1")
            score1 += 1;
        else
            score2 += 1;
    }

    public String getScore() {
        String score = "";
        int tempScore = 0;
        if (score1 == score2) {
            score = getEqualScore(score1);
        } else if (score1 >= 4 || score2 >= 4) {
            int minusResult = score1 - score2;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = score1;
                else {
                    score += "-";
                    tempScore = score2;
                }
                /*switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }*/
                score+=scoresTempMap.get(tempScore);
            }
        }
        return score;
    }

    private String getEqualScore(int score1) {
        return scoresMap.getOrDefault(score1,"Deuce");

    }
}
