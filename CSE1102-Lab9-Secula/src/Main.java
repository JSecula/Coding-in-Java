/*********************************************
 * Jason Secula
 * Reynoldo Morillo
 * Lab9
 * 11/18/2015
 * I'm sorry!!!! I slept through lab.
 * 
 * 
 * The Majority of this code was copied from Jeff's lab manuel.
 */
import javax.swing.SwingUtilities;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Swing graphics should be done in a concurrently-running
		  // thread. This creates just such a thread.
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
				public void run() {
					// The new thread starts running in this method.
					// All this method does is call the _setup method.
					_setup();
				} 
		});	//What??? a semi colon? after a close paren and curly bracket???	  
	}
	private static void _setup() {
	GraphicsWindow thing = new GraphicsWindow();
	Square sq = new Square(20, 20, 100);
	thing.addShape(sq);
	Square m = new Square(30, 30, 200);
	thing.addShape(m);
	Square d = new Square(40, 40, 300);
	thing.addShape(d);
}
}