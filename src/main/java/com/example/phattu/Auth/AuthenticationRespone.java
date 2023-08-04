package com.example.phattu.Auth;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthenticationRespone {
    private String email;
    private String token;
}
