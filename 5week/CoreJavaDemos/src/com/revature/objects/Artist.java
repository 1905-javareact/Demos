package com.revature.objects;

import com.revature.abstracts.Sellable;

public class Artist  implements Sellable, Cloneable{
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
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
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

	@Override
	public String sell(String name) {
		
		return "Artist " + name + " is selling records" ;
	}

}
