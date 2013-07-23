package com.school.portal.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.school.portal.Contants;
import com.school.portal.dao.BasicMapper;
import com.school.portal.dao.ResourceMapper;
import com.school.portal.dao.UserMapper;
import com.school.portal.dao.support.Page;
import com.school.portal.entity.system.User;
import com.school.portal.service.BaseServiceImpl;
import com.school.portal.service.QueryCondition;
import com.school.portal.service.UserService;
import com.school.portal.web.dto.UserDto;

@Component
public class UserServiceImpl extends BaseServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	
	public void loadUserData() {
		List<String> ncList = loadNickNameFile();
		for (String nickName : ncList) {
			User user = new User();
			user.setUserName(getUserName());
			user.setPassword(getPassword());
			user.setNickName(nickName);
			user.setEmail(getEmail());
			user.setPhoneNum(getPhoneNum());
			user.setBirthday(new Date());
			user.setCreateTime(new Date());
			user.setUpdateTime(new Date());
			userMapper.save(user);
		}
	}
	
	private String getUserName() {
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 5; i++) {
			int index = random.nextInt(Contants.strs.length);
			sb.append(Contants.strs[index]);
		}
		return sb.toString();
	}
	
	private String getPassword() {
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 6; i++) {
			int index = random.nextInt(Contants.strs.length);
			sb.append(Contants.strs[index]);
		}
		return sb.toString();
	}
	
	private String getEmail() {
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 6; i++) {
			int index = random.nextInt(Contants.strs.length);
			sb.append(Contants.strs[index]);
		}
		int emIndex = random.nextInt(Contants.emailSuffix.length);
		return sb.toString() + Contants.emailSuffix[emIndex];
	}
	
	private String getPhoneNum() {
		Random random = new Random();
		int phIndex = random.nextInt(Contants.phonePreffix.length);
		String phPre = Contants.phonePreffix[phIndex];
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 8; i++) {
			int numIndex = random.nextInt(Contants.nums.length);
			sb.append(Contants.nums[numIndex]);
		}
		return phPre + sb.toString();
	}
	
	private List<String> loadNickNameFile() {
		File file = new File(new File(Thread.currentThread().getContextClassLoader().getResource("").getFile()).getParentFile().getParentFile()+"/config/data/nickName.txt");
		List<String> list = null;
		try {
			list = IOUtils.readLines(new FileInputStream(file), "UTF-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	public Page queryUserPage(QueryCondition qc) {
		int total = userMapper.getTotal(qc.getOtherParams());
		List<User> userList = userMapper.findByPage(Page.getPageNo(qc.getPage(), qc.getRows()), qc.getRows(),qc.getSort(),qc.getOrder(),qc.getOtherParams());
		Page pager = new Page();
		pager.setItems(userList);
		pager.setTotalRecord(total);
		return pager;
	}
	
	public void saveUser(UserDto userDto) {
		userMapper.save(new User(userDto));
	}

	@Override
	public BasicMapper<?, Long> getBasicMapper() {
		return userMapper;
	}
}
