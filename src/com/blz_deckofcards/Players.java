package com.blz_deckofcards;

import java.util.Scanner;

public class Players {
    public static void numOfPlayers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of players ");
        int player = sc.nextInt();
        if (player >= 2 && player <= 4) {
            System.out.println(player + " players will play the game");
        } else {
            System.out.println("Enter the players in range");
        }


    }

}
