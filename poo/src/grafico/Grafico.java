package grafico;

import java.awt.Frame;

import javax.swing.*;

public class Grafico {

	public static void main(String[] args) {
		
		miMarco marco = new miMarco();
		
		marco.setVisible(true);
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class miMarco extends JFrame{
	
	public miMarco() {
		
		//setSize(500,300);
		
		//setLocation(500,300);
		
		
		setBounds(500,300,550,250);
		
		
		//setResizable(false);
		
		
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
		setTitle("Mi Ventana");
	}
}
