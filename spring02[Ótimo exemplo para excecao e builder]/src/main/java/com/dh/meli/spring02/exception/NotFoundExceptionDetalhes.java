package com.dh.meli.spring02.exception;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data // Resume os métodos getters, setters, toString...
@Builder // @NoArgsConstructor e @AllArgsContructor tratam tudo ou nada,
// o builder serve para criar objetos sem criar o construtor
// para usar basta passar o nome da clasee .builder().build()
// Exemplo NotFoundExceptionDetalhes nf = NotFoundExceptionDetalhes.builder()
//                                          .mensagem("TESTE")
//                                          .status(34)
//                                          .titulo("titulo")
//                                          .build();
// Logo é possível fazer várias combinações


public class NotFoundExceptionDetalhes {
    private String titulo;
    private int status;
    private String mensagem;
    private LocalDateTime timestamp;


}
