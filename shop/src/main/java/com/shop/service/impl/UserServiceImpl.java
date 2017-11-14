/**
 * 
 */
package com.shop.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.dao.UserDao;
import com.shop.model.User;
import com.shop.service.UserService;

/** 
 * @Description: 这里用一句话描述这个类的作用
 * @see: UserServiceImpl 此处填写需要参考的类
 * @version 2017年3月7日 下午2:56:34 
 * @author zhibin.cui
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	
	public User selectById(String id) {
		
		return userDao.selectById(id);
		
	}

	public void insertUser(User user) {

		userDao.insert(user);
	}

}
