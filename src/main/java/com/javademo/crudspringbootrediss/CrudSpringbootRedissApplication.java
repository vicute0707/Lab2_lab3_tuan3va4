package com.javademo.crudspringbootrediss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.javademo.crudspringbootrediss")

public class CrudSpringbootRedissApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudSpringbootRedissApplication.class, args);
    }

}
