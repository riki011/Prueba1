package com.principal.service;

import org.springframework.http.ResponseEntity;

public interface ApiService {

	ResponseEntity<Object> callApi(String url);
}
