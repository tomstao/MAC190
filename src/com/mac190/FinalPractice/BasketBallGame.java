package com.mac190.FinalPractice;


public class BasketBallGame extends FinalGame {

    public BasketBallGame() {
        super();
        setTeamAPlayersNumber(5);
        setTeamBPlayersNumber(5);
    }

    public BasketBallGame(String teamAName, String teamBName) {
        this();
        setTeamAName(teamAName);
        setTeamBName(teamBName);
    }

    @Override
    public void TeamAScored(int score) {
        if (score > 3 || score < 0) {
            throw new IllegalArgumentException("Invalid score");
        }
        setTeamAScore(getTeamAScore() + score);
    }

    @Override
    public void TeamBScored(int score) {
        if (score > 3 || score < 0) {
            throw new IllegalArgumentException("Invalid score");
        }
        setTeamBScore(getTeamBScore() + score);
    }

    @Override
    public void TeamASubstitutes(int substitutes) {
        if (substitutes > 5 || substitutes < 0) {
            throw new IllegalArgumentException("Invalid substitutes");
        }
        setTeamASubstitutes(getTeamASubstitutes() + substitutes);
    }

    @Override
    public void TeamBSubstitutes(int substitutes) {
        if (substitutes > 5 || substitutes < 0) {
            throw new IllegalArgumentException("Invalid substitutes");
        }
        setTeamBSubstitutes(getTeamBSubstitutes() + substitutes);
    }

    @Override
    public String toString() {
        return "BasketBallGame{} " + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketBallGame)) {
            return false;
        }
        return super.equals(obj);
    }

    @Override
    public void action() {
        System.out.println("You can't kick the basket ball!");
    }
}
