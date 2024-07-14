package med.voll.api.paciente;

import med.voll.api.endereco.EnderecoDTO;

public record PacienteCadastroDTO(
    String nome,
    String email,
    String telefone,
    String cpf,
    EnderecoDTO endereco
) {} 