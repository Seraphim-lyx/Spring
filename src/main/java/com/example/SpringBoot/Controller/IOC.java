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
public class IOC implements IOCInterface {
	public void test() {
		System.out.println("IOC TEST");
	}
}
