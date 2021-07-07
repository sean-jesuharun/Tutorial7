public class Player {
    String Name;
    int Age;
    String Type;
    double[] Statistics=new double[15];

    public Player(String N , int A , String T , double[] Stat){
        Name=N;
        Age=A;
        Type=T;
        Statistics=Stat;
    }
    double getAverage(){
        double total=0;
        for(int i=0;i<15;i++){
            total=total+Statistics[i];

        }
        return(total/15);
    }
    void getPlayerDetails(){
        System.out.println("Player name : " +Name);
        System.out.println("Player age : " +Age);
        System.out.println("Player type : " +Type);
    }
    int getBestPerformance(){
        int highest=0;
        for(int i = 0;i<15;i++){
            if (Statistics[i]>Statistics[highest]){
                highest=i;
            }
        }
        return highest;
    }
    String getType(){
        return Type;
    }

}
