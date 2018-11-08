/**
 * 
 */
package com.example.SpringBoot.Controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author searphimlyx
 *
 */
@ControllerAdvice
public class AdvciceController {
	/**
	 * 
	 */
	public AdvciceController() {
		// TODO Auto-generated constructor stub
	}
	
	@ExceptionHandler
	@InitBinder
	@ResponseBody
	public void ExceptionHandler(Exception ex) {
		System.out.println("execption");
		System.out.println(ex);
	}
	
}
