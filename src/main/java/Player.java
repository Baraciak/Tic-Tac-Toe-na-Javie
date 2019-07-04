class Player {

    private String playerName;
    private String playerCharacter;

    Player(String name, String character){
        playerName = name;
        playerCharacter = character;
    }


    void turn(Board board){
        System.out.println(playerName + " (" + playerCharacter + ")" +  ", it's your turn!");

        int pos = getPosition(board);

        while(board.setField(pos, playerCharacter)){
            System.out.println("Field is already taken. Watch game board!");
            pos = getPosition(board);
        }
        board.checkWin(pos, playerCharacter);
    }


    private int getPosition(Board board) {
        int boardLength = board.fieldsArr.length;
        int boardInsideArrLength = board.fieldsArr[1].length;

        int position = UI.getUserInput();

        //check if position from user is available
        //if position isn't > 0 OR position is not in the board range
        while ( !(position > 0) || !(position <= (boardLength * boardInsideArrLength)) ){
            System.out.println("Selected field doesn't exist :( Please try again.");
            position = getPosition(board);
        }
        return position;
    }

}
