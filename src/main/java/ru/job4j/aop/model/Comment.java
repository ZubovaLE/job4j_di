package ru.job4j.aop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Comment {
    private String comment;
    private String userName;

    @Override
    public String toString() {
        return "Comment{comment=%s, userName=%s}".formatted(comment, userName);
    }
}