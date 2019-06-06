package com.revature.exceptions;

public class PizzaFactory {

	private int remainingPizzas = 10;
	
	private String kindOfPizza;
	
	private String name;

	public int getRemainingPizzas() {
		return remainingPizzas;
	}

	public void setRemainingPizzas(int remainingPizzas) {
		this.remainingPizzas = remainingPizzas;
	}

	public String getKindOfPizza() {
		return kindOfPizza;
	}

	public void setKindOfPizza(String kindOfPizza) {
		this.kindOfPizza = kindOfPizza;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PizzaFactory(int remainingPizzas, String kindOfPizza, String name) {
		super();
		this.remainingPizzas = remainingPizzas;
		this.kindOfPizza = kindOfPizza;
		this.name = name;
	}

	public PizzaFactory() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kindOfPizza == null) ? 0 : kindOfPizza.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + remainingPizzas;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PizzaFactory other = (PizzaFactory) obj;
		if (kindOfPizza == null) {
			if (other.kindOfPizza != null)
				return false;
		} else if (!kindOfPizza.equals(other.kindOfPizza))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (remainingPizzas != other.remainingPizzas)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PizzaFactory [remainingPizzas=" + remainingPizzas + ", kindOfPizza=" + kindOfPizza + ", name=" + name
				+ "]";
	}
	
	
	public String getPizza(int numberOfPizzas) throws NoMorePizzaException {
		if(numberOfPizzas > this.remainingPizzas) {
			throw new NoMorePizzaException();
		} else {
			this.remainingPizzas -= numberOfPizzas;
			return "You got " + numberOfPizzas + " pizzas from " + this.name;
		}
		
	}
	
	
}
