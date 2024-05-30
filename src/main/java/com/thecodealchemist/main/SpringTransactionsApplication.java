package com.thecodealchemist.main;

import com.thecodealchemist.main.service.ServiceHelper;
import com.thecodealchemist.main.service.TaskService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringTransactionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTransactionsApplication.class, args);
	}

	@Bean
	public ApplicationRunner applicationRunner(TaskService taskService,
											   ServiceHelper serviceHelper) {
		return args -> {
			taskService.saveTask("ToDO");
		};
	}

}
