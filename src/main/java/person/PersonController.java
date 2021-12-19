package person;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    @PostMapping (value = "/people")
    public Person createPerson(@RequestBody Person p) {
        return null;
    }

    @GetMapping (value = "/people/{id}")
    public Person getPerson(@PathVariable int id) {
        return null;
    }

    @GetMapping (value = "/people")
    public List<Person> getPersonList() {
        return new ArrayList<>();
    }

    @PutMapping (value = "/people/{id}")
    public Person updatePerson(@RequestBody Person p) {
        return null;
    }

    @DeleteMapping (value = "/people/{id}")
    public void deletePerson(@PathVariable int id) {

    }


}
