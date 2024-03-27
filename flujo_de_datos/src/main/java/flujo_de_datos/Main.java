package flujo_de_datos;

import java.io.PrintStream;

public class Main {

	public static void main(String[] args) {
		
		Lectura leer = new Lectura();
		
		//String leido = leer.entradaDeDatos();
		PrintStream ps = new PrintStream( System.out );
		String texto = "Este va a ser el, texto <> que yo quiero, manipular.";

		ps.println("(ASCII)El char 3: " + texto.charAt(3));
		ps.println("sin espacios: " + texto.trim());
		ps.println("'EL' está en la pocision: " + texto.indexOf("el"));
		ps.println("el < está en la posicion: " + texto.indexOf('>'));
		ps.println("ultima aparicion de la letra E: " + texto.lastIndexOf('e'));
		ps.println("largo del texto: " + texto.length());
		
		ps.println("" + texto.equals() );
		ps.println(""  + texto.compareTo("hola") );
		ps.println("" + texto.compareToIgnoreCase("hola") );

		ps.println(""  + texto.contains("hola") );
		ps.println(""  + texto.replace("a", "4") );
		ps.println(""  + texto.replaceAll(" ", "_") );

		ps.println("" + texto.concat(" otro texto ").concat("otro mas"));
		ps.println("" + texto.toLowerCase() );
		ps.println("" + texto.toUpperCase() );

		ps.println("" + texto.startsWith("Este"));
		ps.println("" + texto.endsWith("."));

		ps.println("" + texto.substring( 10 ));
		ps.println("" + texto.substring( 10 , 8 ));
		
		ps.println("" + texto.substring( 0 , texto.indexOf(" <> ") ) );
		ps.println("" + texto);
		ps.println("UNICODE(E): " + texto.codePointAt(10));
		
		char[] letraAlerta = texto.toCharArray();
		
		String separar = "esto, es un texto, que vamos, a separar.";
		String [] vec = separar.split(","); //["esto", " es un texto" , "que vamos" , "a separar."]
		separar.split("\\+"); //    \n    \+     \\\
		texto.split("<>");
				
		
		
	

}
