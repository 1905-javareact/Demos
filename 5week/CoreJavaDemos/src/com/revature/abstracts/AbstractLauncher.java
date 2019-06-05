package com.revature.abstracts;

import com.revature.objects.Artist;
import com.revature.objects.RapArtist;

public class AbstractLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Artist drDre = new RapArtist();
		drDre.setName("Dr. Dre");
		System.out.println(drDre.sell(drDre.getName()));
		
		Artist drDreClone = (Artist) drDre.clone();
		System.out.println(drDreClone.getName());
	}

}
