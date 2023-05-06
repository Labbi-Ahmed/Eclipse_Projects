package com.spring.learnSpring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Mario")
public class MarioGame implements GameInterface {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("up");
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("left");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("right");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("down");
	}
	
}
