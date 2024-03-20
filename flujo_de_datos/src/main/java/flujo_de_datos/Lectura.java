package flujo_de_datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lectura {
	// Stream  
	// Stream  IN
	// Stream  OUT
	// Stream  ERR
	
	PrintStream ps;
	
	
	public Lectura() 	

	{
		
		//Intermediario entre la escritura y el canal
		ps = new PrintStream( System.out );
		
		System.out.println("Byte:");
		//Scanner s = new Scanner(System.in);
		//System.err.println();
		//byte a byte
		System.out.write(  13  );  // 
		System.out.write(  10  );  // enter 
		System.out.write(  62 );
		System.out.write(  27 );
		
		
		//ASCII    UNICODE
		byte[] array = { 78 , 64 , 119 , 97 , 19 };
		try {
			
			System.out.write( array );
			
		} catch (IOException e) {
			Logger.getLogger( flujo_de_datos.Lectura.class.getName())
			.log( Level.SEVERE , null , e );
			//e.printStackTrace();
		}
System.err.println("ERROR");
		
		System.out.flush();
		//System.out.println();
		
		
		
		ps.println("holaa");
		ps.printf("El numero elejido es: %b %d y su nombre: %s en su cuenta tiene: %.2f $ \n "
				,true, 8 , "PEPE" ,  655.7);
		
		
		
		File archivo = new File( "error.log" );
		
		//crea un canal de comunicacion de SALIDA, destino: ARCHIVO
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream( archivo );
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//									destino, append
		PrintStream error = new PrintStream( fos , true );
		
		System.setErr( error );
		//System.setOut( error );
		//System.setIn( null );
		
		System.err.println("esto es un error critico");
	}
	
	public String entradaDeDatos() {		
		String cadena = "";
		try {
			
			//int dato = System.in.read();
			
			int Byte = -1;
			
			while(    (Byte = System.in.read())  != '\n'  )
			//System.out.println((char) dato);
			{
				
				if ( Byte != '\n') 
					cadena = cadena + (char)Byte;
					//System.out.println((char)Byte);
				
			}	
			
			System.out.print(cadena);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return cadena;
	}
}

