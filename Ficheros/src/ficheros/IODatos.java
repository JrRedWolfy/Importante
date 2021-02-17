package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IODatos {

	
	public static void mostrar (String nombreFichero, int longitudLinea) {
		
		File f = new File(nombreFichero);
		FileReader fr =null;
		Scanner leer = null;
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		try {
			fr = new FileReader(f);
			leer = new Scanner(fr);
			
			while(leer.hasNext()) {
				String linea = leer.nextLine();
				formatearLinea(linea,longitudLinea);
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			leer.close();
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	private static void formatearLinea(String linea, int longitudLinea) {
		Persona p;
		String nombre="", apellido="";
		
		for (int i = 8; i <= linea.length(); i++) {
			if (linea.substring(i, i + 1).equals(",")) {
				
				apellido = linea.substring(8, i);
				nombre = linea.substring(i+1, linea.length());	
				break;
			}
		}
		
		int nip;
		nip = Integer.parseInt(linea.substring(0, 6));
		p = new Persona(nombre, apellido, nip);
		System.out.println(p.mostrarDatos(longitudLinea));
	}
}
