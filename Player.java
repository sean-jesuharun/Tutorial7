public class Player{

	String Name;
	int Age;
	String Type;
	int[] Statistics=new int[15];

	public Player(String N, int A, String T, int[]Stat){
 
		Name = N;
		Age = A;
		Type = T;
		Statistics = Stat;
	}

	public void getAverage(){
		double total = 0;
		for(int i=0;i<15;i++)
		{
			total = total+Statistics[i];
		}
	System.out.println(total/15);

	}

	public void getPlayerDetails(){
		System.out.println("Player name : "+Name);
		System.out.println("Player age : "+Age);
		System.out.println("Player type : "+Type);
	}

	public void getBestPerformance(){
		int highest = 0;
		for(int i = 0;i<15;i++){
			if(Statistics[i] > highest){
				highest = Statistics[i];
			}
		}
	System.out.println("Highest " +highest);

	}
}