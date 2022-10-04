package com.lucasaraujo.crud_spring_boot.repositories;

import com.lucasaraujo.crud_spring_boot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
