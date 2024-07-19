package med.voll.api.medico;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid MedicoCadastroDTO cadastro) {
        System.out.println(cadastro);

        repository.save(new Medico(cadastro));
    }

    @GetMapping
    public Page<MedicoRetornoListaDTO> listar(Pageable pagination) {
        return repository
            .findAll(pagination)            
            .map(MedicoRetornoListaDTO::new);
    }
    
}
