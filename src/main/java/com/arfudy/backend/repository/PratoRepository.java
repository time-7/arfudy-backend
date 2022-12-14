package com.arfudy.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arfudy.backend.entity.Prato;

@Repository
public interface PratoRepository extends JpaRepository<Prato, Integer> {

}
