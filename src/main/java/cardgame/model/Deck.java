package cardgame.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    //Array to store cards, because we don't care about order
    ArrayList<PlayingCard> cards;

    // Put the cards in random order by shuffle deck
    // Go through every card & swap a card to a different location
    public Deck(){
        cards = new ArrayList<PlayingCard> ();
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                System.out.println("Creating card: [" + rank + "]");
                cards.add(new PlayingCard(rank, suit));
            }
        }
        shuffle();
    }

    // Collection swap method ensure we don't swap cards to the same place
    public void shuffle() {
        Random random = new Random();
        for (int i = 0; i < cards.size(); i++) {
            Collections.swap(cards, i, random.nextInt (cards.size()));
        }
    }

    // Remove card of top of deck
    public PlayingCard removeTopCard(){
        return cards.remove(0);
    }

    public void returnCardTodDeck(PlayingCard pc) {
        cards.add(pc);
    }
}
