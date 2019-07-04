import java.util.Scanner;

class UI {

     static int getUserInput(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter position of your character:");

        while(!myObj.hasNextInt()){
            System.out.println("That's not a number!");
            myObj.next();
        }

        return myObj.nextInt();
    }
}
