package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
 * @Description: 用户信息
 * @see: UserController 此处填写需要参考的类
 * @version 2017年3月8日 下午3:09:46 
 * @author zhibin.cui
 */
@Controller
@RequestMapping("/mvc")
public class UserController {
	private static Logger log = LoggerFactory.getLogger(UserController.class);

	@RequestMapping("/hello")
	public String user(){
		return "user";
	}
	
}
