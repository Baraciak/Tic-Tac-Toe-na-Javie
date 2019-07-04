import java.util.Scanner;

class Player {

    private String playerName;
    private String playerCharacter;

    Player(String name, String character){
        playerName = name;
        playerCharacter = character;
    }


    private int getPosition(Board board) {
        int boardLength = board.fieldsArr.length;
        int boardInsideArrLength = board.fieldsArr[1].length;


        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter position of your character:");
        int position = myObj.nextInt();

        //check if position from user is available
        while (!(position <= (boardLength * boardInsideArrLength))){
            System.out.println("Selected field doesn't exist :( Please try again.");
            position = getPosition(board);
        }
        return position;
    }

    void turn(Board board){
        System.out.println(playerName + " (" + playerCharacter + ")" +  ", it's your turn!");

        int pos = getPosition(board);

        while(board.setField(pos, playerCharacter)){
            System.out.println("Field is already taken. Watch game board!");
            pos = getPosition(board);
        }
    }

}
