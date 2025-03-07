// Análisis (completar)
// Descripción del programa: Un programa donde se insertaran unas puntuaciones de cierta cantidad de jugadores que hayan hecho en cierto numero de rondas,
//							 donde se sumaran los puntajes de cada jugador, se hara un promedio de cada uno y al final se mostrara cual fue el jugador con la puntuacion mas alta.  
// Entradas: Numero de jugadores, Numero de rondas, puntajes.
// Salidas:  Puntuacion por ronda de cada jugador,suma de puntaje de cada ronda por cada jugador, promedio de puntaje de cada jugador, ranking de posciciones.
// Ejemplo: 


package ui; // No olvidar especificar el paquete / carpeta de nuestro programa

import java.util.Scanner; // Para poder usar Scanner, debemos importarlo

public class AtlasPuntuaciones {

	// Declaración del Escaner que nos ayudará en todo el programa
	private Scanner escaner;

	// Declaración de nuestras constantes a utilizar
	int numjugadores; 
	int puntajes; 
	int numrondas;
	int registrarpuntajes;
	int Calcularymostrarresultados; 

	public static void main(String[] args) {
		AtlasPuntuaciones mainApp = new AtlasPuntuaciones();
		mainApp.run();
	}




	private AtlasPuntuaciones() {
		escaner = new Scanner(System.in);
	}
	
	
	public void run()
	{
		// Declaracion de todas las variables a usar en el programa 


		// Notificacion al usuario de la solicitud de dato
		System.out.println("Ingrese numero de jugadores: ");
		numjugadores = escaner.nextInt();

		System.out.println("Ingrese numero de rondas: "); 
		numrondas = escaner.nextInt();



		// Capturamos el dato con nuestro Scanner (que se llama, escaner)


		// Realizamos los cálculos delegandolos a los métodos


		// Notificación al usuario de los resultados

		 int [][] puntajes = registrarpuntajes( numjugadores, numrondas);
		 //Calcularymostrarresultados(puntajes);



	}

	public int [][] registrarpuntajes(int numjugadores, int numrondas){
		int [][] puntajes = new int [numjugadores][numrondas];
		for (int i = 0; i < numjugadores; i++){
			System.out.println("jugador " + (i + 1));
			for (int j = 0; j < numrondas; j++){
				System.out.println("Puntaje en la ronda " + ( j + 1 ) + ":" );
				puntajes[i][j] = escaner.nextInt();
			}
		}
		return puntajes;
	}

	public void Calcularymostrarresultados(int [][] puntajes){
		int numjugadores = puntajes.length;
		int numrondas = puntajes[0].length;

		//int puntuacionesTotal = new int (numjugadores);
		int[]puntuacionesTotal = new int[numjugadores];
		double[]promedios = new double[numjugadores];
		int jugadorganador = 0;
		int puntuacionmax = 0; 

		System.out.println("Resultados del torneo:");

		for(int i = 0; i < numjugadores; i++) {
			puntuacionesTotal[i] = calcularSumaTotal(puntajes[i]);
			promedios[i] = calcularPromedio(puntajes[i]);

			System.out.println(" jugador " + (i + 1));
			System.out.println("puntajes "); 
		}
		 

	}
	/**
	 * Descripción: El método calcularSumaTotal permite ...
	 * @param int[] numeros
	 * @return 
	 */
    //public int calcularSumaTotal(int[] numeros) {
        // Completar
    //}
	public int calcularSumaTotal(int[] numeros){
		int suma = 0;
		for (int numero : numeros){
			suma += numero;
		}
		return suma;
	}
	
	

	/**
	 * Descripción: El método calcularPromedio permite ...
	 * @param int[] numeros
	 * @return 
	 */
    //public double calcularPromedio(int[] numeros) {
        // Completar
    //}

	public double calcularPromedio(int[] numeros){
		return (double) calcularSumaTotal(numeros)/numeros.length;
	}

	/**
	 * Descripción: El método encontrarMayor permite ...
	 * @param double[] numeros
	 * @return 
	 */
    //public double encontrarMayor(double[] numeros) {
        // Completar
    //}

	

	
}