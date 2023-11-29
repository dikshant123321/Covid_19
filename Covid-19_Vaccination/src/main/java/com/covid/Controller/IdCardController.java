package com.covid.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.covid.Service.IdCardService;
import com.covid.model.IdCard;

@RestController
public class IdCardController {

	@Autowired
	public IdCardService idCardService;
	
	@PostMapping("/addIdCard")
	public ResponseEntity<IdCard> addIdCard(@RequestBody IdCard idCard)
	{
		       IdCard idcard= idCardService.addIdCard(idCard);
		       return new ResponseEntity<>(idcard,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getIdCardByPanNumber/{panNumber}")
	public ResponseEntity<IdCard> getIdCardByPanNumber(@PathVariable("panNumber") String panNumber)
	{
		    IdCard idcard=  idCardService.findByPanNumber(panNumber);
		    return new ResponseEntity<IdCard>(idcard,HttpStatus.ACCEPTED);
	}
	
	
}
