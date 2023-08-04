package com.example.phattu.modul;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chua")
public class Chua  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chuaid")
    private int chuaid;
    @Column(name = "capnhat")
    private Date capnhat;
    @Column(name = "diachi")
    private String diachi;
    @Column(name = "ngaythanhlap")
    private Date ngaythanhlap;
    @Column(name = "tenchua")
    private String tenchua;
    @Column(name = "trutri")
    private int trutri;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "chua",cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
    private Set<PhatTu> phatTus;

}
