package ru.job4j.di.javacodebased;

import jakarta.annotation.PreDestroy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Dog {
    private String name;

    public void postConstruct() {
        System.out.println("bean Dog method postConstruct()");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("bean Dog method preDestroy()");
    }
}