package com.purchasecardservice;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.test.annotation.Rollback;

import com.purchasecardservice.dao.PurchaseCardDAO;
import com.purchasecardservice.entity.PurchaseCard;

@SpringBootTest
class PurchaseCardServiceApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private PurchaseCardDAO purchaseCardDAO;
	@Test
	public void addpurchaseCard() throws Exception {
		new PurchaseCard("yogesh",(float)170.0,"online",1);
		Assertions.assertThat(purchaseCardDAO.findById(1).get());
	}
	@Test
	public void getpurchaseCard(){
		PurchaseCard purchaseCard = purchaseCardDAO.findById(1).get();
		Assertions.assertThat(purchaseCard.getPurchaseId()).isEqualTo(1);
	}
	@Test
	@Rollback(value = false)
	public void updatepurchaseCard(){
		PurchaseCard purchaseCard = purchaseCardDAO.findById(1).get();
		purchaseCard.setCustomerName("yogesh");
		PurchaseCard purchaseCardUpdated =purchaseCardDAO.save(purchaseCard);
		Assertions.assertThat(purchaseCardUpdated.getCustomerName()).isEqualTo("yogesh");
	}
	@Test
	@Order(5)
	@Rollback(value = false)
	public void deleteEmployeeTest(){
		PurchaseCard purchaseCard= purchaseCardDAO.findById(1).get();
		//purchaseCardDAO.delete(purchaseCard);
		PurchaseCard purchaseCard1 = null;
		Optional<PurchaseCard> optionalPurchaseCard = purchaseCardDAO.findById(1);
		if(optionalPurchaseCard.isPresent()){
			purchaseCard1 = optionalPurchaseCard.get();
			}
		//Assertions.assertThat(purchaseCard1).isNull();
	}
}
