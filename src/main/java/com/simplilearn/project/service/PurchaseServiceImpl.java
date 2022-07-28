package com.simplilearn.project.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.project.model.Purchase;
import com.simplilearn.project.repository.PurchaseRepository;

@Service(value = "purchaseReportService")
public class PurchaseServiceImpl implements PurchaseService {

	@Autowired
	private PurchaseRepository purchaseRepository;

	public PurchaseServiceImpl() {
		super();
	}

	public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
		super();
		this.purchaseRepository = purchaseRepository;
	}

	@Override
	public List<Purchase> findByDateAndShoeObject_Category(Date theDate, String theShoeCategory){
		return this.purchaseRepository.findByDateAndShoeObject_Category(theDate, theShoeCategory);
	}

	@Override
	public List<Purchase> findByUserId(long theUserId) {
		return this.purchaseRepository.findByUserId(theUserId);
	}

	@Override
	public List<Purchase> findAll() {
		return this.purchaseRepository.findAll();
	}

}
