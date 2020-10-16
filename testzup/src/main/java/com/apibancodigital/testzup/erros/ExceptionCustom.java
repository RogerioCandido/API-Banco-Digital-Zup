package com.apibancodigital.testzup.erros;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.NO_CONTENT)
public class ExceptionCustom extends RuntimeException{

	public ExceptionCustom(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
