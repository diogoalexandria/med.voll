package med.voll.api.medico;

public record MedicoRetornoListaDTO(

    Long id,

    String nome,

    String email,

    String crm,

    MedicoEspecialidadesEnum especialidade
    
) {
    public MedicoRetornoListaDTO (Medico medico) {
        this(
            medico.getId(),
            medico.getNome(),
            medico.getEmail(),
            medico.getCrm(),
            medico.getEspecialidade()
        );
    }
} 