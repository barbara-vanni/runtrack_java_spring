package com.example.jour3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

//    @PostMapping
//    public Person createPerson(@RequestBody Person person) {
//        return personRepository.save(person);
//    }

    @GetMapping("/persons")
    public String showPersons(Model model) {

        List<Person> persons = personRepository.findAll();
        model.addAttribute("persons", persons);
        return "persons";
    }

//    @GetMapping("/name/{name}")
//    public List<Person> getPersonsByName(@PathVariable String name) {
//        return personRepository.findByName(name);
//    }
//
//    @GetMapping("/age/{age}")
//    public List<Person> getPersonsByAge(@PathVariable Integer age) {
//        return personRepository.findByAge(age);
//    }
//
//    @GetMapping("/name/{name}/age/{age}")
//    public List<Person> getPersonsByNameAndAge(@PathVariable String name, @PathVariable Integer age) {
//        return personRepository.findByNameAndAge(name, age);
//    }

}
