public enum CardValue {
    ACE(1, "Ace"),
    TWO(2, "2"),
    THREE(3, "3"),
    FOUR(4, "4"),
    FIVE(5, "5"),
    SIX(6, "6"),
    SEVEN(7, "7"),
    EIGHT(8, "8"),
    NINE(9, "9"),
    TEN(10, "10"),
    JACK(10, "Jack"),
    QUEEN(10, "Queen"),
    KING(10, "King");

    private int value;
    private String name;

    CardValue(int value, String name){
        this.value = value;
        this.name = name;
    }

    public int getCardValueFromEnum() {
        return value;
    }

    public String getCardNameFromEnum() {
        return name;
    }


}

