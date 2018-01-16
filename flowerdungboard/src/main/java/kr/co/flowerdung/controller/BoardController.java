package kr.co.flowerdung.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.flowerdung.model.Article;

@Controller
public class BoardController {

	@Autowired
	private MessageSource messageSource;
		
	@RequestMapping("/home")
	public ModelAndView home() {
		

		
		ModelAndView mav = new ModelAndView();
		mav.addObject("greet", "Love & Peace");
		mav.setViewName("outline");
		
		return mav;	
	}
}
