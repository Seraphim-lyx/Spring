package com.example.SpringBoot;

import java.util.concurrent.ThreadPoolExecutor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootApplication
@EnableJpaRepositories

@EnableAsync

public class Application {

	private static Logger logger = LoggerFactory.getLogger(Application.class);

	/**
	 * Customized ThreadPool
	 * @return executor instance
	 */
	@Bean
	public AsyncTaskExecutor taskExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		 // core thread #
        executor.setCorePoolSize(5);
        // max thread #
        executor.setMaxPoolSize(10);
        // queue size
        executor.setQueueCapacity(20);
        // thread alive duration
        executor.setKeepAliveSeconds(60);
        // default thread name
        executor.setThreadNamePrefix("Mytask-");
        // rejection strategy
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        // shutdown after take complete
        executor.setWaitForTasksToCompleteOnShutdown(true);

		return executor;
	}

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
		logger.error("log4j!");

	}
}
