package com.arena.entities;

import java.util.ArrayList;
import java.util.List;

public class Arena {
	private Player player1;
	private Player player2;
	private Player attacker;
	private Player defender;
	
	public Arena(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	public Player getPlayer1() {
		return player1;
	}
	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}
	public Player getPlayer2() {
		return player2;
	}
	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
	
	
	
	public Player getAttacker() {
		return attacker;
	}
	
	public Player getDefender() {
		return defender;
	}
	
	public void decideAttackerAndDefender(Player player1, Player player2) {
		 this.attacker = player1.getHealth() < player2.getHealth() ? player1:player2;
		 this.defender = attacker == player1 ? player2 : player1;
		}
	
	
	public void startMatch() {
		decideAttackerAndDefender(this.getPlayer1(),this.getPlayer2());
		
		Player attackingPlayer = this.getAttacker();
		Player defendingPlayer = this.getDefender();
		
		while(attackingPlayer.isGameOn() && defendingPlayer.isGameOn()) {
			
			int attackingPlayerDice = attackingPlayer.attactPlayer();
			int defendingPlayerDice = defendingPlayer.defendPlayer();
			
			
		}
		
	}
}
