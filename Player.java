public class Player {
    private String Name;
    private int Age;
    private String Type;
    private int[] Statistics=new int[15];

    public Player(String N , int A , String T , int[] Stat){
        Name=N;
        Age=A;
        Type=T;
        Statistics=Stat;
    }

    public double getAverage(){
        double total=0;
        for(int i=0;i<15;i++){           //Batting Average for last 15 matches....gives a single match batting Average
            total=total+Statistics[i];  //Bowling Average for last 15 matches.... gives a single match wicket taking Average.             //Wicket Keeping stemping Average for last 15 matches...
        }
        return(total/15);
    }

    public void getPlayerDetails(){
        System.out.println("Player name : " +Name);
        System.out.println("Player age : " +Age);
        System.out.println("Player type : " +Type);

    }

    public int getBestPerformance(){
        int highest=0;                       
        for(int i = 0;i<15;i++){
            if (Statistics[i]>highest){
                highest=Statistics[i];
            }
        }
        return highest;
    }

    public String getType(){
        return Type;
    }

    public String getName(){
        return Name;
    }

}
