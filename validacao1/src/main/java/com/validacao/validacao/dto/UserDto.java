package com.validacao.validacao.dto;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class UserDto {
    @Pattern(regexp = "[A-Z][a-záàâãéèêíïóôõöúçñ/s]+", message = "O nome do aluno deve começar com letra maiúscula.")
    private String name;

    // Notblank é necessário, pois só com o email ele aceita o null
    @NotBlank(message = "O email é obrigatório!S")
    @Email(message = "Coé rapaz, coloca um email válido aí!")
    private String email;

    @Min(value = 18, message = "Novinho demais para o jogo!")
    @Max(value = 50, message = "Velho demais para o jogo!")
    private int idade;
}
