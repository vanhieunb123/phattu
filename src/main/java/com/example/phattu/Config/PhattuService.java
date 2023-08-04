package com.example.phattu.Config;

import com.example.phattu.modul.PhatTu;
import com.example.phattu.repository.PhatTuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PhattuService implements UserDetailsService {
    @Autowired
    private PhatTuRepo phatTuRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<PhatTu> phattu = phatTuRepo.findByEmail(email);

        return phattu.map(PhatTuUserdetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("user not found"+email));

    }
}
