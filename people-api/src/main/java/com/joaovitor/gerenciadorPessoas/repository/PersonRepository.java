package com.joaovitor.gerenciadorPessoas.repository;

import com.joaovitor.gerenciadorPessoas.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
