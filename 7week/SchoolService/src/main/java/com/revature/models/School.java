package com.revature.models;

public class School {

	private int schoolId;
	
	private String name;
	
	//in real application
	//the table would have an fk to a user in a different db
	private User principal;

	public int getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getPrincipal() {
		return principal;
	}

	public void setPrincipal(User principal) {
		this.principal = principal;
	}

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(int schoolId, String name, User principal) {
		super();
		this.schoolId = schoolId;
		this.name = name;
		this.principal = principal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((principal == null) ? 0 : principal.hashCode());
		result = prime * result + schoolId;
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
		School other = (School) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (principal == null) {
			if (other.principal != null)
				return false;
		} else if (!principal.equals(other.principal))
			return false;
		if (schoolId != other.schoolId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "School [schoolId=" + schoolId + ", name=" + name + ", principal=" + principal + "]";
	}
	
	
	
	
}
