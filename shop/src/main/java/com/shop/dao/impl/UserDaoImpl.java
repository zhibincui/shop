/**
 * 
 */
package com.shop.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.dao.UserDao;
import com.shop.dao.mapper.UserMapper;
import com.shop.model.User;

/** 
 * @Description: 
 * @see: UserDaoImpl 此处填写需要参考的类
 * @version 2017年3月7日 下午2:45:19 
 * @author zhibin.cui
 */
@Service("userDao")
public class UserDaoImpl implements UserDao {

	@Resource
	private UserMapper userMapper;
	
	public User selectById(String id) {
		
		return userMapper.selectById(id) ;
	}

	public void insert(User user) {
		userMapper.insert(user);
		
	}


}
