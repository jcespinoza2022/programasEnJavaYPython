package eventos;

import javax.swing.*;

import java.awt.event.*;

public class EventosDeVentana {

	public static void main(String[] args) {
		
		MarcoDeVentana miMarco = new MarcoDeVentana();
		
		miMarco.setBounds(300, 300, 500, 300);
		
		miMarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		miMarco.setTitle("Ventana 1" );
		
		MarcoDeVentana miMarco1 = new MarcoDeVentana();
		
		miMarco1.setBounds(900, 300, 500, 300);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setTitle("Ventana 2");
		

	}

}

class MarcoDeVentana extends JFrame{
	
	public MarcoDeVentana() {
		
		setVisible(true);
		
		Mi_Ventana oyenteVentana = new Mi_Ventana();
		
		addWindowListener(oyenteVentana);
		
		
		
	}
	
}

class Mi_Ventana extends WindowAdapter{
	
	
public void windowClosing(WindowEvent e) {
		
		System.out.println("Cerrando ventana ");
	}

public void windowDeactivated(WindowEvent e) {
	
	System.out.println("Ventana desactivada ");
	
}
	
}
