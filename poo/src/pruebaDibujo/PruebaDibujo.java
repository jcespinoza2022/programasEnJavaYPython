package pruebaDibujo;

import javax.swing.*;

import java.awt.*;
import java.awt.geom.*;

public class PruebaDibujo {
     public static void main(String[] args) {
    	 
    	 MarcoConDibujo miDibujo = new MarcoConDibujo();
    	 
    	 miDibujo.setVisible(true);
    	 
    	 miDibujo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 
    	 
    	 
     }
}

class MarcoConDibujo extends JFrame{
	
	public MarcoConDibujo() {
		
		setTitle("Dibujo en marcos");
		
		setSize(400,400);
		
		
		PanelConFiguras miPanel = new PanelConFiguras();
		
		add(miPanel);
		
	}
	
	
	
}


class PanelConFiguras extends JPanel{
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		
		g2.draw(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(100, 100, 300, 250));
				
				
				
		
		//g.drawRect(100, 100, 200, 200);
		
		//g.drawLine(100, 100, 300, 200);
		
		//g.drawOval(100, 50, 100, 100);
		
		//g.drawArc(50, 100, 100, 200, 120, 150);
		
	}
}