package com.lpu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller // take request and send response to client(Browser)
public class Mycontroller {
	@RequestMapping("/hi")
	public String takeRequestHi() {
		return "page.jsp";
	}

	@RequestMapping("/login")
	public String takeLogin() {
		return "login.jsp";
	}

	@RequestMapping("/welcome")
	public String Mywelcome() {
		return "welcome.jsp";
	}

	@RequestMapping("/data")
	public String sendData() {

		return "login.jsp";
	}

	@RequestMapping("/model")
	public String model(Model model) {
		model.addAttribute("name", "Vishwanth");
		model.addAttribute("Phone", 232123);
		return "model.jsp";
	}

	@RequestMapping("/mv")
	public ModelAndView sendData(ModelAndView mv) {
		mv.addObject("name", "Donkey");
		mv.addObject("Phone", 34321);
		mv.setViewName("login.jsp");
		return mv;
	}
	
	@RequestMapping("/reg")
	public ModelAndView register(
			@RequestParam(value = "username") String name,
			@RequestParam(value = "password") String pass
			){
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", name);
		mv.addObject("Phone", pass);
		mv.setViewName("model.jsp");
		return mv;
	}
	
	@RequestMapping("/reg1")
	public ModelAndView register2(@ModelAttribute Student s) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", s.getUsername());
		mv.addObject("Phone", s.getPassword());
		mv.setViewName("model.jsp");
		return mv;
	}
	@RequestMapping("/VR")
	public String view() {
		return "home";
	}
	
}
