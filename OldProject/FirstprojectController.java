package com.Home.OldProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Home.OldProject.models.StudentDetails;

@RestController

public class FirstprojectController {
	@Autowired

	private OldDetailsRepository detailsRepository;

	@PostMapping("/test")
	public StudentDetails addDetails(@RequestBody StudentDetails sd) {
		detailsRepository.save(sd);
		return sd;
		
	}
	@GetMapping("/result")
	public String Sample1() {
		return "Testing Completed, Your Applicartion is running";
	}
	
}