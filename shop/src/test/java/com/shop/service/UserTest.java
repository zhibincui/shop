/**
 * 
 */
package com.shop.service;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
	private IUserService userServiec;
	
	
	
}
