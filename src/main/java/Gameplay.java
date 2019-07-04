import java.util.Scanner;

class Gameplay {
    public static void main(String[] args) {
        boolean game = true;

        Player player1 = new Player("Daro", "X");
        Player player2 = new Player("OLO", "O");
        Player[] playerArr = {player1, player2};

        Board board = new Board(3, 3);

        board.show();

        while(game){
            for(Player player: playerArr){
                player.turn(board);
                board.show();
            }
        }
    }


}


