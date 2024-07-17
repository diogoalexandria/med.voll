package med.voll.api.medico;

public record MedicoRetornoListaDTO(
    String nome,
    String email,
    String crm,
    MedicoEspecialidadesEnum especialidade
) {
    public MedicoRetornoListaDTO (Medico medico) {
        this(
            medico.getNome(),
            medico.getEmail(),
            medico.getCrm(),
            medico.getEspecialidade()
        );
    }
} 