package com.example.demo.repository;

import com.example.demo.model.Vol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolRepository extends JpaRepository<Vol, Long> {
}
