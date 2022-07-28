package com.simplilearn.project.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.project.errors.PurchaseNotFoundException;
import com.simplilearn.project.model.Purchase;
import com.simplilearn.project.service.PurchaseService;

@RestController
public class PurchaseResource {
	@Autowired
	private PurchaseService purchaseService;

	@GetMapping(path = "/saadsportyshoes/purchase_api/{purchaseDate}/{category}")
	public List<Purchase> getPurchaseRepositoryByDateAndCategory(@PathVariable String purchaseDate, @PathVariable String category)
			throws ParseException {
				
		List<Purchase> purchases= this.purchaseService.findByDateAndShoeObject_Category(
				(Date) new SimpleDateFormat("yyyy-MM-dd").parse(purchaseDate), category);

		if (purchases.size() <= 0) {
			throw new PurchaseNotFoundException("Purchase with the following details is not found - Shoe Category, Date of Purchase: " + category + " , " + purchaseDate);

		}
		return purchases;
	}
	
	@GetMapping(path = "/saadsportyshoes/purchase_api/{userId}")
	public List<Purchase> getAllPurchaseByUserId(@PathVariable long userId)
			throws ParseException {
				
		List<Purchase> purchases= this.purchaseService.findByUserId(userId);

		if (purchases.size() <= 0) {
			throw new PurchaseNotFoundException("Purchase with the following details is not found - UserId: " + userId);

		}
		return purchases;
	}
	
	@GetMapping(path = "/saadsportyshoes/purchase_api")
	public List<Purchase> getAllPurchases()
			throws ParseException {
				
		List<Purchase> purchases= this.purchaseService.findAll();

		if (purchases.size() <= 0) {
			throw new PurchaseNotFoundException("Purchase with the following details is not found - AllPurchases");

		}
		return purchases;
	}
	
	

}
