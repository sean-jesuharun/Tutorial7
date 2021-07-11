import java.util.Scanner;
import java.util.ArrayList;

public class PlayerSelection {
    static ArrayList<Player> players = new ArrayList<Player>();
    static ArrayList<Player> batsman = new ArrayList<Player>();
    static ArrayList<Player> bowler = new ArrayList<Player>();

    public static void main(String[] args){

        Player KumarSangakara = new Player("Kumar Sangakara",38,"batsman", new int[]{18, 24, 36, 47, 59, 66, 78, 18, 29, 10, 31, 42, 33, 44, 55});
        players.add(KumarSangakara);

        Player MahelaJeyawardana = new Player("Mahela Jeyawardana",35,"batsman", new int[]{11, 12, 31, 41, 15, 61, 17, 81, 19, 10, 11, 12, 13, 14, 15});
        players.add(MahelaJeyawardana);

        Player DawidMalan = new Player("Dawid Malan",33,"batsman", new int[]{55, 83, 74, 44, 33, 27, 84, 62, 65, 45, 12, 26, 69, 41, 33});
        players.add(DawidMalan);

        Player ViratKohli = new Player("Virat Kholi",32,"batsman", new int[]{53, 53, 74, 44, 33, 27, 74, 52, 65, 45, 12, 21, 59, 31, 23});
        players.add(ViratKohli);

        Player GlennMaxwell = new Player("Glenn Maxwell",32,"batsman", new int[]{23, 43, 44, 44, 23, 77, 84, 12, 65, 45, 14, 26, 49, 81, 24});
        players.add(GlennMaxwell);

        Player RashidKhan = new Player("Rashid Khan",34,"bowler", new int[]{3, 3, 4, 4, 2, 5, 4, 1, 5, 1, 1, 0, 0, 1, 2});
        players.add(RashidKhan);

        Player AshtonAgar = new Player("Ashton Agar",30,"bowler", new int[]{0, 3, 4, 2, 2, 3, 4, 1, 5, 1, 1, 1, 0, 1, 1});
        players.add(AshtonAgar);

        Player TimSouthee = new Player("Tim Southee",33,"bowler", new int[]{1, 0, 0, 2, 2, 3, 4, 1, 5, 1, 2, 0, 0, 2, 2});
        players.add(TimSouthee);

        Player MSDhoni = new Player("MS Dhoni",40,"keeper", new int[]{1, 0, 0, 2, 0, 3, 1, 1, 3, 0, 2, 0, 0, 2, 2});
        players.add(MSDhoni);

        Player QuintondeKock = new Player("Quinton de Kock",32,"keeper", new int[]{0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 1, 0, 0, 1, 2});
        players.add(QuintondeKock);

        boolean flag = true;

        while (true) {

            if (flag == false)
            {
                break;
            }

            System.out.println();
            System.out.println(
                    "Enter A to add a player  \n" +
                    "Enter V to view all players  \n" +
                    "Enter B to Display Two Best Batsman  \n" +
                    "Enter C to Display Two Best Bowlers \n" +
                    "Enter D to Display Best Keeper \n" +
                    "Enter E to Exit The Program.... \n"
            );

            System.out.println();
            Scanner task = new Scanner(System.in);
            System.out.print("Enter a task that you want to perform : ");
            String result = task.nextLine();

            if (result.equals("A")) {
                addPlayer();
            }
            else if (result.equals("V")){
                viewAllPlayers();
            }
            else if (result.equals("B")){
                displayTwoBestBatsman();
            }
            else if (result.equals("C")){
                displayTwoBestBowler();
            }
            else if (result.equals("D")){
                displayBestKeeper();
            }else if (result.equals("E")){
                flag = false;
                System.out.println("System is Exiting...");
            }
        }
    }

    public static void addPlayer(){
        System.out.println();
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter the name of the Player : ");
        String name1 = myObj.next();

        System.out.print("Enter the age of the Player : ");
        int age1 = myObj.nextInt();

        System.out.print("Enter the Type of the Player : ");
        String type1 = myObj.next();

        System.out.println("Enter the Last 15 Matches Statistics[ Scores or No.of.Wickets taken ]  of the Player....");
        int[] values = new int[15];

        for (int i = 0; i < values.length; i++)
        {
            System.out.print("Enter the Score/no.of.wickets for Match " + (i+1) +" : ");
            int score = myObj.nextInt();
            values[i] = score;
        }

        Player playerObject = new Player(name1, age1, type1, values);  //possible because it has difference references..
        players.add(playerObject);

    }

    public static void viewAllPlayers()
    {
        System.out.println();
        for(int i=0; i < players.size(); i++){
            String PlayerName = players.get(i).getName();
            System.out.println("Player Name is : " + PlayerName);
        }

    }

    public static void displayTwoBestBatsman()
    {
        System.out.println();

        for (int i = 0; i < players.size(); i++)
        {
            if(players.get(i).getType().equals("batsman"))
            {
                if (batsman.size() < 1)
                {
                    batsman.add(players.get(i));
                    continue;
                }

                for (int j = 0; j < batsman.size(); j++)
                {
                    if (players.get(i).getAverage() > batsman.get(j).getAverage())
                    {
                        batsman.add(j, players.get(i));
                        break;
                    }
                    else if (j == batsman.size()-1)
                    {
                        batsman.add(players.get(i));
                        break;
                    }
                    else
                    {
                        continue;
                    }
                }

            }
        }

        System.out.println("And the Two Best Batsmans are Follows....");
        System.out.println(batsman.get(0).getName());
        System.out.println(batsman.get(1).getName());
    }

    public static void displayTwoBestBowler()
    {
        System.out.println();

        for (int i = 0; i < players.size(); i++)
        {
            if(players.get(i).getType().equals("bowler"))
            {
                if (bowler.size() < 1)
                {
                    bowler.add(players.get(i));
                    continue;
                }

                for (int j = 0; j < bowler.size(); j++)
                {
                    if (players.get(i).getAverage() > bowler.get(j).getAverage())
                    {
                        bowler.add(j, players.get(i));
                        break;
                    }
                    else if (j == bowler.size()-1)
                    {
                        bowler.add(players.get(i));
                        break;
                    }
                    else
                    {
                        continue;
                    }
                }

            }
        }

        System.out.println("And the Two Best Bowlers are Follows....");
        System.out.println(bowler.get(0).getName());
        System.out.println(bowler.get(1).getName());
    }

    public static void displayBestKeeper(){
        System.out.println();
        double highest = -1;
        String bestKeeper = "";

        for(int i = 0; i < players.size(); i++)
        {
            if (players.get(i).getType().equals("keeper"))
            {
                if (players.get(i).getAverage() > highest)
                {
                    highest = players.get(i).getAverage();
                    bestKeeper = players.get(i).getName();
                }
            }
        }

        System.out.println("And the Best Keeper is : " + bestKeeper);
    }


}
