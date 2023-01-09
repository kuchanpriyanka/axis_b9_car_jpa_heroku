package com.example.carjpademo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice // global exception class,which handles all the exceptions
public class GlobalCarException {

	//Individual Exception Handlers
	@ExceptionHandler(value = CarNotFoundException.class)
	public ResponseEntity<String> carNotFoundExceptionHandler(CarNotFoundException ex){
		return new ResponseEntity<String>(ex.toString(),HttpStatus.NOT_FOUND);
	}
}
