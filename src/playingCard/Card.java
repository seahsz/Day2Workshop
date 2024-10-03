package playingCard;

public class Card {
    
    // Attribute/Member of Card
    protected String suit;
    protected String value;
    
    // Constructor for Card
    public Card() { }

    // Getter and Setter for Members
    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}
