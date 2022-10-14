import java.util.ArrayList;

public class Deck {

    public ArrayList<Card> deck;
    Card card;

    public Deck() {
        this.deck = new ArrayList<>();
    }

    public ArrayList getDeck() {
        return deck;
    }

    public ArrayList constructDeck() {
        for (CardValue v : CardValue.values()) {
            for (CardSuit s : CardSuit.values()) {
                card = new Card(v, s);
                deck.add(card);
            }
        }
        return deck;
    }
}



