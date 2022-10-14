import javax.smartcardio.Card;
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

}
