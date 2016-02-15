public class PRO3 {

	public static void main(String[] args) {
		String mensaje = "APUQTI OSEE  LIT OAM SUGPA OUQ EOCONCZO";
		String mensajeCodificado = "";
		String temporal = "";
		// Convertimos el String mensaje en mayusculas y lo guardamos en
		// mensajeCodificado
		mensajeCodificado = mensaje.toLowerCase();
		// Bucle que recorre el mensajeCodificado y cada vez que entra suba 2 a
		// la variable
		for (int i = 0; i < mensajeCodificado.length(); i = i + 2) {
			// Condifional que entra cuando la longitud del mensajeCodificado es
			// igual a la variable más 1
			if (i + 1 == mensajeCodificado.length()) {
				// Cuando entra añadimos la posicion de la letra i de
				// mensajeCodificado en temporal
				temporal = temporal + mensajeCodificado.charAt(i);
			} else {
				// Cuando no entra añadimos la letra en la posicion i+1 mas
				// la letra en la posicion i del mensajeCodificado a temporal.
				temporal = temporal + mensajeCodificado.charAt(i + 1)
						+ mensajeCodificado.charAt(i);
			}
		}
		// Igualamos mensajeCodificado a temporal.
		mensajeCodificado = temporal;
		mensajeCodificado = mensajeCodificado.replaceFirst("p","P");
		System.out.println(mensajeCodificado);

	}

}
