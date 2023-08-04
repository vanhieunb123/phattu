package com.example.phattu.repository;


import com.example.phattu.modul.KieuThanhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KieuThanhVienRepo extends JpaRepository<KieuThanhVien,Integer> {
}
