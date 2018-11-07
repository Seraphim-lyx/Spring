/**
 * 
 */
package com.example.SpringBoot;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

/**
 * @author searphimlyx
 *
 */
@Aspect
@Configuration
public class AOPConfig {
	
	@Pointcut("execution(* com.example.SpringBoot.Controller.*.*(..))")
	public void controllerExecution() {
		
	}
	
	@Before("controllerExecution()")
	public void before() {
		System.out.println("run before");
	}
	
	
}
