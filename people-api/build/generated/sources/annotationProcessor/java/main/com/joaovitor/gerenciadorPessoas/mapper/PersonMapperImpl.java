package com.joaovitor.gerenciadorPessoas.mapper;

import com.joaovitor.gerenciadorPessoas.dto.request.PersonDTO;
import com.joaovitor.gerenciadorPessoas.model.Person;
import com.joaovitor.gerenciadorPessoas.model.Phone;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-07T04:17:25-0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.1.1.jar, environment: Java 16.0.2 (Oracle Corporation)"
)
public class PersonMapperImpl implements PersonMapper {

    @Override
    public Person toModel(PersonDTO personDTO) {
        if ( personDTO == null ) {
            return null;
        }

        Person person = new Person();

        person.setBirthDate( personDTO.getBirthDate() );
        person.setId( personDTO.getId() );
        person.setFirstName( personDTO.getFirstName() );
        person.setLastName( personDTO.getLastName() );
        person.setCpf( personDTO.getCpf() );
        List<Phone> list = personDTO.getPhones();
        if ( list != null ) {
            person.setPhones( new ArrayList<Phone>( list ) );
        }

        return person;
    }

    @Override
    public PersonDTO toDTO(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDTO personDTO = new PersonDTO();

        personDTO.setId( person.getId() );
        personDTO.setFirstName( person.getFirstName() );
        personDTO.setLastName( person.getLastName() );
        personDTO.setCpf( person.getCpf() );
        personDTO.setBirthDate( person.getBirthDate() );
        List<Phone> list = person.getPhones();
        if ( list != null ) {
            personDTO.setPhones( new ArrayList<Phone>( list ) );
        }

        return personDTO;
    }
}
