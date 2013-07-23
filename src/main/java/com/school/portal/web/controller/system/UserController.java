package com.school.portal.web.controller.system;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.school.portal.dao.UserMapper;
import com.school.portal.dao.support.Page;
import com.school.portal.entity.system.User;
import com.school.portal.service.QueryCondition;
import com.school.portal.service.UserService;
import com.school.portal.util.TypeCaseHelperUtil;
import com.school.portal.web.JsonReult;
import com.school.portal.web.controller.BaseProfileController;
import com.school.portal.web.dto.UserDto;

@Controller
@RequestMapping(value="/system/user")
public class UserController extends BaseProfileController {
	
	public static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping(value="addUser.htm",method=RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute(value="user") UserDto userDto) {
		JsonReult jr = JsonReult.getJsonResult();
		userService.saveUser(userDto);
		jr.setData("添加成功!");
		jr.setStatus(1000);
		ModelAndView mv = getJsonModelAndView();
		mv.addObject("data", jr);
		return mv;
	}
	
	@RequestMapping(value="queryUserList.htm",method=RequestMethod.GET)
	public String toUserList() {
		return "/system/userList";
	}
	@RequestMapping(value="changeTheme.htm",method=RequestMethod.GET)
	public String toChangeTheme() {
		return "/system/changeTheme";
	}
	
	@RequestMapping(value="queryUserList.htm",method=RequestMethod.POST)
	public ModelAndView userList(HttpServletRequest request,@RequestParam(required=false,defaultValue="1") Integer page,
			@RequestParam(required=false,defaultValue="50") Integer rows,
			@RequestParam(required=false,defaultValue="userId") String sort,
			@RequestParam(required=false,defaultValue="asc") String order) {
		
		QueryCondition qc = new QueryCondition(page, rows, sort, order, getParams(request));
		Page pager = userService.queryUserPage(qc);
		ModelAndView mv = getJsonModelAndView();
		mv.addObject("rows",pager.getItems());
		mv.addObject("total",pager.getTotalRecord());
		return mv;
	}
	
	private Map<String,Object> getParams(HttpServletRequest request) {
		Map<String,Object> paramMap = new HashMap<String, Object>();
		Integer type = TypeCaseHelperUtil.convert2Integer(request.getParameter("type"));
		if (type != null) {
			String condition = TypeCaseHelperUtil.convert2String(request.getParameter("condition"));
			if (type == 2) {
				paramMap.put("userName", condition);
			}
		}
		return paramMap;
	}
	
	@RequestMapping(value="updateUser.htm",method=RequestMethod.POST)
	public String updateUser() {
		return "";
	}
	
	@RequestMapping(value="removeUser.htm",method=RequestMethod.POST)
	public ModelAndView removeUser(@RequestParam Long userId) {
		ModelAndView mv = getJsonModelAndView();
		userMapper.deleteByPrimaryKey(userId);
		JsonReult jr = JsonReult.getJsonResult();
		jr.setData("删除成功!");
		jr.setStatus(1000);
		mv.addObject("data", jr);
		return mv;
	}
	
	@RequestMapping(value="getUserRoles.htm",method=RequestMethod.POST)
	public String getUserRoles() {
		return "";
	}
	
	@RequestMapping(value="initUserData.htm",method=RequestMethod.GET)
	public String initUserData() {
		userService.loadUserData();
		return "";
	}

}
