/* Jason Secula
*CSE1102
*LabFour
*Reynoldo 
* Part6. Create Robot constructor
* Add another constructor to the Robot class that has three parameters:
* 1. name
* 2. serial name
* 3. battery minutes
*/
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot r1 = new Robot();
		Robot r2 = new Robot("JamesIsaacNewtron", 777, 90);
		System.out.println(r1.getMinutes());
		System.out.println(r2.getMinutes());
	}

}
