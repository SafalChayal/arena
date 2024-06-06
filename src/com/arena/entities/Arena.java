package com.arena.entities;


public class Arena {
	private Player player1;
	private Player player2;
	
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
	
	
	
	
	public void startMatch() {
		
		Player attackingPlayer = this.getPlayer1().getHealth() < this.getPlayer2().getHealth() ? this.getPlayer1():this.getPlayer2();
		Player defendingPlayer = attackingPlayer== this.getPlayer1() ? this.getPlayer2() : this.getPlayer1();
	
		
		while(this.getPlayer1().isAlive() && this.getPlayer2().isAlive()) {
			
			int attackingPlayerDice = attackingPlayer.attactPlayer();
			int defendingPlayerDice = defendingPlayer.defendPlayer();
			
			int damage = attackingPlayerDice*attackingPlayer.getAttack() - defendingPlayerDice*defendingPlayer.getStrength();
			
			if(damage > 0) {
				defendingPlayer.afterAttack(damage);
			}
			
			Player tempPlayer = defendingPlayer;
			defendingPlayer = attackingPlayer;
			attackingPlayer = tempPlayer;
			
		}
		
	}
	
	public void result() {
		if(this.getPlayer1().isAlive()) {
			System.out.println("Yayyy,  Player1 has won the fight !!!!!!!");
		}
		else {
			System.out.println("Yayyy,  Player2 has won the fight !!!!!!!");

		}
	}
}
