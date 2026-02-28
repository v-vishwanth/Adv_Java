package com.lpu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	public String welcomePage() {
		return "welcome.html";
	}
	@RequestMapping("/res")
	public String register() {
		return "login.jsp";
	}
	@RequestMapping("/postgres")
	public String saveUser(
            @RequestParam("username") String username,
            @RequestParam("password") String password) {

        Student s = new Student();
        s.setUsername(username);
        s.setPassword(password);

        StudentDao sdao = new StudentDao();
        sdao.saveStu(s);

        return "success.jsp";
    }
	@RequestMapping("/find")
	public ModelAndView find(ModelAndView mv) {
		StudentDao s = new StudentDao();
		mv.addObject("name",s.findStu().getUsername());
		mv.addObject("password", s.findStu().getPassword());
		
	}
}
