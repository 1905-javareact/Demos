package com.revature.objects;

public class Artist {
	String name;//null
	
	int artistId;//0
	
	int numberOfMembers;//0
	
	String genre = "Anything Under the Sun";//null
	
	//overloading
	public Artist() {
		super();
	};
	
	//overloading
	public Artist(String name, int artistId, int numberOfMembers, String genre) {
		this.name = name;
		this.artistId = artistId;
		this.numberOfMembers = numberOfMembers;
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Artist [name=" + name + ", artistId=" + artistId + ", numberOfMembers=" + numberOfMembers + ", genre="
				+ genre + "]";
	}
	
	public String doMusic() {
		return "This Artist is singing";
	}
	
	public String getGenre() {
		return this.genre;
	}

}
