import java.util.function.Function;

class Board {
    Field[][] fieldsArr;


    Board(int xSize, int ySize){
        fieldsArr = new Field[ySize][xSize];
        fillBoardArr(xSize, ySize);
    }

    private void fillBoardArr(int xSize, int ySize){
        final String EMPTY_FIELD = " ";

        for(int y = 0; y < ySize; y++){
            Field[] tempArr = new Field[xSize];
            for(int x = 0; x < xSize; x++){
                Field field = new Field(EMPTY_FIELD, y, x);
                tempArr[x] = field;
            }
            fieldsArr[y] = tempArr;
        }
    }

    void show(){

        System.out.println("  -------------------  ");
        for (Field[] fieldArr: fieldsArr) {
            StringBuilder sb = new StringBuilder("  |  ");

            for (Field field: fieldArr) {
                sb.append(field.getValue()).append("  |  ");
            }

            System.out.println(sb.toString());
            System.out.println("  -------------------  ");
        }

    }

    boolean setField(int pos, String playerCharacter){
        int counter = 1;
        for (Field[] row: fieldsArr){
            for(Field field: row){
                if(counter == pos){
                    if(field.check()){
                        field.setValue(playerCharacter);
                        return false;
                    }
                }
                counter++;
            }
        }
        return true;
    }



    private Field findField(int pos, Board board){
        int counter = 1;
        for (Field[] row: fieldsArr){
            for(Field field: row){
                if(counter == pos){
                    return field;
                }
                counter++;
            }
        }
        return null;
    }

    void checkWin(int position, String playerCharacter){
        // .this == board bcs
        Field field = findField(position, this);
        int winSize = 1;
        int originX = field.x;
        int originY = field.y;

        //win counter counts every time program finds matching field
        int winCounter = 1;

//        System.out.println(">>>> 1.FIELD SELECTED BY USER  " +"X:"+ originX +"  Y: " + originY); //YOU CAN UNCOMMENT THESE TO SEE WHICH FIELD IS SELECTED

        //this two for loops iterates around selected field, by providing proper coordinates
        for(int y = -1; y <= winSize; y++){
            for(int x = -1; x <= winSize; x++){
                try{
                    Field currentField = this.fieldsArr[originY + y][originX + x];
                    //if current field is origin field - skip it
                    if( originX == currentField.x && originY == currentField.y ){ }
                    else {
                        // if current field value equals playerCharacter...
                        if (currentField.getValue().equals(playerCharacter)) {
                            winCounter++;
//                            System.out.println(">>>> 2.SECOND FIELD MATCHING " + "X:" + currentField.x + "  Y: " + currentField.y);


                            // ...get next in line value by appending to it the same coordinates as to previous field(x, y)
                            int nextFromCurrentValueX = currentField.x + x;
                            int nextFromCurrentValueY = currentField.y + y;
                            currentField = this.fieldsArr[nextFromCurrentValueY][nextFromCurrentValueX];
//                            System.out.println(">>>> 3.THIRD FIELD MATCHING " + "X:" + nextFromCurrentValueX + "  Y: " + nextFromCurrentValueY);


                            //if 3rd current field matches
                            if (currentField.getValue().equals(playerCharacter)) {
                                winCounter++;
                                System.out.println("###########>>>" + playerCharacter + "<<<<###########\n" +
                                                            "########### OU WON ###########");
                                break;
                            }
                        }

                    }
                }catch (ArrayIndexOutOfBoundsException err){ }
            }
        }

    }


}
