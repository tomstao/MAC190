package com.mac190.finalReview;

import java.util.Objects;

abstract class Game {
    private int numberPlayers;
    private String teamA, teamB;
    protected int scoreA, scoreB;
    private int substitutedA, substitutedB;

    public Game(){
        numberPlayers = 0;
        scoreA = 0;
        scoreB = 0;
        substitutedA = 0;
        substitutedB = 0;
        teamA = "N/A";
        teamB = "N/A";
    }
    //throws a checked exception
    public Game(String tA, String tB, int p) throws Exception{
        if(p <= 0) {
            throw new Exception("Number of player should be >= 1");
        }
        numberPlayers = p;
        scoreA = 0;
        scoreB = 0;
        substitutedA = 0;
        substitutedB = 0;
        teamA = tA;
        teamB = tB;
    }

    public int getNumberPlayers() {
        return numberPlayers;
    }

    public void setNumberPlayers(int numberPlayers) throws Exception{
        if(numberPlayers < 1){
            throw new Exception("Number of players cannot be < 1");
        }
        this.numberPlayers = numberPlayers;
    }

    public String getTeamA() {
        return teamA;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }
    public int getScoreA() {
        return scoreA;
    }
    public int getScoreB() {
        return scoreB;
    }
    public int getSubstitutedA() {
        return substitutedA;
    }
    public void setSubstitutedA(int substitutedA) {
        this.substitutedA = substitutedA;
    }
    public int getSubstitutedB() {
        return substitutedB;
    }
    public void setSubstitutedB(int substitutedB) {
        this.substitutedB = substitutedB;
    }
    abstract void teamAScored(int a) throws Exception;
    abstract void teamBScored(int a) throws Exception;
    abstract void substitutionA(int a);
    abstract void substitutionB(int a);
    public String whoIsWinning(){
        if(scoreA > scoreB){
            return teamA;
        }else if(scoreB > scoreA){
            return teamB;
        }else{
            return "Draw";
        }
    }

    @Override
    public String toString() {
        return "Game{" +
                "numberPlayers=" + numberPlayers +
                ", teamA='" + teamA + '\'' +
                ", teamB='" + teamB + '\'' +
                ", scoreA=" + scoreA +
                ", scoreB=" + scoreB +
                ", substitutedA=" + substitutedA +
                ", substitutedB=" + substitutedB +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game game)) return false;
        return numberPlayers == game.numberPlayers && scoreA == game.scoreA && scoreB == game.scoreB && substitutedA == game.substitutedA && substitutedB == game.substitutedB && Objects.equals(teamA, game.teamA) && Objects.equals(teamB, game.teamB);
    }

}