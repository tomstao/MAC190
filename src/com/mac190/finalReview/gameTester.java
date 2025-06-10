package com.mac190.finalReview;

public class gameTester {
    public static void main(String[] args) {
        //create a Soccer game
        Soccer S = new Soccer("Dortmun", "Real Madrid", "The bold guy");
        try {
            S.teamAScored(4);
            System.out.println("S: " + S);
            S.teamBScored(3);
            S.teamAScored(4);
            System.out.println("S: " + S);
            iSoccer S1 = new Soccer("sd", "asdas", "sda");
            S1.teamAscored();
            S1.teamBScored();
            System.out.println("S1: " + S1);
            S1.substitutionA(3);
            S1.substitutionB(6);
        }catch(Exception e){
            System.out.println("Exception: " + e.getMessage());
            System.exit(1);
        }

    }
}