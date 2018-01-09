/*jason secula
*new code
*creations
*MrRosco
*/
import java.util.Scanner;
public class battleroyal{

	public static void main(String args[]){
		Scanner input = new Scanner( System.in );

		String heroName;
		battlerbasic mybattle = new battlerbasic();

		System.out.println("enter your hero's name:");
		heroName=input.nextLine();

	
	
	mybattle.setName(heroName);

	mybattle.firstBattle();
	


	}
}
