package tech.ada.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.ada.todolist.domain.ToDoItem;

@Repository
public interface TodoItemRepository extends JpaRepository <ToDoItem,Long> {

}
