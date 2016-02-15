
public class PRO2 {

	public static void main(String[] args) {
		String mensaje = "Paquito es el tio mas guapo que conozco";
		String mensajeCodificado = "";
		String temporal = "";
		//Convertimos el String mensaje en mayusculas y lo guardamos en mensajeCodificado
		mensajeCodificado = mensaje.toUpperCase();
		//Bucle que recorre el mensajeCodificado y cada vez que entra suba 2 a la variable
		for (int i =0;i<mensajeCodificado.length();i=i+2){
			//Condifional que entra cuando la longitud del mensajeCodificado es igual a la variable más 1
			if (i+1==mensajeCodificado.length()){
				//Cuando entra añadimos la posicion de la letra i de mensajeCodificado en temporal
				temporal = temporal + mensajeCodificado.charAt(i);
			}else{
				//Cuando no entra añadimos la letra en la posicion i+1 mas 
				//la letra en la posicion i del mensajeCodificado a temporal.
				temporal = temporal + mensajeCodificado.charAt(i+1)+mensajeCodificado.charAt(i);
			}
		}
		//Igualamos mensajeCodificado a temporal.
		mensajeCodificado = temporal;
		System.out.println(mensajeCodificado);

	}

}
