package com.example.phattu.repository;

import com.example.phattu.modul.DaoTrang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DaoTrangRepo extends JpaRepository<DaoTrang,Integer> {
    Optional<DaoTrang> findByNoitochuc(String noitochuc);
}
