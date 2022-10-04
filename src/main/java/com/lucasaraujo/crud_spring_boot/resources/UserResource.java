package com.lucasaraujo.crud_spring_boot.resources;

import com.lucasaraujo.crud_spring_boot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Lucas Araujo", "lucas@gmail.com", "99762-8182", "123456");
        return ResponseEntity.ok().body(u);
    }
}
