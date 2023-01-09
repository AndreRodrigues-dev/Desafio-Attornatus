package com.api.gerenciadorpessoas.DTOS;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public class PessoaDTO {
    @NotBlank
    private String nome;
    @NotBlank
    private LocalDate dataNascimento;

}
