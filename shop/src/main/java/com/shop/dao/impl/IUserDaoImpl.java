package com.shop.dao.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.dao.IUserDao;
import com.shop.dao.mapper.IUserMapper;
import com.shop.model.User;



/**
 * 
 * @Description: 用户信息服务接口实现
 * @see: IUserDaoImpl 此处填写需要参考的类
 * @version 2017年3月14日 上午10:53:17 
 * @author zhibin.cui
 */
@Service("userDao")
public class IUserDaoImpl implements IUserDao {

	@Resource
	private IUserMapper userMapper;
	
	public User selectByPrimaryKey(String id) {
		return userMapper.selectByPrimaryKey(id);
	}
	
	public User getUserByPhoneNo(String phoneNo) {
		return userMapper.getUserByPhoneNo(phoneNo);
	}

	public void insert(User user) {
		userMapper.insert(user);
	}

	public User selectMaxCode() {
		return userMapper.selectMaxCode();
	}

	public void updateUserByPhoneNo(User userInfo) {
		userMapper.updateUserByPhoneNo(userInfo);
	}
}
