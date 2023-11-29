package com.covid.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.covid.model.IdCard;

public interface IdCardRepository extends JpaRepository<IdCard, Integer>{

	 @Query("SELECT idCard FROM IdCard idCard WHERE idCard.panCard.panNumber = :panNumber")
	 IdCard findByPanCard(String panNumber);
	 
	 @Query("SELECT idCard FROM IdCard idcard WHERE idcard.aadharCard.aadharNumber=:aadharCard")
	 IdCard findByAdharCardNumber(Long aadharNumber);
}

