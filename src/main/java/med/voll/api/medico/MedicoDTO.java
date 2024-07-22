package med.voll.api.medico;

import med.voll.api.endereco.EnderecoDTO;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.NotBlank;

public record MedicoDTO(

    @NotBlank
    String nome,

    @NotBlank
    String email,

    @NotBlank
    String telefone,

    @NotBlank
    @Pattern(regexp = "\\d{4,6}")
    String crm,

    @NotNull
    MedicoEspecialidadesEnum especialidade,  

    @NotNull
    @Valid 
    EnderecoDTO endereco

) {}
