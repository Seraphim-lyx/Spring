/**
 * 
 */
package com.example.SpringBoot.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author searphimlyx
 *
 */

@ControllerAdvice
public class GlobalException {
	
	public static final String DEFAULT_ERROR_MESSAGE = "Error";
	
	@ExceptionHandler(value = Exception.class)
	@ResponseStatus(HttpStatus.OK)
	public ModelAndView defaultError(HttpServletRequest request) throws Exception{
		
		System.out.println("error");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/error");
		mv.addObject("test", "test");
		return mv;
	}
	
	
}
