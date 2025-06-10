package com.mac190.finalReview;

public interface iSoccer {
    void setTeamA(String tA);
    void setTeamB(String tB);
    void setReferee(String ref);
    void teamAscored();
    void teamBScored();
    void substitutionA(int a);
    void substitutionB(int b);
    String whoIsWinning();
}