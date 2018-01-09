//Jason Secula
//CSE 1102-Lab3
//TA: Morillo
//09/23/2015
import java.util.Scanner;

public class BankAccount {
	private int balance = 0;
	private String Password = "jables";
	public void showBalance(){
		System.out.println("The Balance is "+ getBalance());
	}
	public boolean checkPassword(){
		Scanner kbd = new Scanner(System.in);
				System.out.print("Hey!\nHey You!\nCustomer!\nEnter password:\n");
				String guess = kbd.nextLine();
			if(guess.equals(Password)){
				System.out.print("yo you got it right\n");
					return true;
			}
			else{
				System.out.print("NOPE!\nThats the wrong Password!\nJust do it!\nMake Your dreams come true!\nEnter the right password!\nDOOOOO it!\n");
					return false; 
			}

		}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int bal) {
		if (this.checkPassword()){
			this.balance = bal;
		}
	}
	
	public void changePassword(){
		if (checkPassword()){
			Scanner pass = new Scanner(System.in);
				System.out.print("brah, change your password\n");
				Password = pass.next();
				System.out.println("New Password is " + Password );
					}
				}

}
