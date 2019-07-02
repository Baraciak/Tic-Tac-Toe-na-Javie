import java.util.Scanner;

class Player {

    private String playerName;
    private String playerCharacter;

    Player(String name, String character){
        playerName = name;
        playerCharacter = character;
    }


    private int getPosition() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter position of your character:");
        return myObj.nextInt();
    }

    void turn(Board board){
        int boardLength = board.fieldsArr.length;
        int boardInsideArrLength = board.fieldsArr[1].length;

        System.out.println(playerName + " (" + playerCharacter + ")" +  ", it's your turn!");
        int pos = getPosition();

        while (!(pos < (boardLength * boardInsideArrLength))){
            System.out.println("Selected field doesn't exist :( Please try again.");
            pos = getPosition();
        }
        board.setField(pos, playerCharacter);
    }
}
