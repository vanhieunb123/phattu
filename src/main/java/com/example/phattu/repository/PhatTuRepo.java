package com.example.phattu.repository;

import com.example.phattu.modul.PhatTu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PhatTuRepo extends JpaRepository<PhatTu,Integer> {
    Optional<PhatTu> findByEmail(String username);
    Optional<PhatTu> findByTenContains(String ten);
}
