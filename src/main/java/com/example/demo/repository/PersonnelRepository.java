package com.example.demo.repository;

import com.example.demo.model.Personnels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonnelRepository extends JpaRepository<Personnels, Long> {
}
