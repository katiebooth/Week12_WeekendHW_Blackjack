public enum CardSuit {
    HEART("heart"),
    CLUB("club"),
    SPADE("spade"),
    DIAMOND("diamond");

    private final String suit;

    CardSuit(String suit){
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }
}
