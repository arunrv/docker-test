package com.docker.arun;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping(value="/hello")
	public ResponseEntity getmessage(){
		
		ResponseEntity rse=new ResponseEntity();
		rse.setMsg("Hello");
		rse.setName("Arun");
		return rse;
	}

}
