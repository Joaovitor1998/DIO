package com.joaovitor.padroes.projeto.spring.repository;

import com.joaovitor.padroes.projeto.spring.model.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
