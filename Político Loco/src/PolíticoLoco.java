import java.util.Random;
import java.util.Scanner;

public class PoliticoLoco {
	static String respuestas[]={
			"Tienes toda la raz�n, y est� totalmente planteado en nuestro proyecto",
			"Si",
			"No",
			"Si,si",
			"Por supuesto",
			"Debemos revirsarlo",
			"La culpa es edel anterior gobierno",
			"Hemos sido los �nicos en revisarlo",
			"El anterior gobierno hizo todos esos cambios",
			"Si se vota a otro partido, habr� una recesi�n",
			"Por supuesto",
			"De acuerdo",
	};
	static Random rn = new Random(); //Generador de numeros aleatorios
	static int numeroMinimo=0; //El n�mero m�nimo en el array es el 0
	static int numeroMaximo=respuestas.length;
	//Esta funci�n devolver� una rrespuesta aleatoria de nuestro pol�tico loco
	public static String devolverRespuesta(){
		int numeroDentroDelArray = rn.nextInt(numeroMaximo - numeroMinimo + 1) + numeroMinimo;
		
		return respuestas[numeroDentroDelArray];
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); // Creamos un objeto de la clase Scanner
		System.out.println("--------------------------------");
		System.out.println("---------- POL�TICO LOCO--------");
		while(true){
			System.out.print("�Cual es tu pregunta?: ");
			//Pregunta
			String pregunta;
			pregunta= in.nextLine();
			System.out.println(devolverRespuesta());
		}

	}

}
