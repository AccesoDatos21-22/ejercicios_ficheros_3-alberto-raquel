import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.PokemonDAOImp;
import ficheros.Ejercicios1_3;
import modelo.Pokemon;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Fichero del ejercicio3
		try {
			Path fichero = Files.createFile(Paths.get("fichero.txt"));
						
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		//Prueba de ejercicio 3
		
		Ejercicios1_3 ejer = new Ejercicios1_3();
		
		System.out.println("Ejercicio 3");
			
		Path path = ejer.getNombre(sc);
		
		System.out.println();
		
		ejer.escribefrases(path);
		
		sc.close();
		
	}

}
