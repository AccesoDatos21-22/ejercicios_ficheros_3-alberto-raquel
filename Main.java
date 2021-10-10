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
		
	//Me creo un fichero binario para los ejercicios del 12 al 15
		
		try {
			String ruta = "binario.dat";
			File binario = new File(ruta);
			binario.createNewFile();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

		PokemonDAOImp pokemon1 = new PokemonDAOImp(1);// porque le paso 1 pokemon
	
		// Me creo pokemons para lo ejercicios del 12 al 15
		
		Pokemon pokemon2 = new Pokemon("Ivysaur", 405 , 62, 63, 80, 80, 80);
		
		Pokemon pokemon3 = new Pokemon("Venusaur", 525, 82, 83, 100, 100, 80);
		
		Pokemon pokemon4 = new Pokemon("Charmander", 309, 52, 43, 60, 50, 65);
		
		// Los añado al List
		pokemon1.add(pokemon2);
		pokemon1.add(pokemon3);
		pokemon1.add(pokemon4);
		
		//Ejercicio 13
		pokemon1.escribirPokemon("binario.dat", pokemon2);
		
		//Ejercicio 14
		pokemon1.leerPokemon("binario.dat");
		
		//Ejercicio 15
		pokemon1.leerPokemon("binario.dat", "saur");
		
		sc.close();
		
	}

}
