package com.portifolio.controle_de_email.domains.services;

import com.portifolio.controle_de_email.domains.response.EmailResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements EmailServiceInterface {

    @Autowired
    private JavaMailSender mailSender;

    public void enviarEmail(EmailResponseDTO emailDTO) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("nicolas.ramelo@gmail.com");
        message.setSubject(emailDTO.getAssunto());
        message.setText("Nome: " + emailDTO.getNome() + "\n" +
                "Email: " + emailDTO.getEmail() + "\n" +
                "Número: " + emailDTO.getNumero() + "\n\n" +
                "Mensagem: " + emailDTO.getMensagem());

        mailSender.send(message);
    }
}
