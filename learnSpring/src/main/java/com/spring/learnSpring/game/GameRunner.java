package com.spring.learnSpring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	private GameInterface game;
	
	
	public GameRunner(@Qualifier("Mario") GameInterface game) {
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run game : "+game.getClass());
		game.up();
		game.down();
		game.right();
		game.left();
	}
}
