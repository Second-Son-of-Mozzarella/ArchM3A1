package us.EliSchultz.test;

import org.junit.Before;
import org.junit.Test;
import us.EliSchultz.Card;
import us.EliSchultz.Game;

import static org.junit.Assert.*;

public class GameTest {

    private Card[] hand;


    @Before
    public void setUp(){
        hand = new Card[]{new Card("Jack", "Clubs", 11), new Card("Queen", "Clubs", 12), new Card("King", "Clubs", 13), new Card("Ace", "Clubs", 14), new Card("Two", "Hearts", 2)};
    }


    @Test
    public void fourOfAKindTest() {
        assertTrue("Four of a kind should match", Game.isFourOfAKind(hand));
        // assertFalse("Four of a kind shouldn't match", Game.isFourOfAKind(hand));


    }


    @Test
    public void threeOfAKindTest(){
        // assertTrue("Three of the cards match suite", Game.ThreeOfAKind(hand));
        assertFalse("Three of the cards match suite", Game.ThreeOfAKind(hand));
    }

    @Test
    public void flushTest(){
        // assertTrue("The suite is a flush", Game.Flush(hand));
        assertFalse("The suite isn't a flush", Game.Flush(hand));
    }


    @Test
    public void FullHouseTest(){
        //assertTrue("The suite is a full house", Game.FullHouse(hand));
        assertFalse("The suite isn't a full house", Game.FullHouse(hand));
    }
}
