package com.tuncayekmez.springtodobackend.repository;

import com.tuncayekmez.springtodobackend.entity.TodoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoRepository extends MongoRepository<TodoEntity, String> {

}