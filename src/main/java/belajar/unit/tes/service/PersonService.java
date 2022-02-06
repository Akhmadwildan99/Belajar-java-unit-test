package belajar.unit.tes.service;

import belajar.unit.tes.data.Person;
import belajar.unit.tes.repository.PersonRepository;

import java.util.UUID;

public class PersonService {
    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person get(String id){
        Person person = personRepository.selectById(id);
        if (person != null){
            return person;
        } else {
            throw new IllegalArgumentException("Person not foud");
        }
    }

    public Person register(String name){
        Person person = new Person(name, UUID.randomUUID().toString());
        personRepository.insert(person);
        return person;
    }
}
