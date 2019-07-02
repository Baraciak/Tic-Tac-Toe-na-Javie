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
        int position = myObj.nextInt();
        System.out.println(position);
        myObj.close();
        return position;
    }

    void turn(Board board){
        System.out.println(playerName +  ", it's your turn!");
        int pos = getPosition();
        board.setField(pos, playerCharacter);
    }

}
