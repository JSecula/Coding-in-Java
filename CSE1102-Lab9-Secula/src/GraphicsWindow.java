/*********************************************
 * Jason Secula
 * Reynoldo Morillo
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class GraphicsWindow extends JFrame {
	private DrawingPanel _drawingPanel;
	private static final long serialVersionUID = 1L;
	
		public GraphicsWindow(){
			this.setSize(600, 400);
			this.setVisible(true);
		}
		public void addShape(Shape shape){
			_drawingPanel.addShape(shape);	 
		}
}
