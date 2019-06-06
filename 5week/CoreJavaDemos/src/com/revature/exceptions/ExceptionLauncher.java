package com.revature.exceptions;

public class ExceptionLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaFactory lilCeasers = new PizzaFactory(10, "Hawaiian", "Lil ' Ceaser's");
		PizzaFactory dominos = new PizzaFactory(20, "12 Cheese", "Domino's");
		Batch javaReact1905 = new Batch();
		int hungerlevel = 35;
		while(hungerlevel > 0) {
			try {
				System.out.println(javaReact1905.eatDinner(lilCeasers, 5));
				hungerlevel-=5;
			} catch (NoMorePizzaException e) {
				try {
					System.out.println(javaReact1905.eatDinner(dominos, 5));
					hungerlevel-=5;
				} catch (NoMorePizzaException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					break;
				}
			}
		}

	}

}
