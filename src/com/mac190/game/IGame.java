package com.mac190.game;

public interface IGame {
    void setTeam1(String team1);
    void setTeam2(String team2);
    void setTeam1Score(int team1Score);
    void setTeam2Score(int team2Score);
    void setSubstitute1(int substitute);
    void setSubstitute2(int substitute);
    void setSubstitute3(int substitute);
    String whoIsWinner();
}
