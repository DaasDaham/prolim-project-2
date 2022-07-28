package com.simplilearn.project.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)

public class PurchaseNotFoundException extends RuntimeException {
	 public PurchaseNotFoundException(String description) {
		 super(description);
	 }
}
