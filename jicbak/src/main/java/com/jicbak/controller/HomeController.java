package com.jicbak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jicbak.DTO.UserDTO;
import com.jicbak.service.BoardService;
import com.jicbak.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	private BoardService bService;
	private UserService uService;
	@Autowired
	private HttpServletRequest request;
	
	public HomeController(BoardService b, UserService u) {
		this.bService=b;
		this.uService=u;
	}
	
	@RequestMapping("/")
	public String home(Model model) {
		return "home";
	}
	@RequestMapping("/about")
	public String about(Model model) {
		return "about";
	}
	@RequestMapping("/content")
	public String content(Model model) {
		return "content";
	}
	@RequestMapping("/contact")
	public String contact(Model model) {
		return "contact";
	}
	@RequestMapping("/login")
	public String login(Model model) {
		return "login";
	}
	@RequestMapping("/signup")
	public String signup(Model model) {
		return "signup";
	}
	@RequestMapping("/header")
	public String header(Model model) {
		return "header";
	}
	@RequestMapping("/contentView")
	public String contentView(Model model) {
		return "contentView";
	}
	
	//회원가입
	@RequestMapping(value="/signup", method= RequestMethod.POST)
	@ResponseBody
	public int signup(UserDTO user) {
		int Result = uService.join(user);
		return Result;
	}
	
	//로그인
	@RequestMapping(value="/login", method= RequestMethod.POST)
	@ResponseBody
	public boolean login(String userId, String userPw) {
		boolean Result = uService.login(userId, userPw);
		return Result;
	}
	
	//로그인 결과 저장
	@RequestMapping(value="/getLoginSession", method= RequestMethod.POST)
	@ResponseBody
	public String getLoginSession(String userId) {
		UserDTO user = uService.getUser(userId);
		String userName = user.getUserName();
		HttpSession session = request.getSession();
		session.setAttribute("userName",userName);
		return userName;
	}
}
