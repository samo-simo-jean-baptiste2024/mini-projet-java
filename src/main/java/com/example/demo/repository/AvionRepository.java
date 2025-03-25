package com.example.demo.repository;

import com.example.demo.model.Avions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvionRepository extends JpaRepository<Avions, Long> {
}
