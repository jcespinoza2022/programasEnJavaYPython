package eventos;

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

class PanelBotones extends JPanel implements ActionListener{
	
	JButton miBotonAzul = new JButton("Azul");
	
	JButton miBotonAmarillo = new JButton("Amarillo");
	
	JButton miBotonRojo = new JButton("Rojo");
	
	public PanelBotones() {
		
		add(miBotonAzul);
		
		add(miBotonAmarillo);
		
		add(miBotonRojo);
		
		miBotonAzul.addActionListener(this);
		
		miBotonAmarillo.addActionListener(this);
		
		miBotonRojo.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Object botonPulsado = e.getSource();
		
		if(botonPulsado == miBotonAzul) {
			
			setBackground(Color.BLUE);
			
		}else if (botonPulsado == miBotonAmarillo) {
			
			setBackground(Color.YELLOW);
		}
		
		else {
			
			setBackground(Color.RED);
			
		}
		
		
	}
	
}