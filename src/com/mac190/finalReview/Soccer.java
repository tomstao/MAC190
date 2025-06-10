package com.mac190.finalReview;

import java.util.Objects;

public class Soccer extends Game implements iSoccer{
    private String referee;
    private final int maxSubstitutes = 5;
    public Soccer(){
        //   super("N/A", "N/A", 11);
        try {
            this.setNumberPlayers(11);
            referee = "N/A";
        }catch(Exception e){}
    }
    public Soccer(String tA, String tB, String ref){
        this();
        this.setTeamB(tB);
        this.setTeamA(tA);
        referee = ref;
    }
    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    @Override
    public void teamAscored() {
        teamAScored(1);
    }

    @Override
    public void teamBScored() {
        teamBScored(1);
    }

    @Override
    void teamAScored(int a) {
        scoreA += 1;
    }
    @Override
    void teamBScored(int a) {
        scoreB += 1;
    }
    @Override
    public void substitutionA(int a) {
        if(a < 0 || a > 3){
            throw new IllegalArgumentException("Invalid number substitutions");
        }
        if(this.getSubstitutedA() + a > 5){
            throw new IllegalArgumentException("Cannot substitute more than 5 players");
        }
        this.setSubstitutedA(this.getSubstitutedA() + a);
    }
    @Override
    public void substitutionB(int a) {
        if(a < 0 || a > 3){
            throw new IllegalArgumentException("Invalid number substitutions");
        }
        if(this.getSubstitutedB() + a > 5){
            throw new IllegalArgumentException("Cannot substitute more than 5 players");
        }
        this.setSubstitutedB(this.getSubstitutedB() + a);
    }
    @Override
    public String toString() {
        return "Soccer{" +
                "referee='" + referee + '\'' +
                ", maxSubstitutes=" + maxSubstitutes +
                "} " + super.toString();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Soccer)) return false;
        if (!super.equals(o)) return false;
        Soccer soccer = (Soccer) o;
        return maxSubstitutes == soccer.maxSubstitutes && Objects.equals(referee, soccer.referee);
    }


}