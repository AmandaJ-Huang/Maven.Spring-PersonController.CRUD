package person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class PersonConfig {
    private PersonRepository repository;

    @Autowired
    public PersonConfig(PersonRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void setup() {
        repository.save(new Person());
    }
}
