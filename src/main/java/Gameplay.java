import java.util.Scanner;

class Gameplay {
    public static void main(String[] args) {

        Player player1 = new Player("Daro", "X");
        Player player2 = new Player("OLO", "O");

        Board board = new Board(3, 3);

        board.show();
    }



}


