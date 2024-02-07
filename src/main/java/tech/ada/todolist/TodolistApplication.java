package tech.ada.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tech.ada.todolist.controller.TodoController;

@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {

		SpringApplication.run(TodolistApplication.class, args);

	}

}
