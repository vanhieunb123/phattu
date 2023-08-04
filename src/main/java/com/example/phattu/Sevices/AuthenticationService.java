package com.example.phattu.Sevices;

import com.example.phattu.Util.EmailUtil;
import com.example.phattu.Util.OtpUtil;
import com.example.phattu.repository.PhatTuRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private PhatTuRepo phatTuRepo;
    private final JwtService jwtService;
    private final EmailUtil emailUtil;
    private final OtpUtil otpUtil;

}
