package com.mac190.FinalPractice;
//A.	Design a class Game that has the following instance variables and properties:
//        1.	Name of first team and name of second team
//2.	Number of players in each team (one single variable),
//3.	Score of first and second team
//4.	Number players substituted for teamA and teamB.
//- Provide a default constructor that sets names of teams to “Unknown”, number of players, substitutes and scores to 0.
//        - Provide a constructor that accepts specific values for each of the private members. Throw an exception (of your design) if the numbers are negative.
//        - Provide getters for each of the members
//- Provide setters for each of the private members. Throw an exception (of your design) if the numbers are negative.
//        - Provide abstract methods TeamAScored(int) and TeamBScored(int) that increases the score of the appropriate team by a specified value.
//        - Provide a method toString that returns all attributes of an object as a string
//- Provide a method equals that accepts an object Game and returns true if the object is equal to current object and false otherwise.
//-Provide abstract methods substitutionA(int) and substitutionB(int) to substitute a certain number of players
//- Provide a method WhoIsWinning that returns the name of the winning team or “Draw” if both have same score.

import java.util.Objects;

public abstract class FinalGame implements IAction {
    private String teamAName;
    private String teamBName;
    private int teamAPlayersNumber;
    private int teamBPlayersNumber;
    private int teamAScore;
    private int teamBScore;
    private int teamASubstitutes;
    private int teamBSubstitutes;

    public FinalGame() {
        teamAName = "N/A";
        teamBName = "N/A";
        teamAPlayersNumber = 0;
        teamBPlayersNumber = 0;
        teamAScore = 0;
        teamBScore = 0;
        teamASubstitutes = 0;
        teamBSubstitutes = 0;

    }

    public FinalGame(String teamBName, String teamAName, int teamAPlayersNumber,
                     int teamBPlayersNumber, int teamAScore, int teamBScore, int teamASubstitutes, int teamBSubstitutes)
            throws IllegalArgumentException {
        if (teamBPlayersNumber <= 0 && teamAPlayersNumber <= 0 && teamAScore <= 0 && teamBScore <= 0) {
            throw new IllegalArgumentException("Both players and players must be set");
        }
        this.teamBName = teamBName;
        this.teamAName = teamAName;
        this.teamAPlayersNumber = teamAPlayersNumber;
        this.teamBPlayersNumber = teamBPlayersNumber;
        this.teamAScore = teamAScore;
        this.teamBScore = teamBScore;
        this.teamASubstitutes = teamASubstitutes;
        this.teamBSubstitutes = teamBSubstitutes;
    }

    public FinalGame(int number) throws IllegalArgumentException {
        this();
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        setTeamAPlayersNumber(number);
        setTeamBPlayersNumber(number);
    }

    public String getTeamAName() {
        return teamAName;
    }

    public void setTeamAName(String teamAName) {
        this.teamAName = teamAName;
    }

    public String getTeamBName() {
        return teamBName;
    }

    public void setTeamBName(String teamBName) {
        this.teamBName = teamBName;
    }

    public int getTeamAPlayersNumber() {
        return teamAPlayersNumber;
    }

    public void setTeamAPlayersNumber(int teamAPlayersNumber) {
        if (teamAPlayersNumber <= 0) {
            throw new IllegalArgumentException("Team player number must be greater than 0");
        }
        this.teamAPlayersNumber = teamAPlayersNumber;
    }

    public int getTeamBPlayersNumber() {
        return teamBPlayersNumber;
    }

    public void setTeamBPlayersNumber(int teamBPlayersNumber) {
        if (teamBPlayersNumber <= 0) {
            throw new IllegalArgumentException("Team player number must be greater than 0");
        }
        this.teamBPlayersNumber = teamBPlayersNumber;
    }

    public int getTeamAScore() {
        return teamAScore;
    }

    public void setTeamAScore(int teamAScore) {
        this.teamAScore = teamAScore;
    }

    public int getTeamBScore() {
        return teamBScore;
    }

    public void setTeamBScore(int teamBScore) {
        this.teamBScore = teamBScore;
    }

    public int getTeamASubstitutes() {
        return teamASubstitutes;
    }

    public void setTeamASubstitutes(int teamASubstitutes) {
        if (teamASubstitutes <= 0 || teamASubstitutes > this.teamASubstitutes) {
            throw new IllegalArgumentException("Team player substitutes must be greater than 0");
        }
        this.teamASubstitutes = teamASubstitutes;
    }

    public int getTeamBSubstitutes() {
        return teamBSubstitutes;
    }

    public void setTeamBSubstitutes(int teamBSubstitutes) {
        if (teamBSubstitutes <= 0 || teamBSubstitutes > this.teamBSubstitutes) {
            throw new IllegalArgumentException("Team player substitutes must be greater than 0");
        }
        this.teamBSubstitutes = teamBSubstitutes;
    }

    abstract public void TeamAScored(int score);
    abstract public void TeamBScored(int score);
    abstract public void TeamASubstitutes(int substitutes);
    abstract public void TeamBSubstitutes(int substitutes);

    public String whoSWinning() {
        if (teamAScore == teamBScore) {
            return "It's a tie now!";
        }
        return teamAScore > teamBScore ? "Team A is wining!" : "Team B is wining!";
    }

    @Override
    public String toString() {
        return "FinalGame{" +
                "teamAName='" + teamAName + '\'' +
                ", teamBName='" + teamBName + '\'' +
                ", teamAPlayersNumber=" + teamAPlayersNumber +
                ", teamBPlayersNumber=" + teamBPlayersNumber +
                ", teamAScore=" + teamAScore +
                ", teamBScore=" + teamBScore +
                ", teamASubstitutes=" + teamASubstitutes +
                ", teamBSubstitutes=" + teamBSubstitutes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FinalGame finalGame)) return false;
        return teamAPlayersNumber == finalGame.teamAPlayersNumber && teamBPlayersNumber == finalGame.teamBPlayersNumber && teamAScore == finalGame.teamAScore && teamBScore == finalGame.teamBScore && teamASubstitutes == finalGame.teamASubstitutes && teamBSubstitutes == finalGame.teamBSubstitutes && Objects.equals(teamAName, finalGame.teamAName) && Objects.equals(teamBName, finalGame.teamBName);
    }
}
