package com.tuncayekmez.springtodobackend.services;
import com.tuncayekmez.springtodobackend.entity.TodoEntity;
import com.tuncayekmez.springtodobackend.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<TodoEntity> getAllTodos() {
        return todoRepository.findAll();
    }

    public TodoEntity createTodo(TodoEntity todoEntity) {
        return todoRepository.save(todoEntity);
    }

    public TodoEntity updateTodo(TodoEntity todoEntity) {
        TodoEntity oldTodo = todoRepository.findById(todoEntity.getId()).orElse(null);
        if (oldTodo != null) {
            oldTodo.setTitle(todoEntity.getTitle());
            oldTodo.setDescription(todoEntity.getDescription());
            oldTodo.setCompleted(todoEntity.getCompleted());
            return todoRepository.save(oldTodo);
        }
        return null;
    }

    public void deleteTodoById(String id) {
        todoRepository.deleteById(id);
    }
}
