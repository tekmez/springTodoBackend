package com.tuncayekmez.springtodobackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringTodoBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTodoBackendApplication.class, args);
    }

}
