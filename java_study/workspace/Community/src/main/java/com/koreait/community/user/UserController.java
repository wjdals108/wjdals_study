package com.koreait.community.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.koreait.community.model.UserEntity;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	
	
	@GetMapping("/login")
	public void login(Model model) {
		
	}
	
	@ResponseBody
	@PostMapping("/login")
	public Map<String, Object> login(@RequestBody UserEntity p, HttpSession hs) {			//json 형태로 body를 날렸기때문에 @RequestBody가 있어야함
		System.out.println("ID: " + p.getUserId());
		System.out.println("PW: " + p.getUserPw());
		
		Map<String, Object> returnValue = new HashMap<>();
		returnValue.put("result", service.login(p, hs));
		
		return returnValue;
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession hs) {
		hs.invalidate();
		return "redirect:/user/login";
	}
	
	@GetMapping("/join")
	public void join() {
		
	}
	
	@ResponseBody
	@PostMapping("/join")
	public Map<String, Object> join(@RequestBody UserEntity p) {			//json 형태로 body를 날렸기때문에 @RequestBody가 있어야함
		System.out.println("ID: " + p.getUserId());
		System.out.println("PW: " + p.getUserPw());
		System.out.println("nm: " + p.getNm());
		System.out.println("gender: " + p.getGender());
		
		Map<String, Object> returnValue = new HashMap<>();
		returnValue.put("result", service.insUser(p));
		
		return returnValue;
	}
	
	@ResponseBody						//얘가 알아서 JSon으로 바꿔줌
	@GetMapping("/chkId/{userId}")
	public Map<String, Object> chkId(UserEntity p){
		System.out.println("userId : " + p.getUserId());
		Map<String, Object> returnValue = new HashMap<>();
		returnValue.put("result", service.chkId(p));		//returnValue에 값을 더 넣어주고 싶으면 put 또써주면된다. 
		
		return returnValue;
	}
}
