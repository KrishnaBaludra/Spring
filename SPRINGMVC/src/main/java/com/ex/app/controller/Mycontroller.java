package com.ex.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/api")
public class Mycontroller {
	@RequestMapping(value="/greetings")
	public String m1() {
		System.out.println("m1..............");
		return "Display";
	}
}

