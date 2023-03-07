package com.purchasecardservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.purchasecardservice.entity.PurchaseCard;
import com.purchasecardservice.exceptions.PurchaseCardNotFoundException;
import com.purchasecardservice.service.PurchaseCardService;

@RestController
	public class PurchaseCardController {
		@Autowired
		private PurchaseCardService purchaseCardService;

		@GetMapping("/purchaseCard")
		public List<PurchaseCard> getAllCustomer() {
			return this.purchaseCardService.getAllPurchaseCard();
		}

		@GetMapping("/purchaseCard/{paymentId}")
		public ResponseEntity<PurchaseCard> getId(@PathVariable("customerId") Integer paymentId)
				throws PurchaseCardNotFoundException {
			return new ResponseEntity<PurchaseCard>(purchaseCardService.getpaymentById(paymentId), HttpStatus.OK);
		}

		@PostMapping("/purchaseCard")
		public PurchaseCard addCustomer(@RequestBody PurchaseCard purchaseCard) throws PurchaseCardNotFoundException {
			return this.purchaseCardService.addPurchaseCard(purchaseCard);
		}

		@PutMapping("/purchaseCard")
		public PurchaseCard updateCustomer(@RequestBody PurchaseCard purchaseCard) throws PurchaseCardNotFoundException {
			return this.purchaseCardService.updatePurchaseCard(purchaseCard);
		}

		@DeleteMapping("/purchaseCard/{purchaseId}")
		public void deleteCustomer(@PathVariable("purchaseId") Integer purchaseId) throws PurchaseCardNotFoundException {
			this.purchaseCardService.deletepurchaseById(purchaseId);
		}
}

