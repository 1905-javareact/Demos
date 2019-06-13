package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.models.School;


public interface SchoolDao extends JpaRepository<School, Integer>{
	
	
	
	public List<School> findByName(String name);
	
	public List<School> findByLevelLevel(String level);
	
	public List<School> findByAddress(String address);
	
	@Query("FROM School WHERE fun > 5")
	public School thisIsACustomMethod();
	

}
