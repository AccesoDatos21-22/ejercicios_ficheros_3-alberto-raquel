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
		
		
		return null;
	}

	/* getNombre: Preguntar� al usuario por el nombre del fichero donde se escribir�n las frases 
	 * lo proporcionar� el usuario con el m�todo. El fichero debe existir en el directorio actual. */
	 
	@Override
	public Path getNombre(Scanner escaner) {
		
		
		return null;
	}
	
	/*3/4/5
	 * escribefrases: Escr�be  todas las l�neas  la vez con write de la clase Files.

	 */
	@Override
	public void escribefrases(List<String> cadenas, Path ruta) {
		
		
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
