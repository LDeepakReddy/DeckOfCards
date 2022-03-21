package com.blz_deckofcards;

public class DeckOfCards {

    private String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    private final int SIZE_OF_DECK = suits.length * ranks.length;
    String[] deck = new String[SIZE_OF_DECK];

    public void cards() {

        System.out.println("Total cards in the Deck are--->" + SIZE_OF_DECK);

        for (int i = 0; i < deck.length; i++) {
            deck[i] = (suits[i / 13] + "------>" + ranks[i % 13]);
        }
    }

    public void display() {
        System.out.println("Cards are in the deck ");
        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i]);

        }
    }
}


