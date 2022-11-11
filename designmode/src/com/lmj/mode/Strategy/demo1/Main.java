package com.lmj.mode.Strategy.demo1;

public class Main {
    public static void main(String[] args) {
        int seed1 = 1;
        int seed2 = 2;
        Player player1 = new Player("Tim",new WinningStrategy(seed1));
        Player player2 = new Player("Mary",new RandomStrategy(seed2));
        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)){
                System.out.println("Winner:"+player1);
                player1.win();
                player2.lose();
            }else if (nextHand2.isStrongerThan(nextHand1)){
                System.out.println("Winner:"+player2);
                player1.lose();
                player2.win();
            }else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
