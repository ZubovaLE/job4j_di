package ru.job4j.di;

import ru.job4j.di.model.StartUI;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextByJavaBasedConfig {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext("ru.job4j.di.model");
        var ui = context.getBean(StartUI.class);
        ui.add("Lyubov");
        ui.add("Ivan");
        ui.print();
    }
}
