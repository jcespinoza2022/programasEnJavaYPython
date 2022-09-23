package nasa;
// Prueba de continue 
public class PruebaContinue {

	
	public static void main(String[] args) {
		
		
		for(int cuenta = 1; cuenta <= 10; cuenta++ ) {
			
			if(cuenta == 5) {
				
				continue;// salta el valor de 5 
				
							
			}
			
			System.out.printf("%d ", cuenta);
		}
		
		System.out.println("\nSe uso Continue para omitir imprimir 5\n");
	}
}
