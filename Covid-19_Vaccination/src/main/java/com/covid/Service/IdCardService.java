package com.covid.Service;

import com.covid.model.IdCard;

public interface IdCardService {
	    IdCard addIdCard(IdCard idCard);
	    IdCard findByPanNumber(String panNumber);
	    IdCard findByAadharCardNumber(Long aadharCard);
}
