/**
 * 
 */
package com.shop.dao;

import com.shop.model.User;

/** 
 * @Description: 这里用一句话描述这个类的作用
 * @see: UserDao 此处填写需要参考的类
 * @version 2017年3月7日 下午2:43:46 
 * @author zhibin.cui
 */

public interface UserDao {

	/** 
	 * @Description 根据id查询用户信息
	 * @param id
	 * @return 
	 * @see 需要参考的类或方法
	 */
	 public User selectById(String id);

	/** 
	 * @Description  一句话描述方法用法
	 * @param user
	 * @see 需要参考的类或方法
	 */
	public void insert(User user);
	
	
	
}
