package com.korea.login.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.korea.login.dto.LoginVO;

public class LoginInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		boolean result = false;
		response.setContentType("text/html; charset=utf-8");
		
		HttpSession session = request.getSession();
		LoginVO loginUser=(LoginVO) session.getAttribute("loginUser");
		if(loginUser!=null){
			result = true;
		}else{
			PrintWriter out = response.getWriter();
			request.setCharacterEncoding("UTF-8");
			out.println("<script>alert('로그인이 필요합니다.');</script>");
			out.println("<script>location.href='loginForm';</script>");
			result = false;
		}
		
		
		
		return result;
	}


	
	
}
