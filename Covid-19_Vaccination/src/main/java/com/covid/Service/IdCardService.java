package com.covid.Service;

import org.springframework.stereotype.Service;

import com.covid.model.IdCard;

public interface IdCardService {
	    IdCard addIdCard(IdCard idCard);
	    IdCard findByPanNumber(String panNumber);
}
