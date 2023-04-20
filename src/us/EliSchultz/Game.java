package us.EliSchultz;

/**
 * This is a class consisting of methods which check if any unique hands
 */
public class Game {

    /**
     *
     * @param hand an array of cards
     * @return if there are 4 of the same card in a deck
     */
    public static boolean isFourOfAKind(Card[] hand){
    int spadeCount = 0;
    int clubCount = 0;
    int diamondCount = 0;
    int heartsCount = 0;
        for (Card c : hand) {
            switch(c.getSuit()){
                    case "Hearts":

                        heartsCount += 1;

                    break;

                    case "Clubs":

                        clubCount += 1;

                    break;

                    case "Diamonds":

                        diamondCount += 1;

                    break;

                    case "Spades":

                        spadeCount += 1;

                    break;
            }

        }

        if(spadeCount == 4 || heartsCount == 4 || clubCount == 4 || diamondCount == 4){
            return true;
        }else{
            return false;
        }

    }

    /**
     *
     * @param hand is just the hand of cards supplied
     * @return will return true if all givin cards are off the same suite otherwise will return false
     */
    public static boolean Flush(Card[] hand){ // I was fucking around for this for a while but just ended up doing it lazy
        int spadeCount = 0;
        int clubCount = 0;
        int diamondCount = 0;
        int heartsCount = 0;
        int cardCount = 0;
        for (Card c : hand) {
            cardCount += 1;
            switch(c.getSuit()){
                case "Hearts":

                    heartsCount += 1;

                    break;

                case "Clubs":

                    clubCount += 1;

                    break;

                case "Diamonds":

                    diamondCount += 1;

                    break;

                case "Spades":

                    spadeCount += 1;

                    break;
            }

        }

        if(spadeCount == cardCount || heartsCount == cardCount || clubCount == cardCount || diamondCount == cardCount){
            return true;
        }else{
            return false;
        }

    }

    /**
     *
     * @param hand is just the hand of cards supplied
     * @return will be true if there is three cards of the same suite.
     */
    public static boolean ThreeOfAKind(Card[] hand){

        int spadeCount = 0;
        int clubCount = 0;
        int diamondCount = 0;
        int heartsCount = 0;
        for (Card c : hand) {
            switch(c.getSuit()){
                case "Hearts":

                    heartsCount += 1;

                    break;

                case "Clubs":

                    clubCount += 1;

                    break;

                case "Diamonds":

                    diamondCount += 1;

                    break;

                case "Spades":

                    spadeCount += 1;

                    break;
            }

        }

        if(spadeCount == 3 || heartsCount == 3 || clubCount == 3 || diamondCount == 3){
            return true;
        }else{
            return false;
        }

    }

    /**
     *
     * @param hand
     * @return will return true if all cards are of the same suite
     */
    public static boolean FullHouse(Card[] hand){

        int spadeCount = 0;
        int clubCount = 0;
        int diamondCount = 0;
        int heartsCount = 0;
        for (Card c : hand) {
            switch(c.getSuit()){
                case "Hearts":

                    heartsCount += 1;

                    break;

                case "Clubs":

                    clubCount += 1;

                    break;

                case "Diamonds":

                    diamondCount += 1;

                    break;

                case "Spades":

                    spadeCount += 1;

                    break;
            }

        }

        if(spadeCount > 0 && heartsCount > 0 && clubCount > 0 && diamondCount > 0){
            return true;
        }else{
            return false;
        }
    }
}
