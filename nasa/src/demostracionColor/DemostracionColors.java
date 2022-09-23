package demostracionColor;

import java.awt.*;

import javax.swing.*;

//Demostracion de Colores

public class DemostracionColors extends JFrame{

	public static void main(String[] args) {
		
			DemostracionColors aplicacion = new DemostracionColors();
			
			aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// constructor para las ventanas, titulo, y dimenciones
	
	public DemostracionColors() {
		
		super("Usando colores");
		
		setSize(400,130);
		
		setVisible(true);
	}
	
	//dibujamos el rectangulo y String en diferentes colores
	
	public void paint(Graphics g) {
		
		//Llama a la super calse del metodo paint
		
		super.paint(g);
		
		//Establece el nuevo color de dibujo usando enteros 
		
		g.setColor(new Color(255, 0, 0));
		
		g.fillRect(25, 25, 100, 20);
		
		g.drawString("actual RGB" + g.getColor(), 130, 40);
		
		
		//Establece el nuevo color de dibujo usando decimales 
		
		g.setColor(new Color(0.0f, 1.0f, 0.0f));
		
		g.fillRect(25, 50, 100, 20);
		
		g.drawString("actual RGB" + g.getColor(), 130, 65);
		
		//Establecer el nuevo color Usando objetos Colores estaticos
		
		g.setColor(Color.BLUE);
		
		g.fillRect(25, 75, 100, 20);
		
		g.drawString("Actual RGB " + g.getColor(), 130, 90);
		
		//Muestra los valores individuales RGB
		
		Color color = Color.MAGENTA;
		
		g.setColor(color);
		
		g.fillRect(25, 100, 100, 20);
		
		g.drawString("RGB valores: " + color.getRed() + " , " +
		     color.getGreen() + " , " + color.getBlue(), 130, 115);
		
		
		
	}// fin del metodo paint
	
	
}// fin de la clase Demostracion Colores 
