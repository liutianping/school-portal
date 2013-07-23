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
import com.school.portal.service.ResourcesService;
import com.school.portal.util.TypeCaseHelperUtil;
import com.school.portal.web.controller.BaseProfileController;

@Controller
@RequestMapping(value="/system/resource")
public class ResourcesController extends BaseProfileController {
	
	@Autowired
	private ResourcesService resourcesService;
	
	@RequestMapping(value="initResource.htm",method=RequestMethod.GET)
	public String initRole() {
		resourcesService.initResources();
		return "";
	}
	
	@RequestMapping(value="queryResourceList.htm",method=RequestMethod.GET)
	public String toResourceList() {
		return "/system/resourceList";
	}
	
	@RequestMapping(value="queryResourceList.htm",method=RequestMethod.POST)
	public ModelAndView userList(HttpServletRequest request,@RequestParam(required=false,defaultValue="1") Integer page,
			@RequestParam(required=false,defaultValue="50") Integer rows,
			@RequestParam(required=false,defaultValue="resourceId") String sort,
			@RequestParam(required=false,defaultValue="asc") String order) {
		QueryCondition qc = new QueryCondition(page, rows, sort, order, getParams(request));
		resourcesService.queryPage(qc);
		ModelAndView mv = getJsonModelAndView();
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
