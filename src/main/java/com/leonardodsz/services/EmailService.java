package com.leonardodsz.services;


import com.leonardodsz.domain.Pedido;
import org.springframework.boot.autoconfigure.mail.MailSenderAutoConfiguration;

public interface EmailService {

    void sendOrderConfirmationEmail(Pedido obj);
    void sendEmail(MailSenderAutoConfiguration msg);
}
