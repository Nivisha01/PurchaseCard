package com.purchasecardservice.service;

import java.util.List;

import com.purchasecardservice.entity.PurchaseCard;
import com.purchasecardservice.exceptions.PurchaseCardNotFoundException;

public interface PurchaseCardService {

	public PurchaseCard addPurchaseCard(PurchaseCard purchaseCard) throws PurchaseCardNotFoundException;
	public PurchaseCard updatePurchaseCard(PurchaseCard purchaseCard) throws PurchaseCardNotFoundException;
	public PurchaseCard getpaymentById(Integer purchaseId) throws PurchaseCardNotFoundException;
	public void deletepurchaseById(Integer purchaseId) throws PurchaseCardNotFoundException;
	public List<PurchaseCard> getAllPurchaseCard();
}
