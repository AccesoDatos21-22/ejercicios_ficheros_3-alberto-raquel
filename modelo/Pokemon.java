package modelo;

import java.io.Serializable;

public class Pokemon implements Serializable{
	
	//String name, int life, int atack, int defense, int specialAttack, int specialdefense, int speed

		private String name;
		private int life;
		private int atack;
		private int defense;
		private int specialAttack;
		private int specialdefense;
		private int speed;
		
	//Constructor lleno	
		
	public Pokemon(String name, int life, int atack, int defense, int specialAttack, int specialdefense, int speed) {
		super();
		this.name = name;
		this.life = life;
		this.atack = atack;
		this.defense = defense;
		this.specialAttack = specialAttack;
		this.specialdefense = specialdefense;
		this.speed = speed;
	}
	
	//Constructor vacio
	
	public Pokemon() {
		super();
	}

	
	//Getters y Setters
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAtack() {
		return atack;
	}

	public void setAtack(int atack) {
		this.atack = atack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getSpecialAttack() {
		return specialAttack;
	}

	public void setSpecialAttack(int specialAttack) {
		this.specialAttack = specialAttack;
	}

	public int getSpecialdefense() {
		return specialdefense;
	}

	public void setSpecialdefense(int specialdefense) {
		this.specialdefense = specialdefense;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return name + ";" + life + ";" + atack + ";" + defense + ";" + specialAttack + ";" + specialdefense + ";" + speed;
	}

	//Sobreescribir el método toString para que devuelva el nombre del pokemon, su nivel, vida, ataque y defensa.

	public String toStringBean() {
		return name + ";" + life + ";" + atack + ";" + defense;
	}

	
	
	
	
}
