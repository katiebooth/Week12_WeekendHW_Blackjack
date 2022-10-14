import java.util.ArrayList;

public class Player extends Person{

    Card card;

    public Player(String name, String type) {
        super(name, type);
    }

    @Override
    public String getType(){
       return this.type = "Player";
    }

    public void addCardToCards(Card card){
        this.getCards().add(card);
    }
}
