package com.revature.abstracts;

public abstract class Car {
	
	private int numberOfWheels;
	
	private int topSpeed;
	
	private String make;
	
	private String model;

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Car(int numberOfWheels, int topSpeed, String make, String model) {
		super();
		this.numberOfWheels = numberOfWheels;
		this.topSpeed = topSpeed;
		this.make = make;
		this.model = model;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + numberOfWheels;
		result = prime * result + topSpeed;
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
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (numberOfWheels != other.numberOfWheels)
			return false;
		if (topSpeed != other.topSpeed)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [numberOfWheels=" + numberOfWheels + ", topSpeed=" + topSpeed + ", make=" + make + ", model="
				+ model + "]";
	}
	
	//all non abstract children must define this method
	public abstract String drive(String transmission);
	

}
