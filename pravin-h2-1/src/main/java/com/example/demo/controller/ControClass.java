package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.model.UserRepo;

@RestController
public class ControClass {
	@Autowired
	UserRepo ur;
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String method1(@RequestBody User u1)
	{
		
		//System.out.println(u1.toString());
		ur.save(u1);
		return "success";
	}
	@RequestMapping(value="/validate",method=RequestMethod.POST)
	public String method2(@RequestBody User u1)
	{
		
		//System.out.println(u1.toString());
		Optional<User> u2 = ur.findById(u1.getUname());
		if(u2.isPresent()) {
		     if(u2.get().getPassword().equals(u1.getPassword()))
		  {
			  return "logged in successfully";
		  }
		  else
		  {
			  return "fail";
		  }
		} else {
		    return "fail";
		}
		
	}

}
