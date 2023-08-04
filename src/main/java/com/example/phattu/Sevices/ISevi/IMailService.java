package com.example.phattu.Sevices.ISevi;

import com.example.phattu.DTO.EmailDto;
import jakarta.mail.MessagingException;

public interface IMailService {
    void sendHtmlMail(EmailDto dataMail, String templateName) throws MessagingException;

}
