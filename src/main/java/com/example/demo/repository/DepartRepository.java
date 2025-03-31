package com.example.demo.repository;

import com.example.demo.model.Depart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartRepository extends JpaRepository<Depart, Long> {
    @Query(value = "SELECT * FROM departs d JOIN vols v ON d.vol_id = v.id WHERE v.id = :id", nativeQuery = true)
    List<Depart> getDepartByVolId(@Param("id") Long id);
}
