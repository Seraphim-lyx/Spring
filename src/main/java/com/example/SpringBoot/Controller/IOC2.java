/**
 * 
 */
package com.example.SpringBoot.Controller;

import org.springframework.stereotype.Repository;

/**
 * @author searphimlyx
 *
 */
@Repository
public class IOC2 implements IOCInterface{
	public void test() {
		System.out.println("IOC2 test");
	}
}
