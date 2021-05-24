package com.exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import com.principal.service.ApiService;
import com.principal.serviceImp.ApiServiceImp;

class ApiServiceTest {

	private ApiService apiService = new ApiServiceImp();
	
	@Test
	void testApiCallFail() {
		
		ResponseEntity<Object> response = apiService.callApi("https://api.mercadolibre.com/sitess");
		String expectedResponse = "Error";
		
		assertEquals(expectedResponse, response.getBody());
	}
	
	@Test
	void testApiCallOK() {
		
		ResponseEntity<Object> response = apiService.callApi("https://api.mercadolibre.com/sites");
		String unexpectedResponse = "Error";
		
		assertNotEquals(unexpectedResponse, response.getBody());
	}

}
