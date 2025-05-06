package com.example.jour3;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {


    // Custom query methods
    List<Person> findByName(String name);
    List<Person> findByAge(Integer age);
    List<Person> findByNameAndAge(String name, Integer age);
}
