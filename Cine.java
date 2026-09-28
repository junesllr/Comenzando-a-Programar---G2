package comenzandoaProgramarG2;

import java.util.Scanner;

public class Cine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int personas,entradasAdult,entradasInfant,entradasTotal,precioAdult=9,precioInfant=6,totalAdultos=0,totalInfantiles=0,masEntradas=0,clienteMasEntradas=0;
		double precioTotal,descuento,dineroTotal=0;
	
		System.out.println("¿Cuántas personas se van a registrar?");
		personas = sc.nextInt();
	
		while (personas<0) {
			System.out.println("Error- Introduzca un número positivo");
			System.out.println("¿Cuántas personas se van a registrar?");
			personas = sc.nextInt();
		}
		
		for (int i = 1; i <= personas; i++) {

			System.out.println("\nCliente " + i);

			System.out.println("¿Cuántas entradas de adultos?");
			entradasAdult = sc.nextInt();
		while (entradasAdult<0) {
			System.out.println("Error- Introduzca un número positivo");
			System.out.println("¿Cuántas entradas de adultos?");
			entradasAdult = sc.nextInt();
			}

			System.out.println("¿Cuántas entradas infantiles?");
			entradasInfant = sc.nextInt();
		while (entradasInfant<0) {
			System.out.println("Error- Introduzca un número positivo");
			System.out.println("¿Cuántas entradas infantiles?");
			entradasInfant = sc.nextInt();
			}
	

			entradasTotal = entradasAdult + entradasInfant;

			precioTotal = (entradasAdult*9) + (entradasInfant*6);

			if (entradasTotal >= 5) {
				descuento = precioTotal * 0.10;
				precioTotal = precioTotal - descuento;
			}

			System.out.println("Número de entradas de adulto: " + entradasAdult);
			System.out.println("Número de entradas infantiles: " + entradasInfant);
			System.out.println("Número de entradas: " + entradasTotal);
			System.out.println("Precio a pagar: " + precioTotal);

			dineroTotal = dineroTotal + precioTotal;
			totalAdultos = totalAdultos + entradasAdult;
			totalInfantiles = totalInfantiles + entradasInfant;

			if (entradasTotal > masEntradas) {
				masEntradas = entradasTotal;
				clienteMasEntradas = i;
			}
		}

		System.out.println("\nDinero total recaudado:" + dineroTotal);
		System.out.println("Número total de entradas de adulto: " + totalAdultos);
		System.out.println("Número total de entradas infantiles: " + totalInfantiles);
		System.out.println("Cliente que compró más entradas: " + clienteMasEntradas);
		System.out.println("Número de entradas compradas: " + masEntradas);

		sc.close();
	}
}
