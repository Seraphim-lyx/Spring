/**
 * 
 */
package com.example.SpringBoot.Controller;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

/**
 * @author searphimlyx
 *
 */

@Repository
@Primary
//@Scope("prototype")
@Async
public class IOC implements IOCInterface{
	
	private Integer test = 1;
	public void test() {
			while(true) {
				LoggerFactory.getLogger(this.getClass()).info(Thread.currentThread().getName());
				try {
					Thread.currentThread().sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

	}

}
