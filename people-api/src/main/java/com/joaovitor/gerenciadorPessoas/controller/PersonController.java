package com.joaovitor.gerenciadorPessoas.controller;

import com.joaovitor.gerenciadorPessoas.dto.request.PersonDTO;
import com.joaovitor.gerenciadorPessoas.exception.PersonNotFoundException;
import com.joaovitor.gerenciadorPessoas.model.Person;
import com.joaovitor.gerenciadorPessoas.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/people")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public Person createPerson(@RequestBody @Valid PersonDTO personDTO){
        return personService.create(personDTO);
    }

    @GetMapping
    public List<PersonDTO> getPeople(){
        return personService.getPeople();
    }

    @GetMapping("/{id}")
    public PersonDTO getPersonById(@PathVariable Long id) throws PersonNotFoundException {
        return personService.getPersonById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws PersonNotFoundException {
        personService.delete(id);
    }
}
