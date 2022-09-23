package eventos;

import java.awt.*;
import java.awt.event.WindowEvent;

import java.awt.event.WindowStateListener;

import javax.swing.*;

public class EventosEstados {

	public static void main(String[] args) {
		
		MarcoEstado  miEstado = new MarcoEstado();
		
		miEstado.setVisible(true);
		
		miEstado.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

}

class MarcoEstado extends JFrame{
	
	public MarcoEstado() {
		
		setTitle("Ventana de Estado");
		
		setBounds(400,200, 500,350);
		
		NuevoEstado estado = new NuevoEstado();
		 
		addWindowStateListener(estado);
		 
	}
}

class NuevoEstado implements WindowStateListener{
	
	@Override
	public void windowStateChanged(WindowEvent e) {
		
		System.out.println("La ventana a cambiado de estado");
		
	}
}


