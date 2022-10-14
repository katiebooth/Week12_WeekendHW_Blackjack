import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck deck;

    @Before
    public void setup(){
        deck = new Deck();
    }

    @Test
    public void deckInitiallyHasZeroCards(){
        assertEquals(0, deck.getDeck().size());
    }

    @Test
    public void deckHas52Cards(){
        deck.constructDeck();
        assertEquals(52, deck.getDeck().size());
    }
}
