package com.simplilearn.project.service;

import java.util.Date;
import java.util.List;

import com.simplilearn.project.model.Purchase;

public interface PurchaseService {

	public List<Purchase> findByDateAndShoeObject_Category(Date theDate, String theShoeCategory);
	
	public List<Purchase> findByUserId(long theUserId);
	
	public List<Purchase> findAll();
	
}
