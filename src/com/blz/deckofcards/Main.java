package com.blz.deckofcards;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Deck Of Cards program");
        DeckOfCards card = new DeckOfCards();
        card.makeADeck();
        int number = Players.numOfPlayers();
        Players.sequenceOfPlay(number);
    }
}
