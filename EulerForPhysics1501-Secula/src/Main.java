/**********************
 * @author jasonsecula
 * Proff. Bezrukov 
 * Physics 1501
 * 11/18/2015
 * Extra Credit. 
 * 
 * Task:
 * Create a Program that uses Euler's method, from the end of lecture 25.
 * find the period of oscillations, T/ω
 * oscillation amplitude A=0.1 and A=1.5
 * 
 * Take user input by using a scanner, then input Scanner Data into Equation Class
 * Equation Class will be inputted into the grapher
 * Scanner(Main)>>Euler, Spring, Simple Oscillation (Equation) >> Graph
 */
import java.util.Scanner;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let's solve Euler's Equation where ((d^2)x)/(dt^2)");
		
		System.out.println("Please enter a value for x in its first position:");
			Scanner scan = new Scanner(System.in);
				int num1 = scan.nextInt();
		System.out.println("Please enter a value for the initall Velocity of the system:");
			Scanner scn = new Scanner(System.in);
				int num2 = scn.nextInt();
		System.out.println("Please enter a value for delta t, the change in time.");
			Scanner san = new Scanner(System.in);
			int num3 = san.nextInt();
		System.out.println("You entered"+num1+" for the inital position\nYou entered"+num2+" for the inital velocity");
		System.out.println("You entered"+num3+"for the Change in Time");
		System.out.println("");
	}
}
