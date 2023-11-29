package com.covid.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.covid.model.IdCard;

public interface IdCardRepository extends JpaRepository<IdCard, Integer>{

	 @Query("SELECT idCard FROM IdCard idCard WHERE idCard.panCard.panNumber = :panNumber")
	 IdCard findByPanCard(String panNumber);
}

//@Embedded
//private  PanCard pancard;
//@Embedded
//private AadharCard aadharCard;