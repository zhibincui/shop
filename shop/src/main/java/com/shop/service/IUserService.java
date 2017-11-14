package com.shop.service;

import com.shop.model.User;
import com.shop.model.bean.UserBean;

/**
 * 
 * @Description: 用户信息服务接口
 * @see: IUserService 此处填写需要参考的类
 * @version 2017年3月14日 上午10:52:29 
 * @author zhibin.cui
 */
public interface IUserService {
	
	/**
	 * 
	 * @Description  根据id查询用户信息
	 * @param userId
	 * @return
	 * @see 需要参考的类或方法
	 */
    public User getUserById(String userId);  
    
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
    public void insertUser(User user);
    
    /**
     * 
     * @Description  根据手机号修改用户信息
     * @param phoneNo 手机号
     * @see 需要参考的类或方法
     */
    public void updateUserByPhoneNo(String phoneNo ,UserBean userBean);
    
    
}  
