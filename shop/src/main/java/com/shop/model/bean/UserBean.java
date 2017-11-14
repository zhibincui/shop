package com.shop.model.bean;

import java.io.Serializable;

/**
 * 用户信息bean
 * @Description: 这里用一句话描述这个类的作用
 * @see: UserBean 此处填写需要参考的类
 * @version 2017年3月17日 下午1:43:19 
 * @author zhibin.cui
 */
public class UserBean implements Serializable {
	
	private static final long serialVersionUID = -463221416070637447L;
	
	/** 用户名称 */
    private String name;
    /** 手机号 */
    private String phoneNo;
    /** 邮箱 */
    private String email;
    /** 密码 */
    private String password;
    /** 状态 */
    private String status;
    
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "UserBean [name=" + name + ", phoneNo=" + phoneNo + ", email="
				+ email + ", password=" + password + ", status=" + status + "]";
	}
}
