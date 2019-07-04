class Field {
    private String value;
    int x;
    int y;

    Field(String fieldValue, int yCord, int xCord) {
        value = fieldValue;
        y = yCord;
        x = xCord;
    }


    //checks is box is empty. If it is empty returns true
    boolean check() {
        return (this.value.equals(" "));
    }

    void setValue(String value) {
        this.value = value;
    }

    String getValue() {
        return value;
    }
}
