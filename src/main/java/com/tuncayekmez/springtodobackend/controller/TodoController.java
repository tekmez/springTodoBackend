package com.tuncayekmez.springtodobackend.controller;

import com.tuncayekmez.springtodobackend.entity.TodoEntity;
import com.tuncayekmez.springtodobackend.services.TodoService;
import jakarta.annotation.security.PermitAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<TodoEntity> getAllTodos() {
        return todoService.getAllTodos();
    }

    @PostMapping
    public TodoEntity createTodo(@RequestBody TodoEntity todoEntity) {
        return todoService.createTodo(todoEntity);
    }

    @PutMapping("updateTodo")
    public ResponseEntity<TodoEntity> updateTodo(@RequestBody TodoEntity todoEntity) {
        TodoEntity updateTodo = todoService.updateTodo(todoEntity);
        if (updateTodo != null) {
            return ResponseEntity.ok(updateTodo);
        }else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String id) {
        todoService.deleteTodoById(id);
        return ResponseEntity.noContent().build();
    }
}
