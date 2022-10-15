public class Runner {

    public static void main(String[] args) {
        Player player;
        Dealer dealer;
        Game game;
        Deck deck;
        player = new Player("Katie", "Player");
        dealer = new Dealer("Mike", "Dealer");
        deck = new Deck();
        game = new Game(player, dealer, deck);

        game.calculateWinner();
        
    }
}