package com.lucasaraujo.crud_spring_boot.repositories;

import com.lucasaraujo.crud_spring_boot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
