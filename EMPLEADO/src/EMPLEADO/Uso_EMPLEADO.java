package EMPLEADO;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_EMPLEADO {

	public static void main(String[] args) {
		
		
		
		
		Empleado[] misEmpleados = new Empleado[6];
		
		misEmpleados[0] = new Empleado("Jaime Espinoza ", 15000.0, 2010, 5 , 25);
		
		misEmpleados[1] = new Empleado("Andres Espinoza ", 25000.0, 2009, 7 , 2);
		
		misEmpleados[2] = new Empleado("Dalia Espinoza ", 35000.0, 2008, 12 , 9);
		
		misEmpleados[3] = new Empleado("Lourdes Espinoza", 33000.0, 2012, 1, 23);
		
		Jefatura jefe_RRHH = new Jefatura("Jaqueline Espinoza ", 55000, 1999, 3, 18);
		
		jefe_RRHH.estableceIntencivo(2570);
		
		misEmpleados[4] = jefe_RRHH;
		
		misEmpleados[5] = new Jefatura("Diana Espinoza", 45000, 2000, 7, 30);
		
		Jefatura jefe_Finanzas = (Jefatura) misEmpleados[5];
		
		jefe_Finanzas.estableceIntencivo(2750);
		
		
		Arrays.sort(misEmpleados);
		
		
		
		
		for(Empleado h: misEmpleados) {
			
			h.aumentaSueldo(5);
		
		System.out.println("Nombre : " + h.dameNombre() + " Sueldo :" + h.dameSueldo()
				+ " Fecha de Contrato : " + h.dameFecha() );
		}
		
		
	}

}


	class Empleado implements Comparable {
		
		private String nombre;
		
		private double sueldo;
		
		private Date altaContrato;
		
		private static int IdSiguiente;
		
		private int Id;
		
		
		public Empleado(String nom, double sue, int agno, int mes, int dia) {
			
			nombre = nom;
			
			sueldo = sue;
			 
			++IdSiguiente;
			
			Id = IdSiguiente;
			
			GregorianCalendar calendario = new GregorianCalendar(agno , mes-1, dia);
			
			altaContrato = calendario.getTime();
		}
		
		public Empleado(String nom) {
			
			this(nom, 30000, 1 , 1, 2000);
		}
		
		public String dameNombre() {
			
			return nombre + " Id:"+ Id;
			
		}
		
		public double dameSueldo() {
			
			return sueldo;
			
		}
		
		public Date dameFecha() {
			
			return altaContrato;
		}
		public void aumentaSueldo(double porcentaje) {
			
			double aumento = sueldo*porcentaje/100;
			
			sueldo += aumento;
		}
		
		public int compareTo(Object miObjeto) {
			
			Empleado otroEmpleado = (Empleado) miObjeto;
			
			if(this.sueldo < otroEmpleado.sueldo) {
			
				return -1;
				
			}
			
			if (this.sueldo > otroEmpleado.sueldo) {
				
				return 1;
				
			}			
					
				return 0; 
			
		}
		
		
	}
	
	class Jefatura extends Empleado{
		
		private double incentivo = 0.0;
		
		public Jefatura(String nom, double sue, int agno, int mes, int dia) {
			
			super(nom, sue, agno, mes, dia);
			
		}
				
		public void estableceIntencivo(double d) {
			
			incentivo = d;
		}
		public double dameSueldo() {
			
			double sueldoJefe = super.dameSueldo();
			
			return sueldoJefe + incentivo;
		}
	}
	
	
	