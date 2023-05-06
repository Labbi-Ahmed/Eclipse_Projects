//package com.spring.learnSpring;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.spring.learnSpring.game.GameInterface;
//import com.spring.learnSpring.game.GameRunner;
//import com.spring.learnSpring.game.MarioGame;
//
//@Configuration
//public class App01Configuration {
//
//	@Bean
//	public GameInterface game() {
//		return new MarioGame();
//	}
//	
//	@Bean
//	public GameRunner gameRunner(GameInterface game) {
//		return new GameRunner(game);
//	}
//}
