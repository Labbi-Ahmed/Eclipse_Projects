package com.spring.learnSpring;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.learnSpring.game.GameRunner;

@Configuration
@ComponentScan("com.spring.learnSpring.game")
public class GammingAppLuncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GammingAppLuncherApplication.class)) {

			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
}
