package com.mac190.finalReview;

public class BasketBall extends Game{
    public BasketBall()throws Exception{
        super("N/A", "N/A", 5);
    }
    public BasketBall(String tA, String tB)throws Exception{
        super(tA, tB, 5);
    }
    @Override
    void teamAScored(int a) throws Exception{
        if(a < 0 || a > 3){
            throw new Exception("Invalid number of points");
        }
        scoreA += a;
    }
    @Override
    void teamBScored(int a) throws Exception{
        if(a < 0 || a > 3){
            throw new Exception("Invalid number of points");
        }
        scoreB += a;
    }
    @Override
    void substitutionA(int a) {
        if(a < 0 || a > 5){
            throw new IllegalArgumentException("Invalid number of substitutions");
        }
        this.setSubstitutedA(this.getSubstitutedA()+a);
    }
    @Override
    void substitutionB(int a) {
        if(a < 0 || a > 5){
            throw new IllegalArgumentException("Invalid number of substitutions");
        }
        this.setSubstitutedB(this.getSubstitutedB()+a);
    }
}