package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.Alumno;
import modelo.Pokemon;

public class PokemonDAOImp implements PokemonDAO {

	private List<Pokemon> pokemones;
	private int numPokemones; // atributo para controlar el numero real de
	// elementos que tiene nuestro almacen

	/**
	 * Constructor del Almacen con un determinado tamano
	 * 
	 * @param tamano
	 */
	public PokemonDAOImp(int tamano) {
		pokemones = new ArrayList<Pokemon>(tamano);
		numPokemones = tamano;
	}

	@Override
	public boolean estaVacio(){
    return false;
  }

	@Override
	public boolean estaLLeno(){
    return false;
  }


	@Override
	public void add(Pokemon pokemon) {
		if (pokemones.contains(pokemon)) {
			System.out.println("El pokemon ya existe");
		}else {
			pokemones.add(pokemon);
		}
	}


  @Override
	public boolean eliminar(Pokemon pokemon){
    return false;
  }


  //Ejercicio1
	@Override
	public void escribirPokemon(String ruta, String name, int life, int atack, int defense, int specialAttack, int specialdefense, int speed){
		
	
  }
	
	
	//Ejercicio2
	@Override
	public void imprimirPokemon (String ruta){
		
	/*Name: <Nombre>
	 level: <nivel>
	 HP: <Vida>
	 attack: <Vida>
	 defense: <defensa>
	 Special attack: <Ataque Especial>
	 Special defense: <Defensa Especial>
	 speed: <velocidad>*/
		

  }
	
	/*
	 * Escriba un método llamado escribirPokemon que reciba un objeto de tipo Pokemon y 
	 * si este no está en el fichero, que lo guarde al final de un archivo pasado también por parámetro.
	 */
	@Override
	public void escribirPokemon(String ruta, Pokemon pokemon){
	
		//Actualizamos el arraylist
		if (pokemones.contains(pokemon)) {
			System.out.println("El pokemon ya está en el fichero");
		}
		else {
			pokemones.add(pokemon);
		}
				
		//Actualizamos el fichero 
		
		try {
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta));
			
			for (Pokemon pokemon2 : pokemones) {
				oos.writeObject(pokemon2);
				
				//Saco por pantalla los pokemon del arraylist
				//System.out.println(pokemon2);
			}
			
			oos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	
	
	
	/*14
	 * Escriba un método leerPokemon reciba un archivo que almacena pokemons y que devuelva una lista de objetos pokemon.
	 */
	@Override
	public List<Pokemon> leerPokemon(String ruta){
		
		
    return null;
  }
	/*
	 * Escriba un método leerPokemon  que reciba en una cadena y un archivo que almacena pokemons y 
	 * que devuelva una lista de objetos pokemon que contengan esa cadena en el nombre. Por ejemplo “saur” 
	 * debería de devolver a Bulbasaur, Ivysaur, Venusaur y Mega Venusaur
	 */
  @Override
	public List<Pokemon> leerPokemon(String ruta, String nombre){
	
    return null;
  }
}
