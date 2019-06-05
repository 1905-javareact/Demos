package com.revature.objects;

public class ObjectLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RapArtist drDre = new RapArtist();//this is also an example of polymorphism
		Artist weirdAl = new Artist();
		
		System.out.println(weirdAl.doMusic());//singing
		System.out.println(drDre.doMusic());
		
		System.out.println(weirdAl.getGenre());
		System.out.println(drDre.getGenre());
		
		System.out.println(drDre.buyChains(5));
		System.out.println(drDre.buyChains(5, "gold"));
		
		User u = new User();
		
//		System.out.println(drDre);//address of the drDre object in the heap
//		System.out.println("name = " + drDre.name + " artistId = " + drDre.artistId + " genre = " + drDre.genre + " numberOfMembers = " + drDre.numberOfMembers);

	}

}
