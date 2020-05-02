package semana4;

import java.util.Scanner;

public class Condicion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sexo;
		int edad;
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese si es un hombre(h) o mujer(m)");
		 sexo=scan.next();
		 if (sexo.equals("h"))
			 System.out.println("Bienvenido hombre");
		 else
			 System.out.println("Bienvenido mujer");
	
		System.out.println("Ingrese su edad");
	     edad=scan.nextInt();
	    
		if(edad<6 & edad <=12) {
			System.out.println("10");;
		}else {
			if(edad>12 & edad <=60) {
			  System.out.println("20");
			}
			else {
				if (edad>60) {
					System.out.println("15");;
				}
				
			}
				
			
		}

	}

}
