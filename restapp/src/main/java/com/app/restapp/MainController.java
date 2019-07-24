package com.app.restapp;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
//	@GetMapping("/welcome")
//	@ResponseBody
//	public String sayWelcome() {
//		return "welcome to my rest api";
//	}
	HashMap<String,String> hm= new HashMap<>();
	
//	@GetMapping("/login")
//	@ResponseBody
//	public String login() {
//		return "welcome to login";
//	}
	
	@GetMapping("login")
	//@ResponseBody
	public String login() {
		return "login";
	}
	
	@PostMapping("/loginValid")
	@ResponseBody
	public String loginValid(@RequestParam("uname") String name, @RequestParam("pwd") String password) {
		if(name.equals(hm.get(name))&& password.equals(hm.get(password)))
		{
			return "success";
		}
		else
			return "fails";
	}

	@GetMapping("/register")
	public String register() {
		return "resgister";
	}
	@PostMapping("/registerValid")
	public String registerValid(@RequestParam("uname") String x, @RequestParam("pwd") String y) {
		hm.put(x, y);
		
		return "login";
	}
	

}
