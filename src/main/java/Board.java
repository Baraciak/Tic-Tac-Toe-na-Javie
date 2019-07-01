import java.util.Scanner;

class Board {
    private Field[][] fieldsArr;


    Board(int xSize, int ySize){
        String EMPTY_FIELD = " ";
        fieldsArr = new Field[ySize][xSize];


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
        for (Field[] i: fieldsArr) {
            StringBuilder sb = new StringBuilder("  |  ");

            for (Field j: i) {
                sb.append(j.value).append("  |  ");
            }

            System.out.println(sb.toString());
            System.out.println("  -------------------  ");
        }

    }


}
