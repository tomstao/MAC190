package com.mac190.game;

import java.util.Objects;

public abstract class Game {

    private String team1;
    private String team2;
    private  int playersNumber;
    protected float team1Score;
    protected float team2Score;
    private int substituteNumber1 ;
    private int substituteNumber2 ;

    public Game() {
        team1 = team2 = "Unknown";
        playersNumber = 0;
        team1Score = 0;
        team2Score = 0;
        substituteNumber1 = 0;
        substituteNumber2 = 0;
    }

    public Game(String team1, String team2, int playersNumber, float team1Score, float team2Score, int substituteNumber) throws IllegalArgumentException {
        if( playersNumber < 0 || substituteNumber < 0 ) {
            throw new IllegalArgumentException(
                    "playersNumber and substituteNumber must be non-negative"
            );
        }
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public int getPlayersNumber() {
        return playersNumber;
    }

    public void setPlayersNumber(int playersNumber) throws IllegalArgumentException {
        if( playersNumber < 0) {
            throw new IllegalArgumentException(
                    "playersNumber must be non-negative"
            );
        }
        this.playersNumber = playersNumber;
    }

    public float getTeam1Score() {
        return team1Score;
    }

    public void setTeam1Score(float team1Score) {
        this.team1Score = team1Score;
    }

    public float getTeam2Score() {
        return team2Score;
    }

    public void setTeam2Score(float team2Score) {
        this.team2Score = team2Score;
    }

    public int getSubstituteNumber() {
        return substituteNumber1;
    }

    public void setSubstituteNumber(int substituteNumber) throws IllegalArgumentException {
        if( substituteNumber < 0 ) {
            throw new IllegalArgumentException(
                    "substituteNumber must be non-negative"
            );
        }
        this.substituteNumber1 = substituteNumber;
    }

    public abstract void team1Score(float team1Score);
    public abstract void team2Score(float team2Score);
    public abstract void substituteNumber1(int substituteNumber) throws Exception;
    public abstract void substituteNumber2(int substituteNumber) throws Exception   ;

    public int getSubstituteNumber1() {
        return substituteNumber1;
    }

    public void setSubstituteNumber1(int substituteNumber1) {
        this.substituteNumber1 = substituteNumber1;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return playersNumber == game.playersNumber && Float.compare(team1Score, game.team1Score) == 0 && Float.compare(team2Score, game.team2Score) == 0 && substituteNumber1 == game.substituteNumber1 && substituteNumber2 == game.substituteNumber2 && Objects.equals(team1, game.team1) && Objects.equals(team2, game.team2);
    }

    public int getSubstituteNumber2() {
        return substituteNumber2;
    }

    public void setSubstituteNumber2(int substituteNumber2) {
        this.substituteNumber2 = substituteNumber2;
    }

    @Override
    public String toString() {
        return "Game{" +
                "team1='" + team1 + '\'' +
                ", team2='" + team2 + '\'' +
                ", playersNumber=" + playersNumber +
                ", team1Score=" + team1Score +
                ", team2Score=" + team2Score +
                ", substituteNumber1=" + substituteNumber1 +
                ", substituteNumber2=" + substituteNumber2 +
                '}';
    }

    public String inWinning() {

        return team1Score > team2Score ? team1 : team2 + " is winning!";
    }
}
