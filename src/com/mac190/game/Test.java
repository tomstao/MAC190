package com.mac190.game;

public class Test {
    public static void main(String[] args) {

        SoccerGame sc = new SoccerGame();
        BasketBall basketBall = new BasketBall();
        System.out.println(sc);
        System.out.println(basketBall);
        sc.setTeam1("");

        sc.substituteNumber2(-5);
    }
}
