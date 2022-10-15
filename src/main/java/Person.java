import java.util.ArrayList;

public abstract class Person {

    private String name;
    protected String type;

    public ArrayList<Card> cards;

    public Person(String name, String type) {
        this.name = name;
        this.type = type;
        this.cards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public ArrayList getCards() {
        return cards;
    }

    public int calculateScore(){
        int score = 0;
        for (Card card : this.cards){
            score += card.getCardValue();
        }
        return score;
    }

    public void printHand(){
        for (Card card : this.cards){
            System.out.println(this.type + " has "+ card.getCardValue() + " of " + card.getCardSuit()+"s");
        }
    }

}
