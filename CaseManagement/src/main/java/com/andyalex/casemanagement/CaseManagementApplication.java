package com.andyalex.casemanagement;

import com.andyalex.casemanagement.entities.Task;
import com.andyalex.casemanagement.enums.TaskEnum;
import com.andyalex.casemanagement.enums.TaskPriorityEnum;
import com.andyalex.casemanagement.services.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CaseManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaseManagementApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadDataTask(final TaskService taskService) {

		return args -> {
			taskService.saveAllTask(List.of(
					Task.builder()
							.title("Instant transfer")
							.description("My description 1")
							.status(TaskEnum.WORKING_PROGRESS.ordinal())
							.priority(TaskPriorityEnum.HIGHEST.ordinal())
							.build(),

					Task.builder()
							.title("Auction values")
							.description("My description 5")
							.status(TaskEnum.WORKING_FINISHED.ordinal())
							.priority(TaskPriorityEnum.LOWEST.ordinal())
							.build(),

					Task.builder()
							.title("Handler BankAccount")
							.description("My description 4")
							.status(TaskEnum.WORKING_PROGRESS.ordinal())
							.priority(TaskPriorityEnum.HIGHEST.ordinal())
							.build(),

					Task.builder()
							.title("Account created")
							.description("My description 2")
							.status(TaskEnum.WORKING_PROGRESS.ordinal())
							.priority(TaskPriorityEnum.HIGHEST.ordinal())
							.build(),

					Task.builder()
							.title("PEA Withdraw")
							.description("My description 3")
							.status(TaskEnum.WORKING_STARTING.ordinal())
							.priority(TaskPriorityEnum.MEDIUM.ordinal())
							.build()

					));
		};
	}
}
