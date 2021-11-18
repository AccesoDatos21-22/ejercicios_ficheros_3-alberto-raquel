import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.AulaDAOImp;
import dao.PokemonDAO;
import dao.PokemonDAOImp;
import ficheros.Ejercicios1_3;
import modelo.Alumno;
import modelo.Pokemon;
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
	
	public static Alumno crear(Scanner sc) {

		System.out.println("Introduzca los datos del alumno.");
		sc.nextLine();

		System.out.println("Nombre del alumno: ");
		String nombre= sc.nextLine();


		System.out.println("Apellidos del alumno: ");
		String apellido= sc.nextLine();

		System.out.println("A�o de nacimiento del alumno: ");
		int anio= sc.nextInt();
		sc.nextLine();

		System.out.println("Direcci�n del alumno: ");
		String calle= sc.nextLine();

		System.out.println("N�mero de la calle: ");
		int num= sc.nextInt();

		Alumno alumno1= new Alumno(nombre, apellido, anio, calle, num);

		return alumno1;
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		PokemonDAOImp pok1= new PokemonDAOImp(1);

		Ejercicios1_3 ej= new Ejercicios1_3();

		String ruta= ("ficheropokemon.csv");

		Pokemon pokemon3= new Pokemon(ruta, "Pikachu",68, 35, 55, 40, 50, 50, 90);
		Scanner sc = new Scanner(System.in);

		Pokemon pokemon2= new Pokemon(ruta, "Ivisaur",90, 60, 62, 63, 80, 80, 60);


		System.out.println("---------- EJERCICIO 1 ----------" + "\n");

		pok1.escribirPokemon(ruta, "Bulbasur",80, 45, 49, 49, 65, 65, 45);

		System.out.println("---------- EJERCICIO 2 ----------" + "\n");
		pok1.imprimirPokemon(ruta);



		sc.close();
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

		List<String> frases = ejer.getFrases(sc);

		ejer.escribefrases(frases, path);

		sc.close();

	}


}
