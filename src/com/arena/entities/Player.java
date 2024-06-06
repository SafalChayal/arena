package com.arena.entities;

import java.util.Random;

public class Player {
	
	private int health;
	private int attack;
	private int strength;
	private Random dice;
	
	
	public Player(int health, int attack, int strength) {
		this.health = health;
		this.attack = attack;
		this.strength = strength;
		this.dice = new Random();
	}
	
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	
	
	public int attactPlayer() {
		return dice.nextInt(6)+1;
	}
	
	public int defendPlayer() {
		return dice.nextInt(6)+1;
	}
	
	
	public void afterAttack(int damage) {
		this.setHealth(this.getHealth() -  damage);
	}
	
	public boolean isAlive() {
		return this.getHealth()>0;
	}
	
}
