package med.voll.api.medico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

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
    public List<MedicoRetornoListaDTO> listar() {
        return repository
            .findAll()
            .stream()
            .map(MedicoRetornoListaDTO::new)
            .toList();
    }
    
}
