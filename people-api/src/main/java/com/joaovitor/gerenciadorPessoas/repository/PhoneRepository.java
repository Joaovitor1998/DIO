package com.joaovitor.gerenciadorPessoas.repository;

import com.joaovitor.gerenciadorPessoas.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
