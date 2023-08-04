package com.example.phattu.modul;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "dondangkys")
public class DonDangKy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dondangkyid")
    private int dondangkyid;
    @Column(name = "ngayguidon")
    private LocalDate ngayguidon;
    @Column(name = "ngayxuly")
    private LocalDate ngayxuly;
    @Column(name = "nguoixuly")
    private int nguoixuly;
    @Column(name = "trangthaidon")
    private int trangthaidon;
    @Column(name = "daotrangid",insertable = false,updatable = false)
    private int daotrangid;
    @Column(name = "phattuid",insertable = false,updatable = false)
    private int phattuid;
    @ManyToOne
    @JoinColumn(name = "daotrangid")
    @JsonBackReference
    private DaoTrang daoTrang;
    @ManyToOne
    @JoinColumn(name = "phattuid")
    @JsonBackReference
    private PhatTu phatTu;


}
