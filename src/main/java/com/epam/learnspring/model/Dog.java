package com.epam.learnspring.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class Dog implements AnimalService {
    private String name;

    public Dog() {

    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
