package com.leonardodsz.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mail.MailSenderAutoConfiguration;

public class SmtpEmailService extends AbstractEmailService{

    @Autowired
    private MailSender mailSender;

    private static final Logger LOG = LoggerFactory.getLogger(SmtpEmailService.class);

    @Override
    public void sendEmail(MailSenderAutoConfiguration msg) {
        LOG.info("Enviando de e-mail...");
        mailSender.send(msg);
        LOG.info("E-mail enviado!");
    }
}
