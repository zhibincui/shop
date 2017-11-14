/**
 * 
 */
package com.shop.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shop.model.User;

/** 
 * @Description: 测试类
 * @see: UserTest 此处填写需要参考的类
 * @version 2017年3月7日 下午3:11:40 
 * @author zhibin.cui
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-mybatis.xml"})
public class UserTest {

	private static Logger logger = LoggerFactory.getLogger(UserTest.class);
	
	@Resource
	private UserService userServiec;
	
	@Test
	public void userTest(){
		try {
			User user = userServiec.selectById("1");
			logger.info("用户信息为:{}",user);
			
		} catch (Exception e) {
			logger.error("查询用户信息异常:{}",e);
		}
	}
	
	@Test
	public void insertTest(){
		User user = new User(); 
		user.setId("1111");
		user.setUserName("cui");
		user.setPassword("123");
		user.setAge(4);
		userServiec.insertUser(user);
	}
	
}
