package us.EliSchultz;

public class Card {
    /**
     *
     *  There is not much to this class. it is jyst a card that hold 3 values
     *
     *  Face - The number or face present on the card
     *  Suit (Hearts, Spades, Diamonds, and Clubs"
     *  And value a number from 1-15 which asserts the rankings of cards.
     *  I don't nessacarly know how to do aces so they will have a value of 11
     */
    private String face, suit;

    private int value;

    public Card(String face, String suit, int value) {
        setFace(face);
        setSuit(suit);
        setValue(value);
    }

    public String getFace() {
        return face;
    }

    private void setFace(String face) {
        this.face = face;
    }

    public String getSuit() {
        return suit;
    }

    private void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    private void setValue(int value) {
        this.value = value;
    }
}
