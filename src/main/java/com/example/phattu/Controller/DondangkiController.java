package com.example.phattu.Controller;

import com.example.phattu.Sevices.DondangkiSevices;
import com.example.phattu.modul.DonDangKy;
import com.google.gson.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.time.LocalDate;

@RestController
@RequestMapping("/auth")

public class DondangkiController {
    @Autowired
    private DondangkiSevices dondangkyService;
    @PostMapping(value = "/themddk")
    public String themdondangky(@RequestBody String donDangKy)
    {
        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new JsonDeserializer<LocalDate>() {
            @Override
            public LocalDate deserialize(JsonElement json, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                return LocalDate.parse(json.getAsJsonPrimitive().getAsString());
            }
        }).create();

        DonDangKy donDangKy1 = gson.fromJson(donDangKy,DonDangKy.class);
        return dondangkyService.themdondangki(donDangKy1);
    }
    @DeleteMapping("/xoadondangki")
    public String xoadondangki(@RequestParam int dondangkyid)
    {
        return dondangkyService.xoadondangki(dondangkyid);
    }
    @PutMapping("/duyetdon")
    public String duyetdon(@RequestParam int donid,@RequestParam boolean xacnhanduyet)
    {
        return dondangkyService.duyetdon(donid, xacnhanduyet);
    }
}