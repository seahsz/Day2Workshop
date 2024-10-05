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


// Areas for improvement
// 1. making members suit & value FINAL
// 2. Do not have set_____ for suit and value since they are meant to be final; instead assign the values through the constructor

    // public Card(String suit, String value) {
    //     this.suit = suit;
    //     this.value = value;
    // }
