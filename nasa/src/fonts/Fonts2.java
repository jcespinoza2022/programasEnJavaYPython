package fonts;

import java.awt.*;

import javax.swing.*;

public class Fonts2  {

	public static void main(String[] args) {
		
		EstiloFonts miEstiloF = new EstiloFonts();
		
		miEstiloF.setVisible(true);
		
		miEstiloF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class EstiloFonts extends JFrame{
	
	public EstiloFonts() {
		
		super("Usando Fonts");
		
		setBounds(750, 300, 300, 200 );
		
		PanelConFonts miPanel = new PanelConFonts();
		
		add(miPanel);
		
		
	}
	
	public class PanelConFonts extends JPanel{
		
		public void paint(Graphics g) {
			
			super.paint(g);
			
			//Establecer el tipo de letra Serif(Times), negrita,  12 pt y dibujar uan cadena
			
			g.setColor(Color.GREEN);
			
			g.setFont(new Font("Serif", Font.BOLD, 12));
			
			g.drawString("Serif 12 point bold", 20, 50);
			
		}
		
		
	}
}

