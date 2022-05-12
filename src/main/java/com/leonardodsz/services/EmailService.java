package com.leonardodsz.services;

import org.springframework.mail.SimpleMailMessage;
import com.leonardodsz.domain.Pedido;
import com.leonardodsz.domain.Cliente;

public interface EmailService {

    void sendOrderConfirmationEmail(Pedido obj);

    void sendEmail(SimpleMailMessage msg);

    default void sendNewPasswordEmail(Cliente cliente, String newPass) {

    }
}
