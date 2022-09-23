package PruebaEventos;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class PruebaEventos {

	public static void main(String[] args) {
		
		MarcoBotones miMarco = new MarcoBotones();
		
		miMarco.setVisible(true);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotones extends JFrame{
	
	public MarcoBotones () {
		
		setTitle("Botones y Eventos ");
		
		setBounds(700, 300, 500, 300);
		
		PanelBotones miPanel = new PanelBotones();
		
		add(miPanel);
		
	}
	
		
}

class PanelBotones extends JPanel {
	
	JButton miBotonAzul = new JButton("Azul");
	
	JButton miBotonAmarillo = new JButton("Amarillo");
	
	JButton miBotonRojo = new JButton("Rojo");
	
	public PanelBotones() {
		
		add(miBotonAzul);
		
		add(miBotonAmarillo);
		
		add(miBotonRojo);
		
		ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
		
		ColorFondo Azul = new ColorFondo(Color.BLUE);
		
		ColorFondo Rojo = new ColorFondo(Color.RED);
		
		miBotonAzul.addActionListener(Azul);
		
		miBotonAmarillo.addActionListener(Amarillo);
		
		miBotonRojo.addActionListener(Rojo);
		
	}
	
	private class ColorFondo implements ActionListener{
		
		private Color colorFondo;
		
		public ColorFondo(Color c) {
			
			colorFondo = c;
		
		}
		
		public void actionPerformed(ActionEvent e) {
			
			setBackground(colorFondo);
		}
		
		
	}

	
}



