package flujo_de_datos;

import java.io.PrintStream;

public class Main {

	public static void main(String[] args) {
		
		Lectura leer = new Lectura();
		
		//String leido = leer.entradaDeDatos();
		PrintStream ps = new PrintStream( System.out );
		String texto = "Este va a ser el, texto <> que yo quiero, manipu";

		ps.println("El char 3: " + texto.charAt(3));
		ps.println("sin espacios: " + texto.trim());
	}

}
