package ru.job4j.di.annotation;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Dog implements Pet<Dog> {
    private String name = "Dog";

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String print() {
        return "Dog name = %s".formatted(name);
    }
}