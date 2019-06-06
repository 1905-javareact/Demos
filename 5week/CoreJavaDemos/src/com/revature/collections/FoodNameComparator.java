package com.revature.collections;

import java.util.Comparator;

public class FoodNameComparator implements Comparator<Food>{

	@Override
	public int compare(Food o1, Food o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
