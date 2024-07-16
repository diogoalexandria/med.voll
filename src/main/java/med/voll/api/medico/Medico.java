package med.voll.api.medico;

import med.voll.api.endereco.Endereco;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Embedded;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "medicos")
@Entity(name = "Medico")
public class Medico {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;
    private String crm;

    @Enumerated(EnumType.STRING)
    private MedicoEspecialidadesEnum especialidade;

    @Embedded
    private Endereco endereco;

    public Medico(MedicoDTO medico) {
        this.nome          = medico.nome();
        this.email         = medico.email();
        this.telefone      = medico.telefone();
        this.crm           = medico.crm();
        this.especialidade = medico.especialidade();
        this.endereco      = new Endereco(medico.endereco());
    }

}
