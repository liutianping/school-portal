package com.school.portal.web.controller.system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.school.portal.dao.ResourceMapper;
import com.school.portal.dao.support.Page;
import com.school.portal.service.QueryCondition;
import com.school.portal.service.ResourcesService;
import com.school.portal.util.TypeCaseHelperUtil;
import com.school.portal.web.JsonReult;
import com.school.portal.web.controller.BaseProfileController;
import com.school.portal.web.dto.ResourceDto;

@Controller
@RequestMapping(value="/system/resource")
public class ResourcesController extends BaseProfileController {
	
	@Autowired
	private ResourcesService resourcesService;
	
	@Autowired
	private ResourceMapper resourceMapper;
	
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
	public ModelAndView resourceList(HttpServletRequest request,@RequestParam(required=false,defaultValue="1") Integer page,
			@RequestParam(required=false,defaultValue="50") Integer rows,
			@RequestParam(required=false,defaultValue="resourceId") String sort,
			@RequestParam(required=false,defaultValue="asc") String order) {
		QueryCondition qc = new QueryCondition(page, rows, sort, order, getParams(request));
		Page pager = resourcesService.queryPage(qc);
		ModelAndView mv = getJsonModelAndView();
		mv.addObject("rows",pager.getItems());
		mv.addObject("total",pager.getTotalRecord());
		return mv;
	}
	
	
	@RequestMapping(value="addResource.htm",method=RequestMethod.POST)
	public ModelAndView addResource(@ModelAttribute(value="resource") ResourceDto resourceDto) {
		JsonReult jr = JsonReult.getJsonResult();
		resourcesService.saveResource(resourceDto);
		jr.setData("添加成功!");
		jr.setStatus(1000);
		ModelAndView mv = putModel(jr);
		return mv;
	}
	
	@RequestMapping(value="loadParentResourceIds.htm",method=RequestMethod.POST)
	public ModelAndView loadParentResourceIds(HttpServletRequest request) {
		List<Long> parentIds = resourceMapper.findAllParentId();
		JsonReult jr = JsonReult.getJsonResult();
		jr.setData(parentIds);
		ModelAndView mv = putModel(jr);
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
