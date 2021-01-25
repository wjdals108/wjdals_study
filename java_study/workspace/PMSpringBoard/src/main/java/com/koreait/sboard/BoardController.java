package com.koreait.sboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.koreait.sboard.model.BoardEntity;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@GetMapping("/list")
	public void list(Model model) {					//파일명이 write랑 같기 때문에 void 줘도 되는거임 다르면 String 줘서 return값 줘야함
		model.addAttribute("list", service.selBoardList());
	}
	
	@GetMapping("/write")
	public void write() {
		
	}
	
	@PostMapping("/write")
	public String write(BoardEntity p) {					//redirect 쓸려면 반드시 return 타입이 있어야함
		service.insBoard(p);
		
		return "redirect:/list";
	}
	
	@GetMapping("/detail")
	public void detail(Model model, BoardEntity p) {
		model.addAttribute("vo", service.selBoard(p));
	}
	
	@GetMapping("/del")
	public String del(BoardEntity p) {
		service.delBoard(p);
		
		return "redirect:/list";
	}
	
	@GetMapping("/update")
	public void update(Model model, BoardEntity p) {
		model.addAttribute("vo", service.selBoard(p));
	}
	
	@PostMapping("/update")
	public String update(BoardEntity p) {
		service.updBoard(p);
		
		return "redirect:/detail?i_board="+p.getI_board();
	}
}
