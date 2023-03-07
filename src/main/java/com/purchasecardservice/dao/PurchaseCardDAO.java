package com.purchasecardservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.purchasecardservice.entity.PurchaseCard;

public interface PurchaseCardDAO extends JpaRepository<PurchaseCard, Integer>{

}
