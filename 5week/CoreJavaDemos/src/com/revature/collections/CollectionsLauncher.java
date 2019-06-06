package com.revature.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food pizza = new Food(600, "pizza", 8.7);
		Food popcorn = new Food(0, "popcorn", 9.0);
		Food fishHeads = new Food(200, "Fish Heads", .3);
		Food spicyIceCream = new Food(600, "Spicy Ice Cream", 6.1);
		Food coleslawIceCream = new Food(0, "Coleslaw Ice Cream", -1000);
		
		List<Food> javaReactFoods = new ArrayList<Food>();
		javaReactFoods.add(pizza);
		javaReactFoods.add(popcorn);
		javaReactFoods.add(fishHeads);
		javaReactFoods.add(spicyIceCream);
		javaReactFoods.add(coleslawIceCream);
		System.out.println(javaReactFoods);
		for(Food f : javaReactFoods) {
			System.out.println(f);
		}
		javaReactFoods.forEach((food)->{
			System.out.println(food);
		});
		
		Set<Food> foodSet = new HashSet<Food>(javaReactFoods);
		foodSet.addAll(javaReactFoods);
		System.out.println(foodSet);
		List<Food> secondAL = new ArrayList<>(javaReactFoods);
		System.out.println(secondAL);
		
		Map<Integer, Food> foodMap = new TreeMap<Integer, Food>();
		
		foodMap.put(1, pizza);
		foodMap.put(2, popcorn);
		foodMap.put(5, fishHeads);
		foodMap.put(4, spicyIceCream);
		foodMap.put(3, coleslawIceCream);
		
		System.out.println(foodMap);
		
		Set<Food> foodTreeSet = new TreeSet<>(javaReactFoods);
		System.out.println(foodTreeSet);
		
		//we made a new comparator to compare in the non default way
		Comparator<Food> nameComp = new FoodNameComparator();
		javaReactFoods.sort(nameComp);//passed it as a param to sort for it to use to compar foods
		
		System.out.println(javaReactFoods);
		
		javaReactFoods.sort((f1, f2)->{
			return f1.cals - f2.cals;
		});
		
		System.out.println(javaReactFoods);
		
		
		
	}

}
