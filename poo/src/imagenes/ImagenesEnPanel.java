package imagenes;

import javax.imageio.*;

import javax.swing.*;

import java.awt.*;

import java.io.*;

public class ImagenesEnPanel {

	public static void main(String[] args) {
		
		MarcoImagen miMarco = new MarcoImagen();
		
		miMarco.setVisible(true);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		
		super("Marco Con Imagen");
		
		//setTitle("Marco Con Imagen");
		
		setBounds(750, 300, 300, 200);
		
		PanelConImagen miPanel = new PanelConImagen();
		
		add(miPanel);
	}
	
} 
 
class PanelConImagen extends JPanel{
	
	private Image imagen;
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//File miimagen = new File("src/grafico/icono.jpg"); //con File que solicita 
		
		try {
		imagen = ImageIO.read(new File("src/grafico/icono2.gif"));// otra opcion instanciando directaamente 
		}
		catch(IOException e) {
			
			System.out.println("La imagen no se encuentra");
		}
		
		int anchuraImagen = imagen.getWidth(this);
		
		int alturaImagen = imagen.getHeight(this);
		
		g.drawImage(imagen, 0, 0, null);
		
		for(int i=0; i < 300; i++) {
			
			for(int j=0; j < 200; j++) {
				
				if(i+j > 0) { // Para no montar la primera imagen
				
				g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*j);
				
				}
				
			}
		}
		
		
	}
	
	
}
