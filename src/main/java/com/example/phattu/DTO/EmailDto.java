package com.example.phattu.DTO;

import lombok.Data;

import java.util.Map;

@Data
public class EmailDto {
    private String to;
    private String subject;
    private String text;
    private Map<String, Object> props;

}
