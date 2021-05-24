package com.principal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.principal.service.ApiService;

@RestController
public class ApiController {

	@Autowired
	ApiService apiService;
	
	@GetMapping("/getApi/{url}")
	public ResponseEntity<Object> returnResponse(@PathVariable String url) {
		return apiService.callApi(url);
	}
}
