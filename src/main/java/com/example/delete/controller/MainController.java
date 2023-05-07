package com.example.delete.controller;

import com.example.delete.dto.Film;
import com.example.delete.dto.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {


    @GetMapping("/")
    public String home(@RequestParam (name = "x") String name){
        return "hello " + name;
    }

    @PostMapping("/")
    public Film postQuery(@RequestBody Film film){
        film.setRating(0);
        return film;
    }
    @PostMapping("/new")
    public Person postPerson(@RequestBody Person person){

        return person;
    }

}
