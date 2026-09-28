package thirdproyect;
import java.util.Scanner;
public class CO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		
		int personas,opcion,horas,plancha;
		double kilometros,co2=0,sumapersona=0,sumagrupo=0;
		
		System.out.println("Bienvenidos ¿Cuántas personas se van a registrar?");
		personas=teclado.nextInt();
		
		while (personas<=0) {
			System.out.println("Error.Es necesario un número positivo!");
			System.out.println("¿Cuántas personas se van a registrar?");
			personas=teclado.nextInt();
		}
		
		for (int i=1;i<=personas;i++) {
			opcion=0;
			sumapersona=0;
			System.out.println("Es el turno de persona: "+i + ".");
			while (opcion!=7) {
			 
				System.out.println("Elige una opción:");
				System.out.println("1.Transporte en coche ");
				System.out.println("2.Transporte en autobús ");
				System.out.println("3.Transporte en bicicleta ");
				System.out.println("4.Uso de plancha ");
				System.out.println("5.Uso del ordenador");
				System.out.println("6.Uso del móvil ");
				System.out.println("7.Finalizar actividades del día");
				System.out.println("");
				
				opcion=teclado.nextInt();
			 
				switch (opcion) {
					
					case 1: 
						System.out.println("¿Cuántos kilómetros recorriste en coche?");
						kilometros=teclado.nextDouble();
							while (kilometros < 0) {
								System.out.println("Error.Numero positivo!");
								System.out.println("¿Cuántos kilómetros recorriste en coche?");
								kilometros=teclado.nextDouble();
							}
							co2=kilometros*0.21;
							sumapersona=sumapersona+co2;
							break;
					
					case 2:
						System.out.println("¿Cuántos kilómetros recorriste en bus?");
						kilometros=teclado.nextDouble();
						while (kilometros < 0){
							System.out.println("Error.Numero positivo!");
							System.out.println("¿Cuántos kilómetros recorriste en bus?");
							kilometros=teclado.nextDouble();
						}			
					
						co2=kilometros*0.10;
						sumapersona=sumapersona+co2;
						break;
						
					case 3:
						
						System.out.println("¿Cuántos kilómetros recorriste en bicicleta?");
						kilometros=teclado.nextDouble();
						while (kilometros < 0){
							System.out.println("Error.Numero positivo!");
							System.out.println("¿Cuántos kilómetros recorriste en bicicleta?");
							kilometros=teclado.nextDouble();
						}
						
						co2=kilometros*0;
						sumapersona=sumapersona+co2;
						break;
						
					case 4:
						System.out.println("¿Usaste la plancha? 1.SI o 0.NO");
						plancha=teclado.nextInt();
							if (plancha ==1){
								System.out.println("¿Cuántas horas utilizaste la plancha?");
								horas=teclado.nextInt();
								while(horas<0) {
									System.out.println("Error.Numero positivo!");
									System.out.println("¿Cuántas horas utilizas la plancha?");
									horas=teclado.nextInt();
								}
								
								co2=horas*0.70;
								sumapersona=sumapersona+co2;
							} else if (plancha==0) {
							}else {
								System.out.println("Error.Debes elegir entre las opciones 0 o 1.");							
							}
						break;
						
				
					case 5:
						System.out.println("¿Cuántas horas usaste el ordenador?");
						horas=teclado.nextInt();
						
						while(horas<0) {
							System.out.println("Error.Numero positivo");
							System.out.println("¿Cuántas horas utilizas el ordenador?");
							horas=teclado.nextInt();
						}
						
						co2=horas*0.08;
						sumapersona=sumapersona+co2;
						break;
						
						
					case 6:
						System.out.println("¿Cuántas horas usas el móvil?");
						horas=teclado.nextInt();
						
						while(horas<0) {
							System.out.println("Error.Numero positivo");
							System.out.println("¿Cuántas horas utilizas el móvil?");
							horas=teclado.nextInt();
						}
						
						co2=horas*0.02;
						sumapersona=sumapersona+co2;
						break;
						
					case 7:
						System.out.println(" Gracias.Agur");
						break;
					}
			} 
			
			System.out.println("Tu CO2 emitido es : " + sumapersona);
			System.out.println(" ");
			sumagrupo=sumagrupo+sumapersona;
		}
		
			System.out.println("CO2 de todas las personas es : "+ sumagrupo);
				
			teclado.close();
			}
	}



