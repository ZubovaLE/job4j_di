package ru.job4j.di.annotation;

import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan(basePackages = "ru.job4j.di.annotation")
@PropertySource("classpath:application.properties")
public class Config {

    @Bean
    @Primary
    @Order(11)
    public Dog getAlfaDog() {
        return new Dog("AlfaDog");
    }

    @Bean(name = "SecondDog")
    @Order(3)
    public Dog getDog() {
        return new Dog("Second Dog");
    }

    @Bean
    @Order(5)
    public Dog someDog() {
        return new Dog("Dog");
    }

    @Bean
    @Order(2)
    public Dog lastDog() {
        return new Dog("Last Dog");
    }
}