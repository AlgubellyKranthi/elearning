package com.example.demo.queryparams;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseQueryParams{
	@GetMapping("/Courseparams")
	ResponseEntity<String> getCourseDeatils(@RequestParam("cname") String cname,@RequestParam("ctrainer") String ctrainer) {
		String coursePayload = cname+" "+ "By" +" "+ ctrainer +" "+ "and Course fee is 7000";
		return new ResponseEntity(coursePayload, HttpStatus.OK);
	}

}
