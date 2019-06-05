package com.revature.objects;

public class RapArtist extends Artist{
	
	
	String genre = "Rap";
	
	@Override
	public String doMusic() {
		// TODO Auto-generated method stub
		return "This artist is rapping";
	}

	
	@Override//annotations
	public String getGenre() {
		return this.genre;
	}
	//this is an example of overloading methods
	public String buyChains(int chains) {
		return "You bought this many chains:" + chains;
	}
	//same name but different params and types so the are sufficiently distinct
	public String buyChains(int chains, String type) {
		return "You bought this many chains: " + chains + " of these types: " + type;
	}
	
}
