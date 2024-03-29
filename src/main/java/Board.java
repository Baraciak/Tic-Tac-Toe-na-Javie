import java.util.Scanner;

class Board {
    private Field[][] fieldsArr;


    Board(int xSize, int ySize){
        fieldsArr = new Field[ySize][xSize];
        fillBoardArr(xSize, ySize);
    }

    private void fillBoardArr(int xSize, int ySize){
        final String EMPTY_FIELD = " ";

        for(int j = 0; j < ySize; j++){
            Field[] tempArr = new Field[xSize];
            for(int i = 0; i < xSize; i++){
                Field field = new Field(EMPTY_FIELD);
                tempArr[i] = field;
            }
            fieldsArr[j] = tempArr;
        }
    }

    void show(){

        System.out.println("  -------------------  ");
        for (Field[] fieldArr: fieldsArr) {
            StringBuilder sb = new StringBuilder("  |  ");

            for (Field field: fieldArr) {
                sb.append(field.value).append("  |  ");
            }

            System.out.println(sb.toString());
            System.out.println("  -------------------  ");
        }

    }

    void setField(int pos, String playerCharacter){

    }


}
