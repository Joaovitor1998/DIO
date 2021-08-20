package com.joaovitor.gerenciadorPessoas.service;

import com.joaovitor.gerenciadorPessoas.dto.request.PersonDTO;
import com.joaovitor.gerenciadorPessoas.exception.PersonNotFoundException;
import com.joaovitor.gerenciadorPessoas.mapper.PersonMapper;
import com.joaovitor.gerenciadorPessoas.model.Person;
import com.joaovitor.gerenciadorPessoas.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person create(PersonDTO personDTO){
        Person personToSave = personMapper.toModel(personDTO);

        return personRepository.save(personToSave);
    }

    public List<PersonDTO> getPeople(){
        List<Person> allPeople = personRepository.findAll();
        return allPeople.stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PersonDTO getPersonById(Long id) throws PersonNotFoundException {
        Person person = findPersonById(id);
//        Optional<Person> personById = personRepository.findById(id);
//        if (personById.isEmpty()){
//            throw new PersonNotFoundException(id);
//        }
//        return personMapper.toDTO(personById.get());
        return personMapper.toDTO(person);
    }

    public void delete(Long id) throws PersonNotFoundException {
        findPersonById(id);
        personRepository.deleteById(id);
    }

    private Person findPersonById(Long id) throws PersonNotFoundException {
        return personRepository.findById(id).orElseThrow(()-> new PersonNotFoundException(id));
    }
}
