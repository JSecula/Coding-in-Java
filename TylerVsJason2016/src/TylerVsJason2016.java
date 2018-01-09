import java.util.Random;

//Tyler vs. Jason 

public class TylerVsJason2016 {

	public static void main(String[] args) {
										// TODO Auto-generated method stub
		int tyler = 0;					//starting value 
		int jason = 0;					//starting value
		Random randomGenerator = new Random();		//random number generator.
		for(int i=0; i<=100; i++){
		      int random = randomGenerator.nextInt(100);
	if(random < 49){
			System.out.println("The Random number was "+ random +" Tyler Won!!");
			tyler++;								//test value of tyler
	}
	else if(random > 50){ 
		System.out.println("The Random number was "+ random +" Jason Won!!"); 
		jason++;									//test value
	}}
	System.out.println("Tyler had: " + tyler + "points");
	System.out.println("Jason had: " + jason + "points.");
	if (tyler > jason){
		System.out.println("Tyler gets the bigger room");
	}
	else if(jason > tyler){
		System.out.println("Jason gets the bigger room.");
	}
}
}