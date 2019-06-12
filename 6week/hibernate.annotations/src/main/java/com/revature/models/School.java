package com.revature.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "school")
public class School {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "school_id")
	private int schoolId;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "school_student", 
	joinColumns = @JoinColumn(name = "school_id"), 
	inverseJoinColumns = @JoinColumn(name = "student_id"))
	private Set<Student> students;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "education_level_id")
	private EducationLevel level;
	
	private String address;
	
	private String name;
	
	
	private int fun;


	public int getSchoolId() {
		return schoolId;
	}


	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}


	public Set<Student> getStudents() {
		return students;
	}


	public void setStudents(Set<Student> students) {
		this.students = students;
	}


	public EducationLevel getLevel() {
		return level;
	}


	public void setLevel(EducationLevel level) {
		this.level = level;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getFun() {
		return fun;
	}


	public void setFun(int fun) {
		this.fun = fun;
	}


	public School() {
		super();
		// TODO Auto-generated constructor stub
	}


	public School(int schoolId, Set<Student> students, EducationLevel level, String address, String name, int fun) {
		super();
		this.schoolId = schoolId;
		this.students = students;
		this.level = level;
		this.address = address;
		this.name = name;
		this.fun = fun;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + fun;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + schoolId;
		result = prime * result + ((students == null) ? 0 : students.hashCode());
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
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (fun != other.fun)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schoolId != other.schoolId)
			return false;
		if (students == null) {
			if (other.students != null)
				return false;
		} else if (!students.equals(other.students))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "School [schoolId=" + schoolId + ", students=" + students + ", level=" + level + ", address=" + address
				+ ", name=" + name + ", fun=" + fun + "]";
	}


	
	
	
}
