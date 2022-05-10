package com.demo.contollers;
// com.demo

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController = @Controller + @ResponseBody
@Controller
public class DemoController {

	@GetMapping("/demo")
	public String demoMethod(Model m) {
		System.out.println("This is demo method");
		
		return "hello";// resources/templates/hello.html
	}
	
	/*
	 @GetMapping("/demo")
	public ModelAndView demoMethod() {
		System.out.println("This is demo method");
		
		ModelAndView mav = null;
		
		if(condition) {
			mav = new ModelAndView("page1");
		} else {
			mav = new ModelAndView("page2");
		}
		
		mav.addObject("key", "value")
		
		return mav;// resources/templates/hello.html
	}
	 */
	
	
	@PostMapping("/books")
	@ResponseBody
	public String saveBook() {
		return "New book is saved";
	} 
	
	@GetMapping("/process")
	@ResponseBody
	public String doProcess() {
		String name = null;
		return name.toUpperCase();
	}
	
	
//	@RequestMapping("/error")
//	public String allError(HttpServletRequest r, Model m) {
//		if(erro) {
//			return "404.html"
//		}
//	}
	
}
