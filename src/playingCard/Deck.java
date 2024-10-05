package playingCard;

import java.util.ArrayList;
import java.util.Random;

public class Deck extends ArrayList<Card> {

    // Constructor - starts an empty deck
    public Deck() { }
    

    // Create methods/behaviors of the Deck


    // 1. Create a new deck
    public Deck newDeck() {
        String[] suits = {"Diamond", "Heart", "Club", "Spade"};
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        // Assign suits and values into each Card to create a deck of 52 cards 
        for (String s : suits) {
            for (String v : values) {
                Card newCard = new Card();
                newCard.setSuit(s);
                newCard.setValue(v);
                this.add(newCard);
            }
        }
        return this;
    }

    // 2. Draw a card
    public void drawCard() {
        drawCard(0);
    }

    public void drawCard(int index) {
        System.out.printf("drew %s of %s", this.get(index).getValue(), this.get(index).getSuit());
        this.remove(index);
    }

    // 3. Shuffle the deck
    public void shuffleDeck() {

        Random rand = new Random();

        for (int i = this.size() - 1; i > 0; i--) {
            int j = rand.nextInt(this.size());
            // swap array[i] with the element at random index
            Card temp = this.get(i);
            this.set(i, this.get(j));
            this.set(j, temp);
        }
    }
}


// Areas for improvement
// 1. Do not have to extend ArrayList, you just have to create a member that is Card[] or any collection of Card
// private Card[] cards = new Card[52];

// 2. Since Suits and values will never be changed, we can set it as FINAL