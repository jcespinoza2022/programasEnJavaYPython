package colorear;
// Elegir colores con JColorChooser
import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class ShowColors2 {

	public static void main(String[] args) {
		

	}

}

class Colorear extends JFrame {
	
	private JButton changeColorButton;
	
	private Color color = Color.LIGHT_GRAY;
	
	private Container container;
	
	
	public Colorear() {
		
		super("Usando Elegir colores ");
		
		container = getContentPane();
		
		container.setLayout(new FlowLayout());
		
		//Configurar changeColorButton y registrar su controlador de eventos
		
		changeColorButton = new JButton("Cambiar Color ");
		
	class CambiaColor implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			color = JColorChooser.showDialog(Colorear.this, "Cambiar Color", color);
			
			
		}
		
	}
	
	changeColorButton.addActionListener(null);
		
			
		
	}

	
}
