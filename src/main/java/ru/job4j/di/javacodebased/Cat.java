package ru.job4j.di.javacodebased;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Cat {
    private String name;

    public static Cat createCat(String name) {
        Cat cat = new Cat();
        cat.name = name;
        return cat;
    }
}