package za.co.duma.camelcsv.service;

import org.springframework.stereotype.Service;
import za.co.duma.camelcsv.model.Person;
import za.co.duma.camelcsv.repository.PersonRepository;

import java.util.List;

@Service("personService")
public class PersonService {

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public Person save(Person person) {
        repository.save(person);
        return person;
    }

    public List<Person> getAll() {
        return repository.findAll();
    }

}
