package com.mac190.game;

import java.util.Objects;

public class SoccerGame extends Game implements IGame {

    private String refereeName;
    private final int maxSubstituted;

    public SoccerGame() {
        this.setPlayersNumber(11);
        maxSubstituted = 5;
//        this.setSubstituteNumber1(maxSubstituted);
//        this.setSubstituteNumber2(maxSubstituted);
        refereeName = "N/A";
    }

    public SoccerGame(int maxSubstituted, String refereeName) {
        this.maxSubstituted = maxSubstituted;
        this.refereeName = refereeName;
    }

    public SoccerGame(String team1, String team2, int playersNumber, float team1Score, float team2Score, int substituteNumber, int maxSubstituted, String refereeName) throws IllegalArgumentException {
        super(team1, team2, playersNumber, team1Score, team2Score, substituteNumber);
        this.maxSubstituted = maxSubstituted;
        this.refereeName = refereeName;
    }

    @Override
    public void team1Score(float team1Score) {
        this.team1Score += 1;
    }

    @Override
    public void team2Score(float team2Score) {
        this.team2Score += 1;
    }

    @Override
    public void substituteNumber1(int substituteNumber) throws IllegalArgumentException {
        if (substituteNumber > 3 || substituteNumber < 0 || substituteNumber > this.getSubstituteNumber1()) {
            throw new IllegalArgumentException("substituteNumber");
        }
        this.setSubstituteNumber1(this.getSubstituteNumber1() - substituteNumber);
    }

    @Override
    public void substituteNumber2(int substituteNumber) {
        if (substituteNumber > 3 || substituteNumber < 0 || substituteNumber > this.getSubstituteNumber1()) {
            throw new IllegalArgumentException("substituteNumber");
        }
        this.setSubstituteNumber2(this.getSubstituteNumber2() - substituteNumber);
    }

    public String getRefereeName() {
        return refereeName;
    }

    public void setRefereeName(String refereeName) {
        this.refereeName = refereeName;
    }

    public int getMaxSubstituted() {
        return maxSubstituted;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SoccerGame that = (SoccerGame) o;
        return maxSubstituted == that.maxSubstituted && Objects.equals(refereeName, that.refereeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refereeName, maxSubstituted);
    }

    @Override
    public String toString() {
        return "SoccerGame{} " + super.toString();
    }

    @Override
    public void setTeam1Score(int team1Score) {

    }

    @Override
    public void setTeam2Score(int team2Score) {

    }



    @Override
    public void setSubstitute1(int substitute) {

    }

    @Override
    public void setSubstitute2(int substitute) {

    }

    @Override
    public void setSubstitute3(int substitute) {

    }

    @Override
    public String whoIsWinner() {
        return "";
    }
}
