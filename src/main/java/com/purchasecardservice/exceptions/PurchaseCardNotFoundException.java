package com.purchasecardservice.exceptions;

public class PurchaseCardNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;

	public PurchaseCardNotFoundException() {}

	public PurchaseCardNotFoundException(String message) {
		super(message);
	}
}