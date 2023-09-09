package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.InsertPersonReq;
import com.example.service.PersonService;
//i dont nknojkjdslkfjlkdsjf
@RestController
public class PersonController {
	@Autowired
	PersonService personService;
	
	@PostMapping("/insertOrUpdatePersonDetails")
	public Boolean insertOrUpdatePersonDetails(@RequestBody InsertPersonReq insertPersonsReq) {
		return personService.insertOrUpdatePersonDetails(insertPersonsReq);
	}
}
