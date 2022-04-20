package com.leonardodsz.services;

import org.springframework.mail.SimpleMailMessage;
import com.leonardodsz.domain.Pedido;

public interface EmailService {

    void sendOrderConfirmationEmail(Pedido obj);
    void sendEmail(SimpleMailMessage msg);
}
