package ficheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

	
	
	@Override
	public List <String> getFrases(Scanner sc) {
		
		List <String> listafrases= new ArrayList<String>();
		
		try {
	
			System.out.println("¿Cuántas frases quieres escribir?");
			int numfrases= sc.nextInt();
			String frases;
			sc.nextLine();
			for (int i = 0; i < numfrases; i++) {
				System.out.println("Escriba la frase número " + (i+1) + ": ");
				frases= sc.nextLine();
				listafrases.add(frases);
			}

	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listafrases;
	}

	@Override
	public Path getNombre(Scanner sc) {
		
		System.out.println("Introduzca el nombre del fichero (sin el .txt) al que desea acceder para escribir frases");
		Path consulta= Paths.get((sc.nextLine()) + ".txt");

		return consulta;
	}
	
	@Override
	public void escribefrases(List<String> cadenas, Path ruta) {
		
		try {
			
			Files.write(ruta, cadenas);
			
			System.out.println("Las frases se han añadido al fichero con éxito");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void leerFrases(Path ruta) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void escribirFlotante(float numeroDecimal, String ruta) {
		
		try {
			
			File ficheroo=new File(ruta);
			
			if (ficheroo.exists()) {
				
				DataOutputStream dos= new DataOutputStream(new FileOutputStream(ficheroo));
				
				dos.writeFloat(numeroDecimal);
				
				dos.close();
				
				
			} else {
				
				ficheroo.createNewFile();
				
				DataOutputStream doss= new DataOutputStream(new FileOutputStream(ficheroo));
				
				doss.writeFloat(numeroDecimal);
				
				doss.close();		
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void imprimirFlotante(String ruta) {
		
		try {
			
			File ficheroflot=new File(ruta);
			
			
			
			if (ficheroflot.exists()) {
				
				DataInputStream dis= new DataInputStream(new FileInputStream(ficheroflot));
				
				System.out.println(dis.readFloat()); 
				
				dis.close();
				
			} else {
				
				ficheroflot.createNewFile();	
				
				DataInputStream diss= new DataInputStream(new FileInputStream(ficheroflot));
				
				System.out.println(diss.readFloat()); 
				
				diss.close();
			}
	
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Float> leerFlotante(String ruta) {
		
		List <Float> listanum= new ArrayList <Float>();
		
		float num1= (float) 5.76;
		float num2= (float) 2.21;
		float num3= (float) 12.49;
		float num4= (float) 0.36;
		
		listanum.add(num1);
		listanum.add(num2);
		listanum.add(num3);
		listanum.add(num4);
		
		try {
			
			File ficheroflotante=new File(ruta);

			if (ficheroflotante.exists()) {
				
				ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(ficheroflotante));
				
				oos.writeUnshared(listanum);
				
				oos.close();
				
				ObjectInputStream ois=new ObjectInputStream(new FileInputStream(ficheroflotante));
				
				System.out.println(ois.readUnshared());
				
				ois.close();
				
				
			} else {
				
				ficheroflotante.createNewFile();	
				
				ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(ficheroflotante));
				
				oos.writeUnshared(listanum);
				
				oos.close();
				
				ObjectInputStream ois=new ObjectInputStream(new FileInputStream(ficheroflotante));
				
				System.out.println(ois.readUnshared());
				
				ois.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
