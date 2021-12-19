package io.zipcoder.crudapp.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    private PersonRepository repository;

    @Autowired
    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public Person create(Person person) {
        return repository.save(person);
    }

    public Person findById(Long id) {
        return repository.findById(id).get();
    }

    public List<Person> findAll() {
        Iterable<Person> allPeople = repository.findAll();
        List<Person> personList = new ArrayList<>();
        allPeople.forEach(personList::add);
        return personList;
    }

    public Person update(Long id, Person newData) {
        Person personInDatabase = this.findById(id);
        personInDatabase.setFirstName(newData.getFirstName());
        personInDatabase.setLastName(newData.getLastName());
        personInDatabase = repository.save(personInDatabase);
        return personInDatabase;
    }

    public Person deleteById(Long id) {
        Person personToBeDeleted = this.findById(id);
        repository.delete(personToBeDeleted);
        return personToBeDeleted;
    }
}
