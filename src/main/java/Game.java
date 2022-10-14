import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Game {
    Player player;
    Dealer dealer;
    Deck deck;

    public Game(Player player, Dealer dealer, Deck deck) {
        this.player = player;
        this.dealer = dealer;
        this.deck = deck;
    }
//        shuffle the deck
        public void shuffleDeck(){
            ArrayList unshuffledDeck = deck.constructDeck();
            Collections.shuffle(unshuffledDeck);
        }

        //give 2 cards to player
//        public void dealCardPlayer(Player player, Card card){
//            player.cards.add(deck(0));
//            player.cards.add(deck(1));
//        }

        //give 2 cards to dealer

//        public void dealCardDealer(Dealer dealer, Card card){
//            dealer.cards.add(deck());
//    }

    //calculate player score
    //calculate dealer score
    //compare and declare the winner
    }

