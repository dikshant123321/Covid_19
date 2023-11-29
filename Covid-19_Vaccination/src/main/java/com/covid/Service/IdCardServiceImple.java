package com.covid.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.covid.Repository.IdCardRepository;
import com.covid.model.IdCard;

public class IdCardServiceImple implements IdCardService{

	@Autowired
	 public IdCardRepository idRepository;
	
	@Override
	public IdCard addIdCard(IdCard idCard) {
		
		return idRepository.save(idCard);
		
	}

	
}
