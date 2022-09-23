package ShowColor;

import java.awt.*;

import javax.swing.*;

public class ShowColors {
     
	public static void main(String[] args) {
		
		Colores aplicaciones = new Colores();
		aplicaciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

class Colores extends JFrame{
	
	public Colores() {
		
		super(" Usando Colores ");
		
		setSize( 400, 230);
		
		setVisible(true);
		 
		setLocation(400, 200);
		
		//setTitle("los colores");
		
	   MiPanel panel = new MiPanel();
		
		add(panel);
		
	}
	
}


class MiPanel extends JPanel{
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(new Color(255, 0, 0));
		
		g.fillRect(25, 25, 100, 20);
		
		g.drawString("Color Actual:" + g.getColor(), 130, 40);
		
		
		g.setColor(new Color(0.0f, 1.0f, 0.0f));
		
		g.fillRect(25, 50, 100, 20);
		
		g.drawString("Color Actual " + g.getColor(), 130, 65);
		
		
		g.setColor(Color.BLUE);
		
		g.fillRect(25, 75, 100, 20);
		
		g.drawString("Color Actual" + g.getColor(), 130, 90);
		
		
		Color color = Color.MAGENTA;
		
		g.setColor(color);
		
		g.fillRect(25, 75, 100, 20);
	}
	
}
	
	

