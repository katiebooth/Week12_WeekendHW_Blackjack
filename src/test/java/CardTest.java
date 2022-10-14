import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    Card card1;
    Card card2;
    Card card3;
    Card card4;

    @Before
    public void setUp(){
        card1 = new Card(CardValue.ACE, CardSuit.CLUB);
        card2 = new Card(CardValue.FIVE, CardSuit.HEART);
        card3 = new Card(CardValue.JACK, CardSuit.DIAMOND);
        card4 = new Card(CardValue.KING, CardSuit.SPADE);
    }

    @Test
    public void hasValueCard1() {
        assertEquals(1, card1.getCardValue());
    }

    @Test
    public void hasValueCard2() {
        assertEquals(5, card2.getCardValue());
    }

    @Test
    public void hasValueCard3() {
        assertEquals(10, card3.getCardValue());
    }

    @Test
    public void hasValueCard4() {
        assertEquals(10, card4.getCardValue());
    }

    @Test
    public void hasSuitCard1() {
        assertEquals("club", card1.getCardSuit());
    }
        @Test
        public void hasSuitCard2() {
            assertEquals("heart", card2.getCardSuit());
        }
            @Test
            public void hasSuitCard3() {
                assertEquals("diamond", card3.getCardSuit());
            }

            @Test
                public void hasSuitCard4() {
                    assertEquals("spade", card4.getCardSuit());
                }
    }

