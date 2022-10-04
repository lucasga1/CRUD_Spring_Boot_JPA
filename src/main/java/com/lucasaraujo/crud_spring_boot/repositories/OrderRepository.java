package com.lucasaraujo.crud_spring_boot.repositories;

import com.lucasaraujo.crud_spring_boot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
