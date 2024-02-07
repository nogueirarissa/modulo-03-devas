package tech.ada.todolist.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ToDoItem {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private String titulo;

    private String descricao;

    private Boolean concluido;

    private LocalDateTime dateAndTime;
}
