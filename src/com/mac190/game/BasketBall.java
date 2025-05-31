package com.mac190.game;

public class BasketBall extends Game {

    public BasketBall() {
        super();
        this.setPlayersNumber(5);
    }

    public BasketBall(String team1, String team2, float team1Score, float team2Score, int substituteNumber) throws IllegalArgumentException {

        super(team1, team2, 5, team1Score, team2Score, substituteNumber);
    }

    @Override
    public void team1Score(float team1Score) throws IllegalArgumentException {
        if (team1Score < 0 || team1Score > 3) {
            throw new IllegalArgumentException(
                    "team1Score must be between 0 and 3"
            );
        }
        this.team1Score += team1Score;
    }

    @Override
    public void team2Score(float team2Score) {
        if (team2Score < 0 || team2Score > 3) {
            throw new IllegalArgumentException(
                    "team1Score must be between 0 and 3"
            );
        }
        this.team2Score += team2Score;
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

}
