package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.User;

@RestController
public class FirstController {
	@Autowired
	RestTemplate rt;
	@RequestMapping("/home")
	public ModelAndView meth1()
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("login.html");
		return mav;		
		
	}
	@RequestMapping("/register")
	public ModelAndView meth3()
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("register.html");
		return mav;		
		
	}
	@RequestMapping("/saveuser")
	public String meth2(User u1)
	{
		String res="fail";
		//System.out.println(u1.toString());
		res=rt.postForObject("http://localhost:8082/save", u1, String.class);
		return res;
	}
	
	@RequestMapping("/validate")
	public String meth4(User u1)
	{
		String res="fail";
		//System.out.println(u1.toString());
		res=rt.postForObject("http://localhost:8082/validate", u1, String.class);
		return res;
	}

}
