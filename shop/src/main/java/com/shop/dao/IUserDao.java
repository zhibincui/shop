package com.shop.dao;

import com.shop.model.User;

/**
 * 
 * @Description: 用户信息服务接口
 * @see: IUserDao 此处填写需要参考的类
 * @version 2017年3月14日 上午10:52:46 
 * @author zhibin.cui
 */
public interface IUserDao {
	
	/**
	 * 
	 * @Description  根据id查询用户信息
	 * @param id
	 * @return
	 * @see 需要参考的类或方法
	 */
	public User selectByPrimaryKey(String id);
	
	/**
	 * 
	 * @Description  根据手机号查询用户信息
	 * @param phoneNo
	 * @return
	 * @see 需要参考的类或方法
	 */
	public User getUserByPhoneNo(String phoneNo);

	/**
	 * 
	 * @Description  保存用户信息
	 * @param user
	 * @see 需要参考的类或方法
	 */
	public void insert(User user);
	
	/**
	 * 
	 * @Description  查询code最大值
	 * @return
	 * @see 需要参考的类或方法
	 */
	public User selectMaxCode();
	
	/**
	 * 
	 * @Description  根据手机号更新用户信息
	 * @param userInfo 用户信息
	 * @see 需要参考的类或方法
	 */
	public void updateUserByPhoneNo(User userInfo);

	
}