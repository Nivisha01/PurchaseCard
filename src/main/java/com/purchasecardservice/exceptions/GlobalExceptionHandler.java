package com.purchasecardservice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = PurchaseCardNotFoundException.class)
	public ResponseEntity<String> purchaseCardNotFound(PurchaseCardNotFoundException e) {
		return new ResponseEntity<>("PurchaseCard Not Found", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = PurchaseCardAlreadyExistException.class)
	public ResponseEntity<String> purchaseCardAlreadyExists(PurchaseCardAlreadyExistException e) {
		return new ResponseEntity<>("PurchaseCard Already Exists", HttpStatus.FOUND);
	}

}
