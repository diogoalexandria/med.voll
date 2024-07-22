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

    public void atualizar(EnderecoDTO enderecoAtualizacao) {
        if (enderecoAtualizacao.logradouro() != null) {
            this.logradouro = enderecoAtualizacao.logradouro();
        }

        if (enderecoAtualizacao.bairro() != null) {
            this.bairro = enderecoAtualizacao.bairro();
        }

        if (enderecoAtualizacao.cep() != null) {
            this.cep = enderecoAtualizacao.cep();
        }

        if (enderecoAtualizacao.cidade() != null) {
            this.cidade = enderecoAtualizacao.cidade();
        }

        if (enderecoAtualizacao.uf() != null) {
            this.uf = enderecoAtualizacao.uf();
        }

        if (enderecoAtualizacao.complemento() != null) {
            this.complemento = enderecoAtualizacao.complemento();
        }
    
        if (enderecoAtualizacao.numero() != null) {
            this.numero = enderecoAtualizacao.numero();
        }
    }
}
