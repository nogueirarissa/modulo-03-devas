package tech.ada.todolist.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tech.ada.todolist.domain.ToDoItem;
import tech.ada.todolist.repository.TodoItemRepository;

import java.util.List;

@RestController("/todo")
public class TodoController {

    private final TodoItemRepository todoItemRepository;

    public TodoController(TodoItemRepository todoItemRepository){
        this.todoItemRepository = todoItemRepository;
    }

    @GetMapping("/todo-item")
    public List <ToDoItem> buscarTodos(){
        return todoItemRepository.findAll();
    }

    @PostMapping("/todo-item")
    public void cadastrarItem(@RequestBody ToDoItem toDoItem){
        todoItemRepository.save(toDoItem);
    }
}
