package com.sai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/home")
	public String home()
	{
		return ("WelCome To Spring Security Application");
	}
	@GetMapping("/balance")
	public String balance()
	{
		String str="My Account Balance is 9000.00 $";
		return str;
	}
	@GetMapping("/statement")
	public String statement()
	{
		String str="Statement generated sent to your mail id";
		return str;
	}
	@GetMapping("/loan")
	public String loan()
	{
		String str="Your loan Amout is 8000.99 $";
		return str;
	}
	@GetMapping("/contact")
	public String contact()
	{
		String str="Thank you contacting customer care support: we will get back to you";
		return str;
	}
}
