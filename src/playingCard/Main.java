package playingCard;

public class Main {

    public static void main(String[] args) {
        
        Deck deck1 = new Deck();

        System.out.println(deck1.size());

        deck1 = deck1.newDeck();

        System.out.println(deck1.size());

        deck1.shuffleDeck();

        deck1.remove(5);

        System.out.println(deck1.size());


    }
    
}
