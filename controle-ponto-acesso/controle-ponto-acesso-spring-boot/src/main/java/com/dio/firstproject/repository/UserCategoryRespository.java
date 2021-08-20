package com.dio.firstproject.repository;

import com.dio.firstproject.models.UserCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCategoryRespository extends JpaRepository<UserCategory, Long> {
}
