package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import interfaces.InterfazEjercicios1_3;



/**
 * 
 * @author Escribe_aqui_tu_nombre
 * @date 
 * @version 
 * @license GPLv3
 *
 */
public class Ejercicios1_3 implements InterfazEjercicios1_3 {

	/*
	 * getFrases: Almacenan todas las frases en una lista hasta que el usuario no quiera introducir m�s 
	 */
	
	@Override
	public List<String> getFrases(Scanner sc) {
		ArrayList<String> frases = new ArrayList<String>();
		System.out.println("Introduce frases en el fichero");
		System.out.println("Cuantas frases quieres introducir?");
		int numfrases = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < numfrases; i++) {
			System.out.println("Frase " + (i+1));
			String frase = sc.nextLine();
			frases.add(frase);
		}
		
		return frases;
	}

	/* getNombre: Preguntar� al usuario por el nombre del fichero donde se escribir�n las frases 
	 * lo proporcionar� el usuario con el m�todo. El fichero debe existir en el directorio actual. */
	 
	@Override
	public Path getNombre(Scanner escaner) {
		System.out.println("�Cu�l es el nombre del fichero? (Sin poner .txt)");
		String nombre = escaner.nextLine();
		String ruta = nombre + ".txt";
		Path path = null;
				
		try {
			
			path = Paths.get(ruta);
			
			if (Files.exists(path)) {
				System.out.println("El fichero existe, trabajaremos con �l");
			} else {
				System.out.println("El fichero no existe");
				path = null;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return path;

	}
	
	/*
	 * Ejercicio4
	 * Refactoriza el m�todo escribefrases para escribir las l�neas sin buffer, utilizando OutputStream.
	 */
	@Override
	public void escribefrases(List<String> cadenas, Path ruta) {

		 try {

			 	FileOutputStream oos = new FileOutputStream((new File(ruta.toString())));

			 	for (String frases : cadenas) {
			 		frases+= "\n";
					oos.write(frases.getBytes());
				}

				oos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	
	/*
	* Ejercicio6
	* Refactoriza el m�todo escribefrases pero ahora sin almacenar las frases en una lista, 
	* tendr�s que ir a�adiendo cada frase al final del fichero utilizando BufferedWriter y la opci�n APPEND
	*/
	
	 public void escribefrases(Path ruta) {
		 
			 
	}
	
	 /*Ejercicio8
	  * Implementa el m�todo leerFrases para que despu�s de escribir el archivo con las frases, 
	  * se lea y se muestre por pantalla el contenido.

	  */
	@Override
	public void leerFrases(Path ruta) {
		// TODO Auto-generated method stub
	}



	@Override
	public void escribirFlotante(float numeroDecimal, String ruta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Float> leerFlotante(String ruta) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
		
		


}
