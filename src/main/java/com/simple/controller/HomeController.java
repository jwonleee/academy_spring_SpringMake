package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //빈으로 생성할 클래스 - 선언한 한거지 안에 명령문을 써야 빈이 생성이 됨
public class HomeController {

	@RequestMapping("/test/aaa") //핸들러맵핑
	public String home() {
		return "home";
	}
}