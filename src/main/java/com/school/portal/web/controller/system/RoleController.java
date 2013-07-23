package com.school.portal.web.controller.system;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.school.portal.dao.support.Page;
import com.school.portal.service.QueryCondition;
import com.school.portal.service.RoleService;
import com.school.portal.util.TypeCaseHelperUtil;
import com.school.portal.web.controller.BaseProfileController;

@Controller
@RequestMapping(value="/system/role")
public class RoleController extends BaseProfileController {
	
	@Autowired
	private RoleService roleService;
	
	@RequestMapping(value="initRole.htm",method=RequestMethod.GET)
	public String initRole() {
		roleService.initRole();
		return "";
	}
	
	@RequestMapping(value="queryRoleList.htm",method=RequestMethod.GET)
	public String toRoleList() {
		return "/system/roleList";
	}
	
	@RequestMapping(value="queryRoleList.htm",method=RequestMethod.POST)
	public ModelAndView userList(HttpServletRequest request,@RequestParam(required=false,defaultValue="1") Integer page,
			@RequestParam(required=false,defaultValue="50") Integer rows,
			@RequestParam(required=false,defaultValue="roleId") String sort,
			@RequestParam(required=false,defaultValue="asc") String order) {
		QueryCondition qc = new QueryCondition(page, rows, sort, order, getParams(request));
		Page pager = roleService.queryRolePage(qc);
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
			if (type == 3) {
				paramMap.put("roleName", condition);
			}
		}
		return paramMap;
	}

}
