package gimnasio;

import java.util.Scanner;

public class Gimnasio {

	public static void main(String[] args) {
		
		int cantUsuarios,dias,minutos,minutosTotalesUsuario = 0,minutosTotal = 0, diasTotal = 0,masde60 = 0,record = 0,recordUsuario = 0;
		
		Scanner inputTeclado = new Scanner(System.in);
		
		System.out.println("Bienvenido, cuantos usuarios se van a registrar?");
		cantUsuarios = inputTeclado.nextInt();
		for(int i = 0; i < cantUsuarios; i++) {
			System.out.println("Usuario " + (i + 1) +  " cuantos dias has entrenado durante esta semana?");
			dias = inputTeclado.nextInt();
			while (dias > 7 || dias < 0) {
				System.out.println("Error, introduzca un numero valido");
				dias = inputTeclado.nextInt();
			}
			for(int ij = 0; ij < dias; ij++) {
				System.out.println("Cuantos minutos has entrenado el dia " + (ij+1) + ".");
				minutos = inputTeclado.nextInt();
				if(minutos > 60) {
					masde60++; 
				}
				minutosTotalesUsuario = minutosTotalesUsuario + minutos;
				System.out.println("Dia " + (ij+1) + " has entrenado " + minutos + " siendo el total " + minutosTotalesUsuario + "."); 
			}
			if(dias > 0) {
				System.out.println(" -El numero total de minutos entrenado esta semana es de " + minutosTotalesUsuario + ".");
				if(minutosTotalesUsuario > 300) {
					System.out.println(" -Enhorabuena 🎉🎉 has alcanzado el objectivo semanal 🥳🥳.");
				} 
				System.out.println(" -La media de minutos por entrenamiento es de " + (minutosTotalesUsuario/dias) + ".");
				System.out.println(" -Numero de dias en el que ha entrenado mas de 60 minutos: " + masde60 + ".");
				diasTotal = diasTotal + dias;
				minutosTotal = minutosTotal + minutosTotalesUsuario;
				if(minutosTotalesUsuario > record) {
					record = minutosTotalesUsuario;
					recordUsuario = (i+1);
				}
				minutosTotalesUsuario = 0;
				masde60 = 0;
			}
			
		}
		System.out.println("El usuario" + recordUsuario + " ha sido el usuario con mayor tiempo en el gimnasio en esta semana siendo de un total de " + record + ".");
		System.out.println("El numero total de minutos realizados entre todos los usuarios es de " + minutosTotal + ".");
		System.out.println("La cantidad de dias entrenados entre todos los usuarios esta semana es de " + diasTotal + ".");

	}

}
