package com.blz.deckofcards;

import java.util.Scanner;

public class Players extends DeckOfCards {
    public static int numOfPlayers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of players ");
        int player = sc.nextInt();
        if (player >= 2 && player <= 4) {
            System.out.println(player + " players will play the game");
            //sequenceOfPlay(player);
        } else {
            System.out.println("Enter the players in range");
        }

        return player;
    }

    public static void sequenceOfPlay(int player) {
        for (int i = 1; i <= player; i++) {
            System.out.println("Player " + i + " Getting card:");
            shuffle(playCards);
        }
    }

}
