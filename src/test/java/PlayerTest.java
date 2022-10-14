import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Player player2;
    Card card;

    @Before
    public void setUp(){
        player = new Player("Katie","Player");
        player2 = new Player("Katie","Dealer");
        card = new Card(CardValue.ACE, CardSuit.SPADE);

    }

    @Test
    public void hasName(){
        assertEquals("Katie", player.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Player", player.getType());
    }

    @Test
    public void alwaysHasTypeDealer(){
        assertEquals("Player", player2.getType());
    }

    @Test
    public void hasZeroCardsInitially(){
        assertEquals(0, player.getCards().size());
    }

    @Test
    public void canAddCard(){
        player.addCardToCards(card);
        player.addCardToCards(card);
        player.addCardToCards(card);
        player.addCardToCards(card);
        player.addCardToCards(card);
        assertEquals(5, player.getCards().size());
    }
}
