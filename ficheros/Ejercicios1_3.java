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
	 * getFrases: Almacenan todas las frases en una lista hasta que el usuario no quiera introducir más 
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

	/* getNombre: Preguntará al usuario por el nombre del fichero donde se escribirán las frases 
	 * lo proporcionará el usuario con el método. El fichero debe existir en el directorio actual. */
	 
	@Override
	public Path getNombre(Scanner escaner) {
		System.out.println("¿Cuál es el nombre del fichero? (Sin poner .txt)");
		String nombre = escaner.nextLine();
		String ruta = nombre + ".txt";
		Path path = null;
				
		try {
			
			path = Paths.get(ruta);
			
			if (Files.exists(path)) {
				System.out.println("El fichero existe, trabajaremos con él");
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
	 * Ejercicio5
	 * Refactoriza el método escribefrases pero ahora escribiendo las líneas una a una con BufferedWriter
	 */
	@Override
	public void escribefrases(List<String> cadenas, Path ruta) {
		 
	}


	
	/*
	* Ejercicio6
	* Refactoriza el método escribefrases pero ahora sin almacenar las frases en una lista, 
	* tendrás que ir añadiendo cada frase al final del fichero utilizando BufferedWriter y la opción APPEND
	*/
	
	 public void escribefrases(Path ruta) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 Charset charset = Charset.forName("UTF-8");
		 
		 OpenOption[] append = new OpenOption[1];
		 append[0] = StandardOpenOption.APPEND;

		 try (BufferedWriter bw = Files.newBufferedWriter(ruta, charset, append)) {
		
			 System.out.println("Introduce frases en el fichero");
				System.out.println("Cuantas frases quieres introducir?");
				int numfrases = sc.nextInt();
				sc.nextLine();
				
		           
				for (int i = 0; i < numfrases; i++) {
					System.out.println("Frase " + (i+1));
					String frase = sc.nextLine();
					bw.append(frase + "\n");	
				}
							
			sc.close();
		} catch (Exception e) {
			// TODO: handle exception
		}		
			 
			 
	}
	
	 /*Ejercicio7
	  * ¿Cuál de las 4 soluciones anteriores piensas que es la más eficiente?
	  * la última, la del ejercicio 6, ya que con el uso de append
	  * lo que hacemos es añadir las frases al final del fichero
	  * sin sobreescribir información.
	  */
	 
	 
	 
	 
	 
	 /*Ejercicio8
	  * Implementa el método leerFrases para que después de escribir el archivo con las frases, 
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
