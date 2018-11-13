/**
 * 
 */
package com.example.SpringBoot.Controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author searphimlyx
 *
 */
@Controller
public class HelloWorldController {
	@Autowired
	@Qualifier("IOC")
	private IOCInterface ioc;
	
	@Value("#{'${test}'.bytes}")
	private String test;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	/**
	 * @param ioc the ioc to set
	 */
	
	
//	@RequestMapping("/")
//	public ModelAndView index() {
//		ModelAndView mv = new ModelAndView();
//		return new ModelAndView("index");
//	}
	@RequestMapping("/")
	public String index(Map<String, Object> model, ModelMap map) {
		Map<String, String> m = new HashMap();
		m.put("test", "test1");
		model.put("message", "index page");
		map.addAttribute("test",m);
//		System.out.println(Thread.currentThread().getName());
//		ioc.test();
//		ioc.test();
		return "index";
	}
}