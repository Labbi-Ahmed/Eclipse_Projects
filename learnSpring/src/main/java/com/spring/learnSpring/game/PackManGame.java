package com.spring.learnSpring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PackManGame implements GameInterface {

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("pack man game : up");
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("pack man game : left");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("pack man game : right");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("pack man game : down");
	}
	
}
