package com.shop.model;

/**
 * 
 * @Description: 用户信息表
 * @see: User 此处填写需要参考的类
 * @version 2017年3月7日 下午3:18:04 
 * @author zhibin.cui
 */
public class User {
	
    private String id;

    private String userName;

    private String password;

    private Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password="
				+ password + ", age=" + age + "]";
	}
    
}