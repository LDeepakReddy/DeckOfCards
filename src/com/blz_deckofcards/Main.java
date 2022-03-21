package com.blz_deckofcards;


public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Deck Of Cards program");
        DeckOfCards card=new DeckOfCards();
        card.cards();
       card.display();
       Players.numOfPlayers();
    }
}
