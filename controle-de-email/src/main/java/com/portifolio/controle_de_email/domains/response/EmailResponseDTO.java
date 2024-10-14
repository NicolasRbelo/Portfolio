package com.portifolio.controle_de_email.domains.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmailResponseDTO {
    private String nome;
    private String email;
    private String numero;
    private String assunto;
    private String mensagem;


}
