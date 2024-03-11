package ru.job4j.di.annotation;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class Man {

    @Autowired
    private Dog dog;

    @Autowired
    @Qualifier("SecondDog")
    private Dog secondDog;

    @Resource(name = "someDog")
    private Dog someDog;

    private final Cat cat;
    private Bird bird;

    @Autowired
    private Set<Pet> pets;

    @Autowired
    private List<Pet<Dog>> dogs;

    @Autowired
    private Map<String, Pet> mapPets;

    @Autowired
    public Man(Cat cat) {
        this.cat = cat;
    }

    @Autowired
    public void setBird(Bird bird) {
        this.bird = bird;
    }

    public void print() {
        System.out.printf("My Dog: %s%n", dog.print());
        System.out.printf("My second dog: %s%n", secondDog.print());
        System.out.printf("Some dog: %s%n", someDog.print());
        System.out.printf("My Cat: %s%n", cat.print());
        System.out.printf("My Bird: %s%n", bird.print());

        System.out.println("pets:");
        pets.forEach(s -> System.out.println(s.print()));
        System.out.println("dogs:");
        dogs.forEach(s -> System.out.println(s.print()));
        System.out.println("mapDogs:");
        mapPets.forEach((key, value) -> System.out.printf("%s - %s%n", key, value.print()));
    }
}