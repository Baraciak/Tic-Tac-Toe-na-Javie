class Field {
    String value;

    Field(String fieldValue) {
        value = fieldValue;
    }


    //checks is box is empty. If it is empty returns true
    boolean check() {
        return (this.value == " ");
    }

    void setValue(String value) {
        this.value = value;
    }
}
