package ru.job4j.di.javacodebased;

import lombok.Getter;

@Getter
public class Canary {
    private String name;

    public Canary(String name) {
        this.name = name;
    }
}