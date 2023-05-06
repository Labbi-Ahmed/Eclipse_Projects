package com.spring.learnSpring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameComponent")
public class SuperContraGame implements GameInterface{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("super Contra game : up");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("super Contra game : left");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("super Contra game : right");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("super Contra game : down");
	}

	
}
