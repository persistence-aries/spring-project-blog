package com.aries.blog;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/qq")
public class SpringBootHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@GetMapping("/x")
	public String hello(){
		
		return "Hey, Spring Boot 的 Hello World ! ";
	}
	
	@GetMapping("/index")
	public String helloIndex(){
		return "index";
	}
	
	@GetMapping("/page")
	public String helloPage(){
		return "page1";
	}
	

}
