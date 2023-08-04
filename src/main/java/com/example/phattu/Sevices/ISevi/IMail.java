package com.example.phattu.Sevices.ISevi;

import jakarta.mail.MessagingException;

public interface IMail {
    Boolean create(String emailAdress) throws MessagingException;
}
