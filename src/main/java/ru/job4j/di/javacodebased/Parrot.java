package ru.job4j.di.javacodebased;

import lombok.Getter;

@Getter
public class Parrot {
    private String name;

    public Parrot(String name) {
        this.name = name;
    }
}
