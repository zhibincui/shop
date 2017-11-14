package com.shop.service.impl;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shop.dao.IUserDao;
import com.shop.model.User;
import com.shop.model.bean.UserBean;
import com.shop.service.IUserService;



  
/**
 *  
 * @Description: 用户信息接口实现
 * @see: UserServiceImpl 此处填写需要参考的类
 * @version 2017年3月14日 上午10:52:09 
 * @author zhibin.cui
 */
@Service("userService")  
public class UserServiceImpl implements IUserService {  
	
    @Resource  
    private IUserDao userDao;  
    
    public User getUserById(String userId) {  
        return this.userDao.selectByPrimaryKey(userId);  
    }
    
    public User getUserByPhoneNo(String phoneNo) {
    	if (phoneNo != null) {
    		return userDao.getUserByPhoneNo(phoneNo);
		}
    	return null;
	}  

	public void insertUser(User user) {
		
		// 初始用户编号
		int initUserNo = 10000000;
		// 查询code最大值
		User userInfo = userDao.selectMaxCode();
		if (userInfo != null ) {
			initUserNo = userInfo.getUserNo();
			user.setUserNo(++initUserNo);
		}else{
			user.setUserNo(initUserNo);
		}
		user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		user.setCreateTime(new Date());
		user.setOptimistic(0);
		user.setStatus("TRUE");
		
		userDao.insert(user);
	}
	
	

	public void updateUserByPhoneNo(String phoneNo,UserBean userBean) {
		
		User userInfo = userDao.getUserByPhoneNo(phoneNo);
		if (userInfo != null) {
			if (userBean.getPassword() != null) {
				userInfo.setPassword(userBean.getPassword());
			}
			if (userBean.getEmail() != null) {
				userInfo.setEmail(userBean.getEmail());
			}
			userInfo.setOptimistic(userInfo.getOptimistic()+1);
			userInfo.setUpdateTime(new Date());
			userDao.updateUserByPhoneNo(userInfo);
		}
	}
}  
