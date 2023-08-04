package com.example.phattu.Sevices.ISevi;

import com.example.phattu.modul.DonDangKy;

public interface IDondangki {
    public String themdondangki(DonDangKy dondangkythem);
    public String xoadondangki(int dondangkiid);
    public String duyetdon(int donid,boolean xacnhanduyet);
}
