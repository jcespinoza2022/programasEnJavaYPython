package eventos;

import javax.swing.*;

import java.awt.event.*;

public class EventosVentana {

	public static void main(String[] args) {
		
		
		MarcoVentana miMarco = new MarcoVentana();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoVentana miMarco2 = new MarcoVentana();
		
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	  miMarco.setTitle("Ventana 1");
	  
	  miMarco2.setTitle("Ventana 2");
	  
	  miMarco.setBounds(300, 300, 500, 350);
	  
	  miMarco2.setBounds(900, 300, 500, 350);

	}

}

class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		
		//super("Respondiendo");
		
		//setBounds(300, 300, 500, 350);
		
		setVisible(true);
		
		MiVentana oyenteVentana = new MiVentana();
		
		addWindowListener(oyenteVentana);
		
	}
	
}

class MiVentana implements WindowListener{
	
	public void windowActivated(WindowEvent e) {
		
		System.out.println("Ventana Activa ");
		
	}
	
	public void windowClosed(WindowEvent e) {
		
		System.out.println("La Ventana se cerro ");

	}
	
	public void windowClosing(WindowEvent e) {
		
		System.out.println("Cerrando ventana ");
	}
	
	public void windowDeactivated(WindowEvent e) {
		
		System.out.println("Ventana desactivada ");
		
	}
	
	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("Ventana restaurada ");
	}
	
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana minimizada");
	}
	
	public void windowOpened(WindowEvent e) {
		
		System.out.println("Ventana abierta ");
	}
	
	
	
}
