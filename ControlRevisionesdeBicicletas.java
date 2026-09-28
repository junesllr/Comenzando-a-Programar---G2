package comenzandoaProgramarG2;

import java.util.Scanner;

public class ControlRevisionesdeBicicletas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char respuesta;
		int num, revisionSi = 0, revisionNo = 0, dia, mes, año, diaRev, mesRev, añoRev;

		System.out.println("Introduzca la fecha actual:");

		do {
			System.out.println("Día: ");
			dia = sc.nextInt();

			if (dia < 1) {
				System.out.println("ERROR - El día debe ser positivo");
			}

			if (dia > 31) {
				System.out.println("ERROR - No puede haber más de 31 días en un mes");
			}

		} while (dia < 1 || dia > 31);

		
		do {
			System.out.println("Mes: ");
			mes = sc.nextInt();

			if (mes < 1) {
				System.out.println("ERROR - El mes debe ser positivo");
			}

			if (mes > 12) {
				System.out.println("ERROR - Solo hay 12 meses, introduzca un número entre el 1 y el 12");
			}

		} while (mes < 1 || mes > 12);


		do {
			System.out.println("Año: ");
			año = sc.nextInt();

			if (año < 0) {
				System.out.println("ERROR - El año debe ser positivo");
			}

		} while (año < 0);



		System.out.println("\nNúmero de identificación de la bicicleta: ");
		num = sc.nextInt();

		System.out.println("¿Cuál es la fecha de la última revisión?");


		do {
			System.out.println("Día: ");
			diaRev = sc.nextInt();

			if (diaRev < 1) {
				System.out.println("ERROR - El día debe ser positivo");
			}

			if (diaRev > 31) {
				System.out.println("ERROR - No puede haber más de 31 días en un mes");
			}

		} while (diaRev < 1 || diaRev > 31);



		do {
			System.out.println("Mes: ");
			mesRev = sc.nextInt();

			if (mesRev < 1) {
				System.out.println("ERROR - El mes debe ser positivo");
			}

			if (mesRev > 12) {
				System.out.println("ERROR - Solo hay 12 meses, introduzca un número entre el 1 y el 12");
			}

		} while (mesRev < 1 || mesRev > 12);



		do {
			System.out.println("Año: ");
			añoRev = sc.nextInt();

			if (añoRev < 0) {
				System.out.println("ERROR - El año debe ser positivo");
			}

		} while (añoRev < 0);



		if (año - añoRev > 1) {

			System.out.println("Esta bicicleta necesita revisión.");
			revisionSi++;

		} else if (año - añoRev == 1) {

			if (mes > mesRev) {

				System.out.println("Esta bicicleta necesita revisión.");
				revisionSi++;

			} else if (mes == mesRev && dia > diaRev) {

				System.out.println("Esta bicicleta necesita revisión.");
				revisionSi++;

			} else {

				System.out.println("Esta bicicleta NO necesita revisión.");
				revisionNo++;
			}

		} else {

			System.out.println("Esta bicicleta NO necesita revisión.");
			revisionNo++;
		}



		do {

			System.out.println("\n¿Quiere registrar otra bicicleta? Conteste S o N");
			respuesta = sc.next().charAt(0);


			if (respuesta == 'S' || respuesta == 's') {


				System.out.println("Número de identificación de la bicicleta: ");
				num = sc.nextInt();

				System.out.println("¿Cuál es la fecha de la última revisión?");



				do {
					System.out.println("Día: ");
					diaRev = sc.nextInt();

					if (diaRev < 1) {
						System.out.println("ERROR - El día debe ser positivo");
					}

					if (diaRev > 31) {
						System.out.println("ERROR - No puede haber más de 31 días en un mes");
					}

				} while (diaRev < 1 || diaRev > 31);


				do {
					System.out.println("Mes: ");
					mesRev = sc.nextInt();

					if (mesRev < 1) {
						System.out.println("ERROR - El mes debe ser positivo");
					}

					if (mesRev > 12) {
						System.out.println("ERROR - Solo hay 12 meses, introduzca un número entre el 1 y el 12");
					}

				} while (mesRev < 1 || mesRev > 12);



				do {
					System.out.println("Año: ");
					añoRev = sc.nextInt();

					if (añoRev < 0) {
						System.out.println("ERROR - El año debe ser positivo");
					}

				} while (añoRev < 0);




				if (año - añoRev > 1) {

					System.out.println("Esta bicicleta necesita revisión.");
					revisionSi++;

				} else if (año - añoRev == 1) {

					if (mes > mesRev) {

						System.out.println("Esta bicicleta necesita revisión.");
						revisionSi++;

					} else if (mes == mesRev && dia > diaRev) {

						System.out.println("Esta bicicleta necesita revisión.");
						revisionSi++;

					} else {

						System.out.println("Esta bicicleta NO necesita revisión.");
						revisionNo++;
					}

				} else {

					System.out.println("Esta bicicleta NO necesita revisión.");
					revisionNo++;
				}
			}


			else if (respuesta != 'N' && respuesta != 'n') {

				System.out.println("ERROR - Debe contestar S o N");

			}


		} while (respuesta != 'N' && respuesta != 'n');




		System.out.println("\nBicicletas que necesitan revisión: " + revisionSi);
		System.out.println("Bicicletas que no necesitan revisión: " + revisionNo);


		sc.close();
	}
}
