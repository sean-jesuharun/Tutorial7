import java.util.Scanner;
import java.util.ArrayList;

public class PlayerSelection {
    static ArrayList<String> players = new ArrayList<String>();

    public static void main(String[] args){
        while (true) {
            System.out.println(
                    "Enter A to add a player : \n" +
                            "Enter V to view all players : \n"
            );

            Scanner myObj1 = new Scanner(System.in);
            System.out.print("Enter a task that you want to perform : ");
            String result = myObj1.nextLine();

            if (result.equals("A")) {
                addPlayer();
            }
            if (result.equals("V")){
                viewAllPlayers();
            }
        }
    }

    public static void addPlayer(){
        Scanner myObj2 = new Scanner(System.in);
        System.out.print("Enter the player name : ");
        String name = myObj2.nextLine();

        players.add(name);
    }

    public static void viewAllPlayers(){
        System.out.println(players);
    }
}
