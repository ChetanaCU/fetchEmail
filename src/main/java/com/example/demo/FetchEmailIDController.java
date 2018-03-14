package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FetchEmailIDController {

	@Autowired
	EmailRepository emailRepository;
	@RequestMapping(value="/")  
	public String fetchEmail()
	{
		return "FetchEmail.html";
	} 
	@RequestMapping(value="/saveEmail")  
	public String saveEmail(@RequestParam(value = "userEmail") String emailID)
	{
		try{
			EmailID id = new EmailID(emailID);
			emailRepository.save(id);
			return "SuccessPage.html";
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return "Error in storing the mail id in database";
		}
	} 
}
