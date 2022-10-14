public class Dealer extends Person{

    public Dealer(String name, String type) {
        super(name, type);
    }

    @Override
    public String getType(){
        return this.type = "Dealer";
    }

}
