/**
 * 
 */
package com.example.SpringBoot.Controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author searphimlyx
 *
 */
@Controller
public class HelloWorldController {
	@Autowired
	@Qualifier("IOC2")
	private IOCInterface ioc;
	
	@Value("#{'${test}'.bytes}")
	private String test;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	/**
	 * @param ioc the ioc to set
	 */
	
	@RequestMapping("/hello")
	public String index(Map<String, Object> model) {
		model.put("message", "index page");
		ioc.test();
		System.out.println(logger);
		return "index";
	}
}