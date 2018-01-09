//Jason Secula
//Cse 1102-Section1
//Lab 2
//TA: Reynoldo Morillo
import java.util.Scanner;
public class Balloon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner keys = new Scanner(System.in);
		 	//^Scanner allows for user input.
		 	System.out.println("Please enter a starting time");
		 		Double startT = keys.nextDouble();
		 	System.out.println("Please enter a ending time");
		 		Double endT = keys.nextDouble();
		 	System.out.println("Please enter a value");
		 		Double sampleInterval = keys.nextDouble(); 
		 while(startT <= endT){
			 	double alt = Balloon.altitude(startT);
			 	double vel = Balloon.velocity(startT)/3600;
			 	System.out.println(startT + "\t" + alt + "\t" + vel);
			 		startT+=sampleInterval;
		 }
	}
		 public static double altitude(double t){
			 double alt = -0.12*(t*t*t*t) + 12*(t*t*t) - 380*(t*t) + 4100*t + 220;
			 	return alt; 
		 }
		 public static double velocity(double t){
			 double vel = -0.48*(t*t*t) + 36*(t*t) - 760*t + 4100;
			 	return vel;
		 }
}
