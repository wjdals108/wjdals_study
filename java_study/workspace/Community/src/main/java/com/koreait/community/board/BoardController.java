package com.koreait.community.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.koreait.community.Const;
import com.koreait.community.SecurityUtils;
import com.koreait.community.model.BoardDTO;
import com.koreait.community.model.BoardDomain;
import com.koreait.community.model.BoardEntity;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@Autowired
	private SecurityUtils sUtils;
	
	@GetMapping("/home")
	public void home() {}
	
	@GetMapping("/list")
	public void list() {}
	
	@ResponseBody
	@GetMapping("/listData")
	public List<BoardDomain> listData(BoardDTO p) {
		return service.selBoardList(p);
	}
	
	@ResponseBody
	@GetMapping("getMaxPageNum")
	public int selMaxPageNum(BoardDTO p) {
		return service.selMaxPageNum(p);
	}
	
	@GetMapping("/write")
	public String write() {
		return "board/writeEdit";
	}
	
	@PostMapping("/write")
	public String write(BoardEntity p, HttpSession hs) {
		p.setUserPk(sUtils.getLoginUserPk(hs));
		int result = service.insBoard(p);
		return "redirect:/board/detail?boardPk=" + p.getBoardPk();
	}
	
	@GetMapping("/detail")
	public void detail(BoardDTO p, Model model, HttpSession hs) {
		model.addAttribute(Const.KEY_DATA, service.selBoardWithHits(p, hs));
	}
	
	@ResponseBody
	@DeleteMapping("/del/{boardPk}")
	public Map del(BoardEntity p, HttpSession hs) {
		p.setUserPk(sUtils.getLoginUserPk(hs));
		Map<String, Object> rVal = new HashMap<>();
		rVal.put(Const.KEY_DATA, service.delBoard(p));
		return rVal;
	}
	
	@GetMapping("/edit")
	public String edit(BoardDTO p, Model model) {
		model.addAttribute(Const.KEY_DATA, service.selBoard(p));
		return "board/writeEdit";
	}
	
	@PostMapping("/edit")
	public String edit(BoardEntity p, HttpSession hs) {
		p.setUserPk(sUtils.getLoginUserPk(hs));
		service.updBoard(p);
		return "redirect:/board/detail?boardPk=" + p.getBoardPk();
	}
}
