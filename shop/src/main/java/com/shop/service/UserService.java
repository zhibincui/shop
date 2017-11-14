/**
 * 
 */
package com.shop.service;

import com.shop.model.User;

/** 
 * @Description: 用户信息服务接口
 * @see: UserService 此处填写需要参考的类
 * @version 2017年3月7日 下午2:54:45 
 * @author zhibin.cui
 */
public interface UserService {
	
	/**
	 * 
	 * @Description 根据id查询用户信息
	 * @param id
	 * @return
	 * @see 需要参考的类或方法
	 */
	public User selectById(String id);
	
	public void insertUser(User user);
	
}
