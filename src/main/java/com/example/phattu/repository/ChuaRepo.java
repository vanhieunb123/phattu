package com.example.phattu.repository;

import com.example.phattu.modul.Chua;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChuaRepo extends JpaRepository<Chua,Integer> {
    Optional<Chua> findByTenchua(String ten);
}