package com.tuncayekmez.springtodobackend.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Setter
@Getter
@Document(collection = "todos")
public class TodoEntity {
    @Id
    private String id;
    private String title;
    private String description;
    private boolean completed;
    public boolean getCompleted(){
        return completed;
    }
}
