package com.arenagame.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.arena.entities.Arena;
import com.arena.entities.Player;

public class ArenaTest {

	@Test
	public void testStartMatchForPlayer2() {
		
		Player player1 = new Player(50,0,0);
		Player player2 = new Player(100,10,5);
		
		Arena arena = new Arena(player1,player2);
		
		arena.startMatch();
		
		assertTrue(player2.isAlive());
		
		

	}
	
	@Test
	public void testStartMatchForPlayer1() {
		
		Player player1 = new Player(50,5,10);
		Player player2 = new Player(100,0,0);
		
		Arena arena = new Arena(player1,player2);
		
		arena.startMatch();
		
		assertTrue(player1.isAlive());
		
	}

	
}
