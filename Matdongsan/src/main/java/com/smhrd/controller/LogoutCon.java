package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 로그인 정보를 세션에서 삭제
		HttpSession session = request.getSession();
		session.removeAttribute("loginMember");
		session.removeAttribute("selectLand");
		session.removeAttribute("selectTP");
				
		// 다시 main.jsp로 이동
		response.sendRedirect("Start.jsp");		
	
		
	}

}
