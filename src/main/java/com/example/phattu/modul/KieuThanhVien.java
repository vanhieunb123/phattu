package com.example.phattu.modul;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "kieuthanhviens")
public class KieuThanhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kieuthanhvienid")
    private int kieuthanhvienid;
    @Column(name = "code")
    private String code;
    @Column(name = "tenkieu")
    private String tenkieu;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "kieuThanhVien")
    @JsonManagedReference
    private  Set<PhatTu> phatTus;



}

