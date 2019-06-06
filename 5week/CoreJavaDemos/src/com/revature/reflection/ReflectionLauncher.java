package com.revature.reflection;

import java.lang.reflect.Field;

import com.revature.exceptions.PizzaFactory;

public class ReflectionLauncher {

	public static void main(String[] args) {
		PizzaFactory dominos = new PizzaFactory(20, "12 Cheese", "Domino's");
		
		System.out.println(dominos.getName());
		
		Class<PizzaFactory> pfClass = PizzaFactory.class;
		
		for(Field f : pfClass.getDeclaredFields()) {
			System.out.println(f);
		}
		Field domName;
		try {
			domName = pfClass.getDeclaredField("name");
			domName.setAccessible(true);
			domName.set(dominos, "Domino's sucks, lil ceasers rulez");
			System.out.println(dominos.getName());
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
