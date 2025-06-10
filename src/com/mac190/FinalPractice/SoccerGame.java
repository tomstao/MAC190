package com.mac190.FinalPractice;


import java.util.Objects;

public class SoccerGame extends FinalGame{
    private String principalReferee;
    final private int maxSubstitue;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SoccerGame soccerGame)) return false;
        return super.equals(o) && Objects.equals(soccerGame.principalReferee, this.principalReferee) && soccerGame.maxSubstitue == this.maxSubstitue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(principalReferee, maxSubstitue);
    }

    public SoccerGame() {
        super();
        principalReferee = "N/A";
        maxSubstitue = 5;
        setTeamAPlayersNumber(11);
        setTeamBPlayersNumber(11);
    }

    public SoccerGame(String principalReferee, String teamAName, String teamBName) {
        this();
        setTeamAName(teamAName);
        setTeamBName(teamBName);
        this.principalReferee = principalReferee;
    }

    @Override
    public void TeamAScored(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("Score cannot be negative");
        }
        setTeamAPlayersNumber(getTeamAScore() + 1);
    }

    @Override
    public void TeamBScored(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("Score cannot be negative");
        }
        setTeamBPlayersNumber(getTeamBScore() + 1);
    }

    @Override
    public void TeamASubstitutes(int substitutes) {
        if (substitutes > maxSubstitue || substitutes < 0 || substitutes > getTeamASubstitutes() || substitutes > 3) {
            throw new IllegalArgumentException("substitutes must be between 0 and maxSubstitue");
        }
        setTeamASubstitutes(getTeamASubstitutes() - substitutes);
    }

    @Override
    public void TeamBSubstitutes(int substitutes) {
        if (substitutes > maxSubstitue || substitutes < 0 || substitutes > getTeamBSubstitutes() || substitutes > 3) {
            throw new IllegalArgumentException("substitutes must be between 0 and maxSubstitue");
        }
        setTeamBSubstitutes(getTeamBSubstitutes() - substitutes);
    }

    @Override
    public String toString() {
        return "SoccerGame{" +
                "principalReferee='" + principalReferee + '\'' +
                ", maxSubstitue=" + maxSubstitue +
                "} " + super.toString();
    }


    @Override
    public void action() {
        System.out.println("You can't use your hand to touch the ball!");
    }
}
