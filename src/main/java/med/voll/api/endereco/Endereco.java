package med.voll.api.endereco;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.Embeddable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Endereco {
    
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String complemento;
    private String numero;

    public Endereco(EnderecoDTO endereco) {
        this.logradouro  = endereco.logradouro();
        this.bairro      = endereco.bairro();
        this.cep         = endereco.cep();
        this.cidade      = endereco.cidade();
        this.uf          = endereco.uf();
        this.complemento = endereco.complemento();
        this.numero      = endereco.numero();
    }


}
