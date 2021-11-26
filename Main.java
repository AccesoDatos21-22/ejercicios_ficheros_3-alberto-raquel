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
	
	public static Alumno crear1(Scanner sc) {

		System.out.println("Introduzca los datos del alumno.");
		sc.nextLine();

		System.out.println("Nombre del alumno: ");
		String nombre1= sc.nextLine();


		System.out.println("Apellidos del alumno: ");
		String apellido1= sc.nextLine();

		System.out.println("A�o de nacimiento del alumno: ");
		int anio1= sc.nextInt();
		sc.nextLine();

		System.out.println("Direcci�n del alumno: ");
		String calle1= sc.nextLine();

		System.out.println("N�mero de la calle: ");
		int num1= sc.nextInt();

		Alumno alumno2= new Alumno(nombre1, apellido1, anio1, calle1, num1);

		return alumno2;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Fichero del ejercicio3
		try {
			Path fichero = Files.createFile(Paths.get("fichero.txt"));

		} catch (Exception e) {
			// TODO: handle exception
		}

		
		Pokemon pokemon3= new Pokemon(ruta, "Pikachu",68, 35, 55, 40, 50, 50, 90);
		
		Ejercicios1_3 ejer = new Ejercicios1_3();
		
		System.out.println("Ejercicio 3");

		Path path = ejer.getNombre(sc);

		//ejercicio 8
		
		ejer.leerFrases(path);
		
		sc.close();

		System.out.println();

		ejer.escribefrases(path);
		System.out.println("---------- EJERCICIO 9 ----------" + "\n");

		String ruta2=("ficheroflotante.dat");

		float num=(float) 7.45;

		ej.escribirFlotante(num, ruta2);

		System.out.println("El n�mero flotante se ha a�adido con �xito" + "\n");

		System.out.println("---------- EJERCICIO 10 ----------" + "\n");

		ej.imprimirFlotante(ruta2);


		System.out.println("---------- EJERCICIO 11 ----------" + "\n");

		ej.leerFlotante(ruta2);



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

		System.out.println("---------- EJERCICIO 17 ----------" + "\n");

		System.out.println("�Cu�ntos alumnos caben en el aula?");
		int tamano1= sc.nextInt();

		AulaDAOImp prueba1= new AulaDAOImp(tamano1);
		
		int tamano= sc.nextInt();

		AulaDAOImp prueba= new AulaDAOImp(tamano);

		System.out.println("�Cu�ntos alumnos desea a�adir?");
		int numalumnos1= sc.nextInt();

		for (int i = 0; i < numalumnos1; i++) {
			if (prueba1.estaVacio()) {
				prueba1.add(crear1(sc));
		int numalumnos= sc.nextInt();

		for (int i = 0; i < numalumnos; i++) {
			if (prueba.estaVacio()) {
				prueba.add(crear(sc));
			}

			if (prueba.estaLLeno()) {

			if (prueba1.estaLLeno()) {
				System.out.println("La clase est� llena");
			} else {
				prueba1.add(crear1(sc));
			}
		}

		Path ficheroalumnos= Paths.get("Alumnos.txt");

		prueba.escribeAlumnos(ficheroalumnos);


		Path ficheroalumnos1= Paths.get("Alumnos1.txt");

		prueba1.escribeAlumnos2(ficheroalumnos1);

		System.out.println("Datos de los alumnos" + "\n");

		prueba.leeAlumnos(ficheroalumnos);


		prueba1.leeAlumnos2(ficheroalumnos1);

		sc.close();
	}
	
	
}
