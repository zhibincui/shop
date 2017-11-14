package com.shop.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.shop.model.User;
import com.shop.service.IUserService;


/**
 * 
 * @Description: 这里用一句话描述这个类的作用
 * @see: UserController 此处填写需要参考的类
 * @version 2017年7月27日 下午2:23:54
 * @author zhibin.cui
 */
@RestController
@RequestMapping("/user")
public class UserController {
	private static Logger logger = LoggerFactory
			.getLogger(UserController.class);

	@Resource
	private IUserService iUserService;

	/**
	 * 
	 * @Description 用户注册
	 * @param request
	 * @param response
	 * @see 需要参考的类或方法
	 */
	@RequestMapping("addUser")
	public void addUser(HttpServletRequest request, HttpServletResponse response) {

	}

	@RequestMapping("getUrl")
	public String getUrl() {
		return "qrCode";
	}

	@RequestMapping("query")
	// @ResponseBody
	public String queryUserInfo(String userId) {
		User user = iUserService.getUserById(userId);

		logger.info("user:{}", user);
		return JSON.toJSONString(user);
	}

	@RequestMapping("toAddUser")
	public ModelAndView toAddUser() {
		ModelAndView vm = new ModelAndView("/userRegister/userRegister");
		return vm;
	}

}