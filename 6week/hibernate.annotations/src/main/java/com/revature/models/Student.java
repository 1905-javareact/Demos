package com.revature.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private int studentId;
	
	private String name;
	
	@ManyToMany
	@JoinTable(name = "school_student", 
	joinColumns = @JoinColumn(name = "student_id"), 
	inverseJoinColumns = @JoinColumn(name = "school_id"))
	private Set<School> schoolsAttended;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<School> getSchoolsAttended() {
		return schoolsAttended;
	}

	public void setSchoolsAttended(Set<School> schoolsAttended) {
		this.schoolsAttended = schoolsAttended;
	}

	public Student(int studentId, String name, Set<School> schoolsAttended) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.schoolsAttended = schoolsAttended;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((schoolsAttended == null) ? 0 : schoolsAttended.hashCode());
		result = prime * result + studentId;
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
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schoolsAttended == null) {
			if (other.schoolsAttended != null)
				return false;
		} else if (!schoolsAttended.equals(other.schoolsAttended))
			return false;
		if (studentId != other.studentId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", schoolsAttended=" + schoolsAttended + "]";
	}
	
	
	
	

}
