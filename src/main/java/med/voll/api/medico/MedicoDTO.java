package med.voll.api.medico;

import med.voll.api.endereco.EnderecoDTO;

public record MedicoDTO(
    String nome,
    String email,
    String crm,
    MedicoEspecialidadesEnum especialidade, 
    EnderecoDTO endereco
) {}