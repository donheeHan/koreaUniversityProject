package com.korea.login.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.korea.login.dto.LoginVO;

@Controller
public class LoginController {

	@RequestMapping("loginForm")
	public String loginForm(){
		String url = "loginForm";
		
		return url;
	}
	
	@RequestMapping("login")
	public String login(@RequestParam(value="id", defaultValue="")String id,
						@RequestParam(value="password", defaultValue="")String password,
						HttpSession session){
		String url = "main";
		
		LoginVO loginVO = new LoginVO();
		loginVO.setId(id);
		loginVO.setPassword(password);
		
		session.setAttribute("loginUser", loginVO);
		
		return url;
	}
}
