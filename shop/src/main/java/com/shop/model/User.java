package com.shop.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @Description: 用户信息表
 * @see: User 此处填写需要参考的类
 * @version 2017年3月14日 上午11:12:27 
 * @author zhibin.cui
 */

public class User implements Serializable {
	
    private static final long serialVersionUID = 490965787407381530L;
	
    /** 主键 */
    private String id;
    /** 用户编号 */
    private int userNo;
    /** 用户名称 */
    private String status;
    /** 用户名称 */
    private String name;
    /** 手机号 */
    private String phoneNo;
    /** 邮箱 */
    private String email;
    /** 密码 */
    private String password;
    /** 创建时间 */
    private Date createTime;
    /** 修改时间 */
    private Date updateTime;
    /** 乐观锁 */
    private Integer optimistic;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo == null ? null : phoneNo.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getOptimistic() {
        return optimistic;
    }

    public void setOptimistic(Integer optimistic) {
        this.optimistic = optimistic;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", code=" + userNo + ", status=" + status
				+ ", name=" + name + ", phoneNo=" + phoneNo + ", email="
				+ email + ", password=" + password + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", optimistic="
				+ optimistic + "]";
	}

}