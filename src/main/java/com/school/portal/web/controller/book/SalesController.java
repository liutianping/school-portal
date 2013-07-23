package com.school.portal.web.controller.book;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/book/sales")
public class SalesController {
	
	@RequestMapping(value="checkIn.htm",method=RequestMethod.GET)
	public String toCheckIn() {
		return "/sales/checkIn";
	}
	

}
