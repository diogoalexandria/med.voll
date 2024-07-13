package med.voll.api.medico;

import med.voll.api.endereco.Endereco;

public record MedicoCadastroDTO(
    String nome,
    String email,
    String crm,
    MedicoEspecialidadesEnum especialidade, 
    Endereco endereco
) {}
