package thirdproyect;
import java.util.Scanner;
public class Carrerapopular1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dni;
		int carrerasanterior,minutos,participantes=0,respuesta=1,totalcarreras=0,menos60=0,dninumero=0,tipodecarrera;
		double tiempo,segundos,tiempototal=0,tiempomedio=0,mejortiempo=0;
		
		Scanner teclado = new Scanner(System.in);
		
		while (respuesta==1) {
			System.out.println("Dime tu DNI:");
			dni=teclado.next();
			dninumero=dni.length();
			while(dninumero !=9) {
				System.out.println("Formato incorecto!");
				System.out.println("Dime tu DNI:");
				dni=teclado.next();
				dninumero=dni.length();
			}
			
			System.out.println("Carrera 1.individual o 2. por parejas:");
			tipodecarrera=teclado.nextInt();
			while (tipodecarrera<0 || tipodecarrera>2) {
				System.out.println("Elige opción 1 o 2.");
				System.out.println("Carrera 1.individual o por 2.parejas:");
				tipodecarrera=teclado.nextInt();
			}
			
			System.out.println("El número de carreras populares en las que has participado anteriormente:");
			carrerasanterior=teclado.nextInt();
				while(carrerasanterior<0) {
					System.out.println("Error. Número incorrecto.");
					System.out.println("El número de carreras populares en las que has participado anteriormente:");
					carrerasanterior=teclado.nextInt();
				}
				if(carrerasanterior>3) {
					totalcarreras++;
				}
			
			System.out.println("Tiempo realizado en la carrera, en minutos:");
			minutos=teclado.nextInt();
			while(minutos<0) {
				System.out.println("Error.Número incorrecto.");
				System.out.println("Tiempo realizado en la carrera, en minutos:");
				minutos=teclado.nextInt();
			}
			System.out.println("Tiempo realizado en la carrera, en segundos:");
			segundos=teclado.nextDouble();
			while ( segundos< 0 || segundos>60) {
				System.out.println("Error.Número incorrecto.");
				System.out.println("Tiempo realizado en la carrera, en segundos:");
				segundos=teclado.nextDouble();
			}
			minutos=minutos*60;
			tiempo=minutos+segundos;
			
				if(tiempo<60) {
					System.out.println("Tu tiempo es menor a 60 minutos.");
					menos60++;
				}else {
					System.out.println("Tu tiempo es mayor a 60 minutos.");
				}
				
				if (participantes==0) {
					mejortiempo=tiempo;
				}
				
				if (tiempo<mejortiempo) {
					mejortiempo=tiempo;
				}
			participantes++;
			
			tiempototal=tiempototal+tiempo;
			tiempomedio=tiempototal/participantes;
			
			
			System.out.println("Deseas continuar registrando participantes? 1.si o 2.no?");
			respuesta=teclado.nextInt();
			while (respuesta<1 || respuesta > 2) {
				System.out.println("Error. Elige opción 1 o 2.");
				System.out.println("Deseas continuar registrando participantes? 1.si o 2.no?");
				respuesta=teclado.nextInt();
			}
		}
		System.out.println("Numero de participantes: "+ participantes);
		System.out.println("Participantes con más de 3 carreras : "+ totalcarreras);
		System.out.println("Participantes con tiempos menores a 60 minutos: "+menos60);
		System.out.printf("Tiempo medio : %.2f minutos.",(tiempomedio/60) );
		System.out.println("");
		System.out.printf("Mejor tiempo : %.2f minutos.",(mejortiempo/60);
		
		teclado.close();
	}

}

	
