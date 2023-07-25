import java.util.Scanner;

/* Este programa Pide dos parametros: pide el monto del capital, pide el plazo en meses a razon de una tasa de interes del 2% mensual con interes compuesto.*/
/*autor: Josue Leiva Mora*/

public class Tarea2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double capital;
		double tasa_mensual = 0.02;
		double cantidadmeses;
		double intereses = 0;
		double montofinal = 0;
		double acumulado2 = 0;
		double acumulado3 = 0;
		double contador = 1;
		System.out.print("Introduzca monto del capital ");
		capital = sc.nextInt();
		System.out.print("Introduzca plazo en meses: ");
		cantidadmeses = sc.nextInt();
		
		if(capital != 0) {
		acumulado2 = (1 + tasa_mensual);
		acumulado3 = Math.pow(acumulado2, cantidadmeses);
		montofinal = capital * acumulado3;
		intereses = montofinal - capital;
		System.out.println("Intereses por mes: ");
		}
		do {
			acumulado2 = (1 + tasa_mensual);
			acumulado3 = Math.pow(acumulado2, contador);
			montofinal = capital * acumulado3;
			intereses = montofinal - capital; 
			System.out.print(intereses);
			System.out.println(" ");
			contador = contador +1;	
			
		} while (contador <= cantidadmeses);
		
		System.out.println("Monto invertido");
		System.out.print(capital);
		System.out.println("");
		System.out.println("Total intereses");
		System.out.print(intereses);
		System.out.println("");
		System.out.println("Total acumulado + intereses: ");
		System.out.print(montofinal);

		
		
	}

}
