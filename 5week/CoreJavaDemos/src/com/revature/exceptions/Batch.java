package com.revature.exceptions;

public class Batch {
	
	public String eatDinner(PizzaFactory pf, int hungerLevel) throws NoMorePizzaException {
		return "1905JavaReact, " + pf.getPizza(hungerLevel);
		
	}

}
