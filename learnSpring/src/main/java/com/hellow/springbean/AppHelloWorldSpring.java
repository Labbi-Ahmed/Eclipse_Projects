package com.hellow.springbean;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {

	public static void main(String[] args) {
		 
		// 1: Launch a spring context
		
		// 2: configure the things that we want spring to manage - @Configuration
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			// 3: Retrieving Beans managed by spring
			System.out.println(context.getBean("age"));

			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person3Parameters"));
			System.out.println(context.getBean("myAddress"));
			System.out.println(context.getBean(Address.class));
			//System.out.println();
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
