import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Game {
    Player player;
    Dealer dealer;
    Deck deck;

    Card card;

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

        //deal 2 cards to player
        public void dealCardsToPlayer(){
            ArrayList unshuffledDeck = deck.constructDeck();
            Collections.shuffle(unshuffledDeck);
            player.getCards().add(unshuffledDeck.get(0));
            player.getCards().add(unshuffledDeck.get(1));
        }

        //deal 2 cards to dealer

        public void dealCardsToDealer(){
            ArrayList unshuffledDeck = deck.constructDeck();
            Collections.shuffle(unshuffledDeck);
            dealer.getCards().add(unshuffledDeck.get(2));
            dealer.getCards().add(unshuffledDeck.get(3));
    }


    public void calculateWinner(){
        ArrayList unshuffledDeck = deck.constructDeck();
        Collections.shuffle(unshuffledDeck);
        player.getCards().add(unshuffledDeck.get(0));
        player.getCards().add(unshuffledDeck.get(1));
        int playerScore = player.calculateScore();
        dealer.getCards().add(unshuffledDeck.get(2));
        dealer.getCards().add(unshuffledDeck.get(3));
        int dealerScore = dealer.calculateScore();
        player.printHand();
        dealer.printHand();
        if(playerScore > dealerScore){
            System.out.println(player.getName()+" has "+playerScore+". "+dealer.getName()+" has " + dealerScore+". "+player.getName()+ " has beaten "+dealer.getName()+"!");
        }
        else if(playerScore == dealerScore){
            System.out.println(player.getName()+" has "+playerScore+". "+dealer.getName()+" has " + dealerScore+". It's a tie!");
        }
        else {
            System.out.println(player.getName()+" has "+playerScore+". "+dealer.getName()+" has " + dealerScore+". "+dealer.getName()+ " has beaten "+player.getName()+"!");
        }
    }
    }


    //for TDD incremental approach

//calculate scores
//        public int calculatePlayerScoreUnshuffledDeckForTesting(){
//            ArrayList unshuffledDeck = deck.constructDeck();
//            System.out.println(deck.getDeck());
////            Collections.shuffle(unshuffledDeck);
//            System.out.println(deck.getDeck());
//            player.getCards().add(unshuffledDeck.get(0));
//            player.getCards().add(unshuffledDeck.get(1));
//            System.out.println(player.getCards());
//            return player.calculateScore();
//        }
//
//    public int calculateDealerScoreUnshuffledDeckForTesting(){
//        ArrayList unshuffledDeck = deck.constructDeck();
////            Collections.shuffle(unshuffledDeck);
//        dealer.getCards().add(unshuffledDeck.get(2));
//        dealer.getCards().add(unshuffledDeck.get(3));
//        return dealer.calculateScore();
//    }


