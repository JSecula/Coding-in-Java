//Jason Secula
//CSE 1102-Lab3
//TA: Morillo
//09/23/2015
//Main class, main method.
//keeping it real with no sleep like whattup.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		BankAccount ba = new BankAccount();
		ba.changePassword();
		ba.showBalance();
		ba.setBalance(ba.getBalance() + 100);
		ba.showBalance();

	}

}
