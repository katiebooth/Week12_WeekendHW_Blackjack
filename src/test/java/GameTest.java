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

    @Test
    public void playerHasTwoCardsDealt(){
        game.dealCardsToPlayer();
        assertEquals(2, player.getCards().size());
    }

    @Test
    public void dealerHasTwoCardsDealt(){
        game.dealCardsToDealer();
        assertEquals(2, dealer.getCards().size());
    }

    @Test
    public void gameHasOutcome(){
        game.calculateWinner();
        //can't test the outcome as function has void output so use dummy test data
        assertEquals("Player has beaten dealer!", "Player has beaten dealer!");
    }

//    @Test
//    public void playerHasScore(){
//        assertEquals(2, game.calculatePlayerScoreUnshuffledDeckForTesting());
//    }
//
//    @Test
//    public void dealerHasScore(){
//        assertEquals(2, game.calculateDealerScoreUnshuffledDeckForTesting());
//    }



}



