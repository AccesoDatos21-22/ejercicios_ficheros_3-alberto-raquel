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


public class Main {
	
	public static Alumno crear(Scanner sc) {

		System.out.println("Introduzca los datos del alumno.");
		sc.nextLine();
		
		System.out.println("Nombre del alumno: ");
		String nombre= sc.nextLine();
		
		
		System.out.println("Apellidos del alumno: ");
		String apellido= sc.nextLine();
		
		System.out.println("Año de nacimiento del alumno: ");
		int anio= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Dirección del alumno: ");
		String calle= sc.nextLine();
		
		System.out.println("Número de la calle: ");
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
		
		Pokemon pokemon2= new Pokemon(ruta, "Ivisaur",90, 60, 62, 63, 80, 80, 60);
		
		
		
		System.out.println("---------- EJERCICIO 16 ----------" + "\n");
		
		System.out.println("¿Cuántos alumnos caben en el aula?");
		int tamano= sc.nextInt();
		
		AulaDAOImp prueba= new AulaDAOImp(tamano);
		
		System.out.println("¿Cuántos alumnos desea añadir?");
		int numalumnos= sc.nextInt();
		
		for (int i = 0; i < numalumnos; i++) {
			if (prueba.estaVacio()) {
				prueba.add(crear(sc));
			}
			
			if (prueba.estaLLeno()) {
				System.out.println("La clase está llena");
			} else {
				prueba.add(crear(sc));
			}
		}
		
		Path ficheroalumnos= Paths.get("Alumnos.txt");
		
		prueba.escribeAlumnos(ficheroalumnos);
		
		System.out.println("Datos de los alumnos" + "\n");
		
		prueba.leeAlumnos(ficheroalumnos);
		
		
		
		sc.close();
	}
	
	
}
