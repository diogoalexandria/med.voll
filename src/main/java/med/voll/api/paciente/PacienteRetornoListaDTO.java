package med.voll.api.paciente;

public record PacienteRetornoListaDTO(
    String nome,
    String email,
    String cpf
) {
    public PacienteRetornoListaDTO(Paciente paciente) {
        this(
            paciente.getNome(),
            paciente.getEmail(),
            paciente.getCpf()
        );
    }
} 