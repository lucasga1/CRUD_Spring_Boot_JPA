package com.lucasaraujo.crud_spring_boot.repositories;

import com.lucasaraujo.crud_spring_boot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
