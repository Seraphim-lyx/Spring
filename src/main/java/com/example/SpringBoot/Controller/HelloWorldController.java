/**
 * 
 */
package com.example.SpringBoot.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot.DAO.Student;

/**
 * @author searphimlyx
 *
 */
@RestController
public class HelloWorldController {
	@Autowired
	@Qualifier("IOC")
	private IOCInterface ioc;
	
	@Value("#{'${test}'.bytes}")
	private String test;
	
//	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public Map<String, String> setStudent(@RequestBody Student student){
		
		Map<String,String> map = new HashMap();
		
		return map;
	}
	
	@RequestMapping(value = "/response",method = RequestMethod.POST)
	@ResponseBody
	public Map<String,String> response(@RequestBody String data) {
		System.out.println(data);
//		System.out.println(student.getDate()+student.getName()+student.getId());
		Map<String,String> map = new HashMap();
		map.put("site", "site1");
		map.put("url", "http://www.google.com");
		return map;
	}
	
	@RequestMapping(value = "/init", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> init(){
		Map<String, Object> map = new HashMap();
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student();
		s1.setAge(11);
		Student s2 = new Student();
		s2.setAge(12);
		list.add(s1);
		list.add(s2);
		map.put("object", list);
		return map;
	}
	
	@RequestMapping("/")
	public String index(Map<String, Object> model, ModelMap map) {
		Map<String, String> m = new HashMap();
		m.put("test", "test1");
		model.put("message", "index page");
		map.addAttribute("test",m);
		map.addAttribute("map", "map");
//		System.out.println(Thread.currentThread().getName());
//		ioc.test();
//		ioc.test();
		return "/view/NewFile";
	}
	
	@PostMapping("/test")
	public String test(@RequestBody Map<String, Object> data) {
		System.out.println("etst");
		System.out.println(data.get("value1").toString());
		return "tds";
	}
}