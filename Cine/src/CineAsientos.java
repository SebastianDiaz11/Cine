import java.util.Scanner;

public class CineAsientos {

	public static void main(String[] args) {
		// Declaracion de variables
		char asientos [][] = new char [10][10];
		boolean condicion = false;
		Scanner entrada = new Scanner(System.in);
		int fila = 0, asiento = 0;
		String respuesta;
		String verMapa;
		
		//Cargamos matriz de asientos
		for(int f=0;f<10;f++) {
			for(int c=0;c<10;c++) {
				asientos [f][c] = 'L';
			}
		}
		//Inicio del sistema
		System.out.println("****** Bienvenidos al sistema de reservas ******");
		//Reserva de asientos
		while(condicion != true) { 
			
			//Visualizacion de mapas
			System.out.println("¿Desea ver los asientos disponibles?");
			System.out.println("S: si. Cualquier otra letra: no");
			verMapa = entrada.next();
			
			if(verMapa.equalsIgnoreCase("S")) {
				//Llamamos al metodo
				Mapa(asientos);	
			}
			//Reserva
			boolean reserva=false;
			while(reserva !=true) {
			System.out.println("\nIngrese fila a reservar");
			System.out.print("Fila (entre 0 y 9: ");
			fila = entrada.nextInt();
			
			System.out.println("Ingrese asiento a reservar");
			System.out.print("Asiento (entre 0 y 9: ");
			asiento = entrada.nextInt();
			
			if(fila<=9&& fila>=0) {
				if (asiento <=9 && asiento >=0) {
					reserva = true;
				} else {
					System.out.println("El numero de asiento no es valido");
				}
			} 	else {
					System.out.println("El numero de fila no es valido");
				}
			}
			
			if (asientos[fila][asiento] == 'L'){
				asientos[fila][asiento] = 'X';
				System.out.println("El asiento fue reservado correctamente");	
			} else {
				System.out.println("El asiento esta ocupado. Por favor elija otro");
			}
			
			System.out.println("¿Desea finalizar la reserva?");
			System.out.println("S: si. Cualquier otra letra: NO");
			respuesta = entrada.next();
			
			if (respuesta.equalsIgnoreCase("S")) {
				condicion = true;
			}
		}
		
	}
	static void Mapa(char asientos[][]) {
		
		// Imprimir encabezado con números de columna
	    System.out.print("  ");
	    for (int i = 0; i < 10; i++) {
	        System.out.print("  " + i + "  ");
	    }
	    System.out.println(); // Nueva línea después del encabezado
	    
	    //Imprimir las filas 
		for(int f=0;f<10;f++) {
			System.out.print(f + " ");
			for(int c=0;c<10;c++) {
				System.out.print(" [" +asientos[f][c] + "] ");
			}
			System.out.println("");
		}
	}
}
