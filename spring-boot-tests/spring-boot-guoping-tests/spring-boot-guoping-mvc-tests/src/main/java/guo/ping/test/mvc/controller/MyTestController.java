package guo.ping.test.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: 测试Controller
 * @author: guoping wang
 * @date: 2019/4/21 15:27
 * @project: spring-boot-build
 */
@Controller
@RequestMapping("/test")
public class MyTestController {

	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "test hello world";
	}
}
