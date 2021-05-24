package com.principal.serviceImp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.principal.service.ApiService;

@Service
public class ApiServiceImp implements ApiService{

	@Override
	public ResponseEntity<Object> callApi(String url) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Object> response = null;
		try {
			
			
			response = restTemplate.getForEntity(url , Object.class);
			
		} catch (Exception e) {
			return new ResponseEntity<>("Error", HttpStatus.BAD_REQUEST);
		}
		
		
		return response;
	}
	
	

}
