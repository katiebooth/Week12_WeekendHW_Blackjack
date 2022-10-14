import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Player player;
    Dealer dealer;
    Game game;
    Deck deck;

    @Before
    public void setUp() {
        player = new Player("Katie", "Player");
        dealer = new Dealer("Mike", "Dealer");
        deck = new Deck();
        game = new Game(player, dealer, deck);
    }

    @Test
    public void shuffledDeckHas52Cards() {
        game.shuffleDeck();
        assertEquals(52, deck.getDeck().size());
    }
}

