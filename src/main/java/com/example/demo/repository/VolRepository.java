package com.example.demo.repository;

import com.example.demo.model.Vols;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VolRepository extends JpaRepository<Vols, Long> {
}
