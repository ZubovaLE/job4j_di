package ru.job4j.di.lifecycle.config;

import org.springframework.context.annotation.ComponentScan;
import ru.job4j.di.lifecycle.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.job4j.di.lifecycle")
public class Config {
    @Bean(name = "myProduct",
            initMethod = "initMethod",
            destroyMethod = "destroyMethod"
    )
    public Product getProduct() {
        return new Product("Good Product", 2.5);
    }
}