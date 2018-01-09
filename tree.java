/*jason sexy secula
*roscoswagity
*december 2012
*/
import java.awt.*;
import javax.swing.JPanel;

public class tree extends JPanel{
	public void paintComponent( Graphics g ){

super .paintComponent( g );
setBackground( Color.BLACK);
	int width = getWidth();
	int height = getHeight();
int h=height/15;
int w=width/15;

g.setColor(Color.GREEN);
//triangle top
g.drawLine(130,250,530,250 );
g.drawLine(530,250,250,50 );
g.drawLine(250, 50, 130, 250 );
//triangle middle
g.drawLine(280,200,130,500 );
g.drawLine(130,500,530,500 );
g.drawLine(530, 500, 280, 200 );
//triangle bottom
g.drawLine(280,370,130,1000 );
g.drawLine(130,1000,530,1000 );
g.drawLine(530, 1000, 280, 370 );
g.drawString("this is a tree made of lines yo", 50,50);
	}}
