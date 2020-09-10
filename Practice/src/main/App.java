/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.*;

/**
 *
 * @author 1styrGroupB
 */
public class App {

    Scanner input = new Scanner(System.in);

    int[] deck = new int[52];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private Boolean created = false;
    int remainingCards = 52;
    int count = 0;

    public void createDeck() {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        created = true;
        System.out.println("Created!");
    }

    public void shuffle() {
        if (created == true) {
            for (int i = 0; i < deck.length; i++) {
                int index = (int) (Math.random() * deck.length);
                int temp = deck[i];
                deck[i] = deck[index];
                deck[index] = temp;
            }
        } else {
            System.out.println("No cards to be shuffled");
        }

    }

    public void deal() {
        System.out.print("How many cards? ");
        int numCards = input.nextInt();
        if (created == true) {
            if (numCards > remainingCards || remainingCards == 0) {
                System.out.println("Not enough cards in deck!");
            } else {
                int numCardsLimit = numCards + count;
                for (int i = count; i < numCardsLimit; i++) {
                    String suit = suits[deck[i] / 13];
                    String rank = ranks[deck[i] % 13];
                    System.out.println(rank + " of " + suit);
                    count++;
                    remainingCards--;
                }
            }
        } else {
            System.out.println("Deck is Empty!");
        }

    }

    public void displayDeck() {
        if (created == true) {
            for (int i = count; i < 52; i++) {
                String suit = suits[deck[i] / 13];
                String rank = ranks[deck[i] % 13];
                System.out.println(rank + " of " + suit);
            }
        } else {
            System.out.println("Not yet Created");
        }
    }

}
