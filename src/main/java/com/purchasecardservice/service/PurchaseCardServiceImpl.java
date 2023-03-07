package com.purchasecardservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.purchasecardservice.dao.PurchaseCardDAO;
import com.purchasecardservice.entity.PurchaseCard;
import com.purchasecardservice.exceptions.PurchaseCardNotFoundException;

@Service
public class PurchaseCardServiceImpl implements PurchaseCardService {
	
	@Autowired
	private PurchaseCardDAO purchaseCardDao;
	
	@Override
	public PurchaseCard addPurchaseCard(PurchaseCard purchaseCard) throws PurchaseCardNotFoundException {
		purchaseCardDao.save(purchaseCard);
		return purchaseCard;
		
	}

	@Override
	public PurchaseCard updatePurchaseCard(PurchaseCard purchaseCard) throws PurchaseCardNotFoundException {
		purchaseCardDao.save(purchaseCard);
		return purchaseCard;
	}

	@Override
	public PurchaseCard getpaymentById(Integer purchaseId) throws PurchaseCardNotFoundException {
		PurchaseCard pc;
		if(purchaseCardDao.findById(purchaseId).isEmpty()) {
		 throw new PurchaseCardNotFoundException();
		}
			 else {
				 pc=purchaseCardDao.findById(purchaseId).get();	 
			 }
			 return pc;
	}

	@Override
	public void deletepurchaseById(Integer purchaseId) throws PurchaseCardNotFoundException {
		@SuppressWarnings("deprecation")
		PurchaseCard pc=purchaseCardDao.getById(purchaseId);
		purchaseCardDao.delete(pc);	
		
	}

	@Override
	public List<PurchaseCard> getAllPurchaseCard() {
		return purchaseCardDao.findAll();
	}

}
