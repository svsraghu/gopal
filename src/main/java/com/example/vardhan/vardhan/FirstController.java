package com.example.vardhan.vardhan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("/raghu")
	public String hello() {
		return "HELLO GOPA GARU AGAIN  modified";
	}

}
