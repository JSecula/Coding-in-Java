/*********************************************
 * Jason Secula
 * Reynoldo Morillo
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;


public abstract class DrawingPanel extends JPanel implements ActionListener, MouseListener {
	private static final long serialVersionUID = 1L;
	private ArrayList<Shape> _shapes = new ArrayList<Shape>();
	
		public DrawingPanel(){
			this.setBackground(Color.WHITE);
			Timer timer = new Timer(20, this);
			timer.start();
			this.addMouseListener(this);
		}
		
		@Override
		public void actionPerformed(ActionEvent aev){
			this.repaint();
		}

		public void addShape(Shape shape){
			_shapes.add(shape);
		}
		
		@Override
		public void paint(Graphics g){
			super.paint(g);
			for(Shape shape: _shapes)
				shape.paint(g);
		}
		
		@Override
		public void mousePressed(MouseEvent mev){
			Point p = mev.getPoint();
			for(Shape shape: _shapes)
				if(shape.contains(p))
					shape.mousePressed(mev);
		}

		@Override
		public void mouseClicked(MouseEvent arg0){
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0){
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0){
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0){
			// TODO Auto-generated method stub
			
		}
	}