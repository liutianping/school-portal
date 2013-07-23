package com.school.portal.entity.system;

import java.io.Serializable;
import java.util.Date;


import com.alibaba.fastjson.annotation.JSONField;
import com.school.portal.entity.BaseModel;
import com.school.portal.web.dto.UserDto;
/**
 * 用户
 * @author Fe
 *
 */
public class User implements Serializable,BaseModel<User>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1781920074350227905L;
	
	public static final Integer STATUS_ENABLE = 5;
	public static final Integer STATUS_DISABLE = 10;
	
	public static final Integer SEX_MAN = 1;
	public static final Integer SEX_WOMAN = 0;
	
	@JSONField(serialize=false)
	public Class<User> getModelClass() {
		return User.class;
	}
	
	/**主键**/
	private Long userId;
	/**用户名**/
	private String userName;
	/**密码**/
	private String password;
	/**昵称**/
	private String nickName;
	/**手机号码**/
	private String phoneNum;
	/**邮箱**/
	private String email;
	/**性别**/
	private Integer sex = SEX_MAN;
	/**状态**/
	private Integer status = STATUS_ENABLE;
	/**生日**/
    private Date birthday;
    /**创建时间**/
	private Date createTime;
	/**更新时间**/
	private Date updateTime;
	
	public User() {}

	public User(Long userId, String userName, String password, String nickName,
			String phoneNum, String email, Integer sex, Integer status,
			Date birthday, Date createTime, Date updateTime, Date version,
			Role role) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.nickName = nickName;
		this.phoneNum = phoneNum;
		this.email = email;
		this.sex = sex;
		this.status = status;
		this.birthday = birthday;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	
	public User(UserDto userDto) {
		this.userName = userDto.getUserName();
		this.password = userDto.getPassword();
		this.nickName = userDto.getNickName();
		this.phoneNum = userDto.getPhoneNum();
		this.email = userDto.getEmail();
		this.sex = userDto.getSex();
		this.status = userDto.getStatus();
		this.birthday = userDto.getBirthday();
		this.createTime = new Date();
		this.updateTime = new Date();
	}
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
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
	
	

	

}
