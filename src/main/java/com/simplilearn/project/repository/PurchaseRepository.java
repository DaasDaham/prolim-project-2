package com.simplilearn.project.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.project.model.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {

	public List<Purchase> findByDateAndShoeObject_Category(Date theDate, String theShoeCategory);
	
	public List<Purchase> findByUserId(long theUserId);
	
	public List<Purchase> findAll();

}
