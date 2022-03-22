package com.blz.deckofcards;

import java.util.ArrayList;

public class DeckOfCards {

    public static ArrayList<String> playCards = new ArrayList<>();

    public ArrayList<String> makeADeck() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int sizeOfDeck = suits.length * ranks.length;
        //String[] deck = new String[sizeOfDeck];
        System.out.println("Total cards in the Deck are--->" + sizeOfDeck);

        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {

                playCards.add(suits[j] + "----->" + ranks[i]);
            }
        }
        display(playCards);
        return playCards;
    }


    public static void display(ArrayList<String> playCards) {
        System.out.println("Cards in the deck ");
        for (String element : playCards) {

            System.out.println(element);
        }
    }

    public static void shuffle(ArrayList<String> playCards) {
        System.out.println("Shuffling the cards");
        ArrayList<String> temp = new ArrayList<>();
        while (!playCards.isEmpty()) {
            int random = (int) (Math.random() * playCards.size());
            temp.add(playCards.get(random));
            playCards.remove(random);
        }
        playCards = temp;
        display(playCards);

    }

}


