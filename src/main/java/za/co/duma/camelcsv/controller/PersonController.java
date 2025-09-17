package za.co.duma.camelcsv.controller;


import org.springframework.web.bind.annotation.*;
import za.co.duma.camelcsv.model.Person;
import za.co.duma.camelcsv.service.PersonService;

import java.util.List;


@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getAll() {
        return personService.getAll();
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        return personService.save(person);
    }
}
