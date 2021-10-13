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
	
	public static Alumno crear1(Scanner sc) {

		System.out.println("Introduzca los datos del alumno.");
		sc.nextLine();
		
		System.out.println("Nombre del alumno: ");
		String nombre1= sc.nextLine();
		
		
		System.out.println("Apellidos del alumno: ");
		String apellido1= sc.nextLine();
		
		System.out.println("Año de nacimiento del alumno: ");
		int anio1= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Dirección del alumno: ");
		String calle1= sc.nextLine();
		
		System.out.println("Número de la calle: ");
		int num1= sc.nextInt();
		
		Alumno alumno2= new Alumno(nombre1, apellido1, anio1, calle1, num1);
		
		return alumno2;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		System.out.println("---------- EJERCICIO 17 ----------" + "\n");
		
		System.out.println("¿Cuántos alumnos caben en el aula?");
		int tamano1= sc.nextInt();
		
		AulaDAOImp prueba1= new AulaDAOImp(tamano1);
		
		System.out.println("¿Cuántos alumnos desea añadir?");
		int numalumnos1= sc.nextInt();
		
		for (int i = 0; i < numalumnos1; i++) {
			if (prueba1.estaVacio()) {
				prueba1.add(crear1(sc));
			}
			
			if (prueba1.estaLLeno()) {
				System.out.println("La clase está llena");
			} else {
				prueba1.add(crear1(sc));
			}
		}
		
		Path ficheroalumnos1= Paths.get("Alumnos1.txt");
		
		prueba1.escribeAlumnos2(ficheroalumnos1);
		
		System.out.println("Datos de los alumnos" + "\n");
		
		prueba1.leeAlumnos2(ficheroalumnos1);
		
		sc.close();
	}
	
	
}
