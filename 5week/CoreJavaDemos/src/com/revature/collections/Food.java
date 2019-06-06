package com.revature.collections;

public class Food implements Comparable<Food>{
	
	int cals;
	
	String name;
	
	double rating;

	public int getCals() {
		return cals;
	}

	public void setCals(int cals) {
		this.cals = cals;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Food(int cals, String name, double rating) {
		super();
		this.cals = cals;
		this.name = name;
		this.rating = rating;
	}

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cals;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(rating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Food other = (Food) obj;
		if (cals != other.cals)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(rating) != Double.doubleToLongBits(other.rating))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Food [cals=" + cals + ", name=" + name + ", rating=" + rating + "]";
	}

	@Override
	public int compareTo(Food o) {
		// TODO Auto-generated method stub
		if(this.rating > o.rating) {
			return -1;
		} else if (this.rating < o.rating) {
			return 1;
		}else {
			return 0;
		}
		
	}
	
	

}
