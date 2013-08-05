package com.school.portal.web.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.school.portal.web.controller.BaseProfileController;


@Controller
@RequestMapping(value="/system/permission")
public class PermissionController extends BaseProfileController {
	
	@RequestMapping(value="authPermission.htm",method=RequestMethod.GET)
	public String toResourceList() {
		return "/system/authPermission";
	}

}
