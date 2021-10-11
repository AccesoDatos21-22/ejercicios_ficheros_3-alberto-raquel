package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
			System.out.println("El pokemon ya está en la lista");
		} else {
			pokemones.add(pokemon);
		}
  }


  @Override
	public boolean eliminar(Pokemon pokemon){
    return false;
  }


	@Override
	public void escribirPokemon(String ruta, String name, int level, int life, int atack, int defense, int specialAttack, int specialdefense, int speed){
		
		
		Pokemon pokemon1= new Pokemon(ruta, "Bulbasur", 80, 45, 49, 49, 65, 65, 45);
		
		File fichero = new File(ruta);
			    
				try {    
			       
					if (fichero.exists()) {
						
						BufferedWriter bw= new BufferedWriter(new FileWriter(fichero));
						
						
						bw.write(pokemon1.toString());
						bw.newLine();
						
						System.out.println(pokemon1.toString());
						bw.close();
						
					} else {
						
						fichero.createNewFile();
						
						BufferedWriter bw= new BufferedWriter(new FileWriter(fichero));
						
						bw.write(pokemon1.toString());
						bw.newLine();
						
						System.out.println(pokemon1.toString());
						bw.close();
					}

			    }
			    catch (FileNotFoundException e) {
			        System.err.println("Fichero no encontrado");
			        e.printStackTrace();
			    }        
			    catch (IOException e) {
			        
			        e.printStackTrace();
			    } 		
  }
	
	
	@Override
	public void imprimirPokemon (String ruta){
				
		
		File fichero = new File(ruta);
			    
				try {    
			       
					if (fichero.exists()) {
						
						BufferedReader br= new BufferedReader(new FileReader(fichero));
						
						Scanner sc = new Scanner(fichero);
						
						while (sc.hasNext()) {
							String linea = (String) sc.next();
							
							String [] separar= linea.split(";");
							
							System.out.println("Name: " + separar[0]); 
							System.out.println("HP: " + separar[1]);
							System.out.println("Attack: " + separar[2]);
							System.out.println("Defense: " +  separar[3]);
							System.out.println("Special Attack: " + separar[4]);
							System.out.println("Special Defense: " + separar[5]);
							System.out.println("Speed: " + separar[6]);
							
						}
	
						br.close();
						
						sc.close();
						
					} else {
						
						fichero.createNewFile();
						
						BufferedReader br= new BufferedReader(new FileReader(fichero));

						br.close();
					}

			    }
			    catch (FileNotFoundException e) {
			        System.err.println("Fichero no encontrado");
			        e.printStackTrace();
			    }        
			    catch (IOException e) {
			        
			        e.printStackTrace();
			    } 
  }
	
	@Override
	public void escribirPokemon(String ruta){
		
		File fichero = new File(ruta);
			    
				try {    
	
					ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(fichero));
					
					oos.writeObject(pokemones.toString());
					
					
					oos.close();
					
					System.out.println(pokemones.toString());
	
			    }
			    catch (FileNotFoundException e) {
			        System.err.println("Fichero no encontrado");
			        e.printStackTrace();
			    }        
			    catch (IOException e) {
			        
			        e.printStackTrace();
			    } 		

  }
	
	@Override
	public List<Pokemon> leerPokemon(String ruta){
		
		
    return null;
  }

  @Override
	public List<Pokemon> leerPokemon(String ruta, String nombre){
    return null;
  }
}
