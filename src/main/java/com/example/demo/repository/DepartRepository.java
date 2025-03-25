package com.example.demo.repository;

import com.example.demo.model.Departs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartRepository extends JpaRepository<Departs, Long> {
}
