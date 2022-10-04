package com.lucasaraujo.crud_spring_boot.repositories;

import com.lucasaraujo.crud_spring_boot.entities.Category;
import com.lucasaraujo.crud_spring_boot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
