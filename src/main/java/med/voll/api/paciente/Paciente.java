package med.voll.api.paciente;

import med.voll.api.endereco.Endereco;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Embedded;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "pacientes")
@Entity(name = "Paciente")
public class Paciente {   

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;
    private String cpf;

    @Embedded
    private Endereco endereco;

    public Paciente(PacienteDTO paciente) {
        this.nome     = paciente.nome();
        this.email    = paciente.email();
        this.telefone = paciente.telefone();
        this.cpf      = paciente.cpf();
        this.endereco = new Endereco(paciente.endereco());
    }

}
