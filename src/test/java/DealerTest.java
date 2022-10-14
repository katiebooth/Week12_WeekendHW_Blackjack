import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Dealer dealer1;

    @Before
    public void setUp(){
        dealer = new Dealer("Mike", "Dealer");
        dealer1 = new Dealer("Mike", "Player");
    }

    @Test
    public void hasName(){
        assertEquals("Mike", dealer.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Dealer", dealer.getType());
    }

    @Test
    public void alwaysHasTypeDealer(){
        assertEquals("Dealer", dealer1.getType());
    }

    @Test
    public void hasZeroCardsInitially(){
        assertEquals(0, dealer.getCards().size());
    }
}
