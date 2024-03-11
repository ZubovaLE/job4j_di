package ru.job4j.di.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet<Cat> {
    @Value("${cat.name}")
    private String name;

    @Override
    public String print() {
        return "Cat name = %s".formatted(name);
    }
}