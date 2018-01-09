/**
 * @author jasonsecula
 *CSE 1101
 *Reynaldo Morillo
 *Reynaldo Morillo
 */
//^did that by addicent. 


import java.util.Scanner;
public class CalculatorHW {
	
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		Boolean contin = true;
			double accumulator = 0.0;
			double input;
			
	   while(contin){
	    	int choice;
	    	
	    	System.out.println("Accumulator = " + accumulator);
	    	System.out.println("Yo! whatcha wanna math??: ");
	    	System.out.println("would you like to add? hit 1");
	    	System.out.println("if you want to subract, press 2");
	    	System.out.println("multiply your numbas' press the 3 button");
	    	System.out.println("divide press the 4!! ");
	    	System.out.println("Square root to square press the five key");
	    	System.out.println("to clear everything just press 6");
	    	System.out.println("set me equal to zero if you'd like to quit my app, its cool.");
	    	System.out.println("so what do you wanna do next dawg? ");
	    	choice = kbd.nextInt();
	    	
	    	if(choice == 0){
	    		contin = false;
	    	}
	    	else if(choice == 1){					//the addition loop
	    		System.out.print("Put a number or feel my wrath: ");
	    		input = kbd.nextDouble();
	    		accumulator = accumulator + input;
	    	}
	    	else if(choice == 2){					//subtraction loop 
	    		System.out.print("Enter a number please homie: ");
	    		input = kbd.nextDouble();
	    		accumulator = accumulator - input;
	    	}
	    	else if(choice == 3){					//multiplication loop
	    		System.out.print("Yo please just put a number in here: ");
	    		input = kbd.nextDouble();
	    		accumulator = accumulator * input;
	    	}
	    	else if(choice == 4){					//divide loop
	    		System.out.print("Just pop a number in here bruh: ");
	    		input = kbd.nextDouble();
	    		accumulator = accumulator/input;
	    	}
	    	else if(choice == 5){					//squared a loop
	    		if (accumulator >= 0){
	    			accumulator = Math.sqrt(accumulator);
	    				}
	    		}
	    	else if(choice == 6){		
	    		accumulator = 0.0;
	    	}
	    	else{
	    		System.out.print("This is not permitted: " + choice);
	    	}
	    }
	    
	}

}
