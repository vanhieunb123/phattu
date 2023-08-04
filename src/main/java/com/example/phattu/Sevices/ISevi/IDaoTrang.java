package com.example.phattu.Sevices.ISevi;

import com.example.phattu.modul.DaoTrang;

import java.util.List;

public interface IDaoTrang {
    public String addDaoTrang(DaoTrang daoTrang);
    public String remake(DaoTrang suadaotrang);
    public String remove(int iddaotrang);
    public List<DaoTrang> timkiemtheonoitochuc(String noitochua);
}
