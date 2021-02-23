package com.koreait.apart;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.koreait.apart.model.ApartmentInfoEntity;

@Controller
public class HomeController {
	
	@Autowired
	private HomeService service;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@GetMapping("/")
	public String home(Locale locale, Model model) {
		model.addAttribute("cd", service.getExternalCd());
		return "home";
	}

	@GetMapping("/result")
	public void result(ApartmentInfoEntity p, Model model) {
		model.addAttribute("list", service.getData(p));
	}

}
