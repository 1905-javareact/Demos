package com.revature.models;

public class Artist {
	
	private String name;
	
	private int numberOfMembers;
	
	private int artistId;
	
	private String genre;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfMembers() {
		return numberOfMembers;
	}

	public void setNumberOfMembers(int numberOfMembers) {
		this.numberOfMembers = numberOfMembers;
	}

	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Artist(String name, int numberOfMembers, int artistId, String genre) {
		super();
		this.name = name;
		this.numberOfMembers = numberOfMembers;
		this.artistId = artistId;
		this.genre = genre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + artistId;
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfMembers;
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
		Artist other = (Artist) obj;
		if (artistId != other.artistId)
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfMembers != other.numberOfMembers)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Artist [name=" + name + ", numberOfMembers=" + numberOfMembers + ", artistId=" + artistId + ", genre="
				+ genre + "]";
	}
	
	

}
