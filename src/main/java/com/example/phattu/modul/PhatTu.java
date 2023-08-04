package com.example.phattu.modul;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "phattu")
public class PhatTu  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phattuid")
    private int phattuid;
    @Column(name = "anhchup")
    private String anhchup;
    @Column(name = "dahoantuc")
    private boolean dahoantuc;
    @Column(name = "email")
    private String email;
    @Column(name = "gioitinh")
    private String gioitinh;
    @Column(name = "ho")
    private String ho;
    @Column(name = "ngaycapnhat")
    private LocalDate ngaycapnhat;
    @Column(name = "ngayhoantuc")
    private LocalDate ngayhoantuc;
    @Column(name = "ngaysinh")
    private LocalDate ngaysinh;
    @Column(name = "ngayxuatgia")
    private LocalDate ngayxuatgia;
    @Column(name = "password")
    private String password;
    @Column(name = "phapdanh")
    private String phapdanh;
    @Column(name = "sodienthoai")
    private String sodienthoai;
    @Column(name = "ten")
    private String ten;
    private String otp;
    private LocalDateTime localDateTime;
    @Column(name = "tendem")
    private String tendem;
    @Column(name = "chuaid",insertable = false,updatable = false)
    private int chuaid;
    @Column(name = "kieuthanhvienid",insertable = false,updatable = false)
    private int kieuthanhvienid;
    private String rootpassword;
    private boolean isActive;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "phatTu")
    @JsonManagedReference
    private Set<PhatTuDaoTrang> phatTuDaoTrangs;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "phatTu")
    @JsonManagedReference
    private Set<DonDangKy> donDangKIES;
    @ManyToOne
    @JoinColumn(name = "kieuthanhvienid")
    @JsonBackReference
    private KieuThanhVien kieuThanhVien;
    @ManyToOne
    @JoinColumn(name = "chuaid")
    @JsonIgnore
    private Chua chua;
    @OneToMany(fetch = FetchType.LAZY,mappedBy = "phatTu")
    @JsonManagedReference
    private Set<Token> tokens;
}
