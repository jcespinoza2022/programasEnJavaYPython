
// Usando Letras.

package fonts;

import java.awt.*;

import javax.swing.*;

public class Fonts extends JFrame{
	
	public static void main(String[] args) {
		
		Fonts letras = new Fonts();
		
		letras.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
	public Fonts() {
		
		super ("Usando Fonts");
		
		setSize(420,125);
		
		setVisible(true);
		
	}
		
		// mostrar las cadenas en diferentes fuentes y colores

		public void paint(Graphics g) {
			
			super.paint(g);
			
			//establecer el tipo de letra Serif (Times), negrita, 12pt y dibujar una cadena
			
			g.setColor(Color.GREEN);
			
			g.setFont(new Font("Serif", Font.BOLD,12));
			
			g.drawString("Serif 12 point bold", 20, 50);
			
			// establecer la fuente en Monospaced (Courier), cursiva, 24pt y dibujar una 
			// cadena
			
			g.setColor(Color.GRAY);
			
			g.setFont(new Font("Monospaced", Font.ITALIC, 24));
			
			g.drawString("Monospaced 24 point italic", 20, 70);
			
			//establecer el tipo de letra a SansSerif (Helvetica), liso, 14pt y dibujar una 
			//cadena
			
			g.setColor(Color.MAGENTA);
			
			g.setFont(new Font("SansSerif", Font.PLAIN,14));
			
			g.drawString("SansSerif 14 point plain", 20, 90);
			
			//establecer el tipo de letra a Serif (Times), negrita/cursiva, 18pt y dibujar una 
			//cadena
			
			g.setColor(Color.RED);
			
			g.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 13));
			
			g.drawString(g.getFont().getName() + " " + g.getFont().getSize() + "point bold italic", 20, 110);
			

	}
	
	
}
	

