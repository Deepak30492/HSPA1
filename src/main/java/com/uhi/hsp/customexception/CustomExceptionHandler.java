package com.uhi.hsp.customexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.uhi.hsp.dto.Ack;
import com.uhi.hsp.dto.Ack.StatusEnum;
import com.uhi.hsp.dto.AckResponse;

@ControllerAdvice
public class CustomExceptionHandler {
	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<Error> recordNotFound(RecordNotFoundException exception,WebRequest request){
		AckResponse ack=new AckResponse();
		Ack a=new Ack();
		StatusEnum st = null;
		Error error=new Error(HttpStatus.NOT_FOUND.toString());
		
		a.setStatus(st.NACK);
	//	a.status(st.NACK);
		ack.setError(error);
		
		//ack.setMessage(st.fromValue(""));
		
		return new ResponseEntity<Error>(error,org.springframework.http.HttpStatus.NOT_FOUND);	
	}

}
