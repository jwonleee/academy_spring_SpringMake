package com.simple.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

//핸들러 클래스로 등록이 되려면 특정 기능을 가지고 있어야 합니다.
//MultiActionController 스프링 3ver에서 컨트롤러의 역할을 할 수 있도록 제공되는 클래스 중 1개
//상속받고 handleRequestInternal 오버라이딩 하면 동작합니다.

public class MainController extends MultiActionController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String path = request.getContextPath();
		String uri = request.getRequestURI();
		
		String command = uri.substring(path.length());
		
		
		if(command.equals("/test/aaa")) {
			System.out.println("aaa실행됨");
			//확장
			//model과 view 정보를 담는 객체
			ModelAndView mv = new ModelAndView();
//			mv.setViewName("/WEB-INF/views/home.jsp"); //뷰의 정보
			mv.setViewName("home"); //앞뒤로 prefix, suffix 들어감
			mv.addObject("data", "hello world"); //데이터정보
			return mv;
			
		} else if(command.equals("/test/bbb")) {
			System.out.println("bbb실행됨");
		}
		
	
		return super.handleRequestInternal(request, response);
	}

}
