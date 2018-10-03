public class TennisGame {

    private static String printScoreName(int m_score1){
        String score ="";
        if(m_score1 == 0) score ="Love-All";
        else if(m_score1 == 1) score ="Fifteen-All";
        else if(m_score1 == 2) score ="Thirty-All";
        else if(m_score1 == 3) score ="Forty-All";
        else score = "Deuce";
        return score;
    }
    private static int getMinusResult(int m_score1,int m_score2){
        return m_score1-m_score2;
    }
    private static String getResult(int minusResult){
        String score ="";
        if(minusResult == 1) score ="Advantage player1";
        else if(minusResult==-1) score="Advantage player2";
        else if(minusResult>=2) score="Win for player1";
        else score="Win for player2";
        return score;
    }
    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        boolean isSameScore = m_score1 == m_score2;
        boolean pass4Scores = (m_score1>=4 || m_score2>=4);
        String score ="";
        int tempScore=0;
        if (isSameScore) score = printScoreName(m_score1);
        else if (pass4Scores)
        {
            int minusResult = getMinusResult(m_score1,m_score2);
            score = getResult(minusResult);
        }
        else score = mainRun(m_score1,m_score2);
        return score;
    }
    private static String mainRun(int m_score1,int m_score2){
        int tempScore =0;
        String score="";
        for (int i=1; i<3; i++)
        {
            if (i==1) tempScore = m_score1;
            else {
                score+="-"; tempScore = m_score2;
            }
            if(tempScore==0) score+="Love";
            if(tempScore==1) score+="Fifteen";
            if(tempScore==2) score+="Thirty";
            if(tempScore==3) score+="Forty";
        }
        return score;
    }

}
