import java.util.Scanner;

class Player {

    private String playerName;
    private String playerCharacter;

    Player(String name, String character){
        playerName = name;
        playerCharacter = character;
    }
    int getPosition() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter position of your character:");
        int position = myObj.nextInt();
        System.out.println(position);
        myObj.close();
        return position;


    }

}
