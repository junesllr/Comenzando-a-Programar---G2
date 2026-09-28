package gimnasio;

import java.util.Scanner;

public class Videojuegos {

	public static void main(String[] args) {
		
		int ij,cantJugadores,partidas = 0,puntos,enemigos,puntosTotalesUsuario = 0,enemigosTotalesUsuario = 0,puntosTotal = 0, enemigosTotal = 0,record = 0,recordUsuario = 0;
		
		Scanner inputTeclado = new Scanner(System.in);
		
		System.out.println("Bienvenido, cuantos jugadores se van a registrar?");
		cantJugadores = inputTeclado.nextInt();
		while(cantJugadores < 0) {
			System.out.println("Error escoge una cantidad igual o mayor a 0");
			cantJugadores = inputTeclado.nextInt();
		}
		for(int i = 0; i < cantJugadores; i++) {
			System.out.println("Jugador " + (i+1) +  " cuantas partidas has jugado?.");
			partidas = inputTeclado.nextInt();
			while (partidas < 1) {
				System.out.println("Error, introduzca un numero valido");
				partidas = inputTeclado.nextInt();
			}
			for(ij = 0; ij < partidas; ij++) {
				System.out.println("Cuantos puntos has conseguido en la partida " + (ij+1) + "?.");
				puntos = inputTeclado.nextInt();
				while (puntos < 0) {
					System.out.println("Error, introduzca un numero valido");
					puntos = inputTeclado.nextInt();
				}
				puntosTotalesUsuario = puntosTotalesUsuario + puntos;
				
				System.out.println("Cuantos enemigos has derrotado en la partida " + (ij+1) + "?.");
				enemigos = inputTeclado.nextInt();
				while (enemigos < 0) {
					System.out.println("Error, introduzca un numero valido");
					enemigos = inputTeclado.nextInt();
				}
				enemigosTotalesUsuario = enemigosTotalesUsuario +enemigos;
				}
			System.out.println("La puntuacion total de el jugador" + (i+1) +  " es de " + puntosTotalesUsuario);
			if(puntosTotalesUsuario > 1000) {
				puntosTotalesUsuario = puntosTotalesUsuario + 100; 
				System.out.println("Como ha superado los 1000 puntos se le agregaran 100 puntos extra siendo su puntuaje final de " + puntosTotalesUsuario);
				System.out.println("La cantidad de enemigos derrotados por el jugador" + (i+1) +  " es de " + enemigosTotalesUsuario + ".");
				System.out.println("La media de puntos por partida de el jugador" + (i+1) +  " es de " + ((puntosTotalesUsuario-100)/partidas) + ".");
				
			}
			else {
				System.out.println("La cantidad de enemigos derrotados por el jugador" + (i+1) +  " es de " + enemigosTotalesUsuario + ".");
				System.out.println("La media de puntos por partida de el jugador" + (i+1) +  " es de " + (puntosTotalesUsuario/partidas) + ".");
				
			}
				if(puntosTotalesUsuario > record) {
					record = puntosTotalesUsuario;
					recordUsuario = (i+1);
				}
				puntosTotal = puntosTotal + puntosTotalesUsuario;
				enemigosTotal = enemigosTotal + enemigosTotalesUsuario;
				puntosTotalesUsuario = 0;
				enemigosTotalesUsuario = 0;
			}
		if(cantJugadores > 0) {
			System.out.println("");
			System.out.println(" -El numero total de puntos conseguidos por los jugadores es de " + puntosTotal + ".");
			System.out.println(" -El numero total de enemigos derrotados por los jugadores es de " + enemigosTotal + ".");
			System.out.println(" -El jugador" + recordUsuario + " tiene el record de puntuaje siendo de " + record + " puntos.");
		}

			
		
	}

}
