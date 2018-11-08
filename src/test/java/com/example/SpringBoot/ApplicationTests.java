package com.example.SpringBoot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@EnableAsync
public class ApplicationTests{

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ThreadPoolTaskExecutor executor;
	
	@Test
	public void contextLoads() {
		logger.info(executor.getThreadNamePrefix());
	}

}
