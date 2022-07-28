package com.simplilearn.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.project.model.Shoe;

public interface ShoeRepository extends JpaRepository<Shoe, Long> {

	public Shoe deleteById(long theId);

	public Shoe save(Shoe theShoe);
	
	public Shoe findById(long theId);
	
	public List<Shoe> findAll();
	
	public List<Shoe> findByColor(String theColor);
	
	public List<Shoe> findByCategory(String theCategory);
	
	public List<Shoe> findBySize(Integer theSize);
	
	public List<Shoe> findByPrice(Double price);


}
