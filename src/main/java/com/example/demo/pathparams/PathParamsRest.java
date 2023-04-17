package com.example.demo.pathparams;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathParamsRest {
	
	@GetMapping("course/{cname}/{cauthor}")
	ResponseEntity<String> getCourseDetails(@PathVariable("cname") String cname,@PathVariable("cauthor") String cauthor){
		String respBody=cname+" "+ "by" +" "+ cauthor +" "+"and price is 8,000";
		return new ResponseEntity<>(respBody,HttpStatus.OK);
	}
	

}
