package com.covid.Controller;

import org.apache.coyote.http11.Http11InputBuffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.covid.Service.IdCardService;
import com.covid.model.IdCard;

@RestController
public class IdCardController {

	@Autowired
	public IdCardService idCardService;
	
	public ResponseEntity<IdCard> addIdCard(IdCard idCard)
	{
		       IdCard idcard= idCardService.addIdCard(idCard);
		       return new ResponseEntity<>(idcard,HttpStatus.ACCEPTED);
	}
	
	
}
