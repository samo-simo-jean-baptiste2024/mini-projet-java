package com.example.demo.repository;

import com.example.demo.model.Passagers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassagerRepository extends JpaRepository<Passagers, Long> {
}
