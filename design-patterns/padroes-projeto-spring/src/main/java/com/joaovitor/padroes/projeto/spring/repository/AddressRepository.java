package com.joaovitor.padroes.projeto.spring.repository;

import com.joaovitor.padroes.projeto.spring.model.Address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, String> {

}
