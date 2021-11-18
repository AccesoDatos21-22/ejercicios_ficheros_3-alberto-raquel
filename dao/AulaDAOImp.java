/**
 *AulaDAOImp.java
 *@author Laura y Carlos
 *@version 1.0
 */

package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import modelo.Alumno;

/**
 *  @descrition AulaDAOImp
 *	@author Laura y Carlos
 *  @date 18/9/2021
 *  @version 1.0
 *  @license GPLv3
 */
public class AulaDAOImp implements AulaDAO{
	private List<Alumno> alumnos;
	private int numalumnos; // atributo para controlar el número real de
							// elementos que tiene nuestro almacén

	/**
	 * Constructor del Almacén con un determinado tamano
	 * 
	 * @param tamano
	 */
	public AulaDAOImp(int tamano) {
		alumnos = new ArrayList<Alumno>(tamano);
		numalumnos = tamano;

	}

	/**
	 * Comprueba si el almacén está vacio
	 * 
	 * @return true si está vacio
	 */
	public boolean estaVacio() {
		return false;
	}

	/**
	 * Comprueba si el almacén está lleno
	 * 
	 * @return
	 */
	public boolean estaLLeno() {
		return false;
	}

	/**
	 * Anade un nuevo elemento al almacén si hay sitio
	 * 
	 * @param valor a anadir al almacén
	 */
	public void add(Alumno alumno) {
		
		alumnos.add(alumno);
	}

	/**
	 * Elimina un elemento del almacén si está en el almacen
	 * 
	 * @param valor
	 * @return true si elimina el elemento, false en caso contrario
	 */
	public boolean eliminar(Alumno alumno) {
		return false;

	}

	/**
	 * Imprime por pantalla los elementos del almacén
	 */
	public void informacionAlumnos() {
		
		for (Alumno alum : alumnos) {
			
			System.out.println(alum.getNombre() + "\n" + alum.getApellidos() + "\n" + alum.getAnoNacimiento() + "\n"
					+ alum.getDireccion());
		}
	}

	/**
	 * Método que escribe los alumnos en un archivo
	 * 
	 * @param ruta
	 */
	public void escribeAlumnos(Path ruta) {
		
		try {
			
			BufferedWriter bw= Files.newBufferedWriter(ruta);
			
			for (Alumno alum : alumnos) {
				
				bw.write(alum.toString());
				
				bw.newLine();		
			}
			
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void escribeAlumnos2(Path ruta) {
		
		try {
			
			BufferedWriter bw1= Files.newBufferedWriter(ruta);
			
			for (Alumno alum : alumnos) {
				
				bw1.write(alum.toString());
				
				bw1.newLine();	
			}
			
			bw1.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * Método que lee alumnos de un archivo y los muestra por pantalla
	 * 
	 * @param ruta
	 */
	public void leeAlumnos(Path ruta) {

		try (BufferedReader br= Files.newBufferedReader(ruta)) {
			
			String linea;
			
			while ((linea=br.readLine())!=null) {
				System.out.println(linea);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void leeAlumnos2(Path ruta) {

		try (BufferedReader br= Files.newBufferedReader(ruta))  {
	
			System.out.println(Files.readAllLines(ruta));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
