package com.example.phattu.Sevices.ISevi;

import com.example.phattu.modul.Chua;

import java.util.List;

public interface IChua {
    public String addchua(Chua chua);
    public String remake(Chua suachua);
    public String remove(int idchua);
    public List<Chua> timkiemtheoten(String ten);
}
