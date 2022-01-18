package com.mitinsharma.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
 
	@RequestMapping("home")
	//@ResponseBody
	public String home(HttpServletRequest req, HttpServletResponse res) {
		//System.out.println("Home Controller");
		HttpSession session = req.getSession();
		String name = req.getParameter("name");
		System.out.println("Name: " + name);
		//using request
		//req.setAttribute("name", name);
		//using session
		session.setAttribute("name", name);
		return "home";
	}
}
