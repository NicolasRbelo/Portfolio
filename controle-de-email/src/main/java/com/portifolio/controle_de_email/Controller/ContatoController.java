package com.portifolio.controle_de_email.Controller;


import com.portifolio.controle_de_email.domains.response.EmailResponseDTO;
import com.portifolio.controle_de_email.domains.services.EmailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contato")
public class ContatoController {

    private final EmailService emailService;

    public ContatoController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/enviar")
    public ResponseEntity<String> enviarMensagem(@RequestBody EmailResponseDTO contato) {
        emailService.enviarEmail(contato);
        return ResponseEntity.ok("Mensagem enviada com sucesso!");
    }
}
