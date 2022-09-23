package escribiendoEnMarcos;

import javax.swing.*;

import java.awt.*;

public class EscribiendoEnMarcos {

	public static void main(String[] args) {
		
		MarcoConTexto mimarco = new MarcoConTexto();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
				

	}

}

class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {
		
		setVisible(true);
		
		setSize(400,500);
		
		setLocation(400,200);
		
		setTitle("Primer Titulo");
		
		
		MiPanel miPanel = new MiPanel();
		
		add(miPanel);
	}
}

class MiPanel extends JPanel{

	
	public void paintComponent(Graphics g) {
		
		super.paintComponents(g);
		
		
		g.drawString("Estamos aprendiendo Swing", 100, 100);
	}
	
}
