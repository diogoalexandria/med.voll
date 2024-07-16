package med.voll.api.paciente;

import med.voll.api.endereco.EnderecoDTO;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PacienteDTO(

    @NotBlank
    String nome,

    @NotBlank
    @Email     
    String email,

    @NotBlank
    String telefone,

    @NotBlank
    @CPF
    String cpf,
    
    @NotNull
    @Valid
    EnderecoDTO endereco
    
) {} 