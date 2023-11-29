package com.covid.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.Repository.IdCardRepository;
import com.covid.model.IdCard;
@Service
public class IdCardServiceImple implements IdCardService{

	@Autowired
	 public IdCardRepository idRepository;
	
	@Override
	public IdCard addIdCard(IdCard idCard) {
		
		return idRepository.save(idCard);
		
	}

	@Override
	public IdCard findByPanNumber(String panNumber) {
		 IdCard idcards= idRepository.findByPanCard(panNumber);
		return idcards;
	}

	
}
