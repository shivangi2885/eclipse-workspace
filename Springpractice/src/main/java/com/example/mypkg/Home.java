package com.example.mypkg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("myapp")

public class Home {
	 
		 @Value("${server.port}")
		 public String port;
		 
		 @GetMapping("/demo")
		 public String getdemo() {
			 return port;
		 }
		 
		 @GetMapping("/demo/next")
		 public String getSecPage() {
			 return "second page";
		 }
	 
}
