package com.example.phattu.repository;

import com.example.phattu.modul.DonDangKy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonDangKyRepo extends JpaRepository<DonDangKy,Integer> {
}
