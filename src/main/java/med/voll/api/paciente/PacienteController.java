package med.voll.api.paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @Autowired
    private PagedResourcesAssembler<PacienteRetornoListaDTO> pagedResourcesAssembler;
    
    @PostMapping
    public void cadastrar(@RequestBody @Valid PacienteCadastroDTO cadastro) {
        System.out.println(cadastro);

        repository.save(new Paciente(cadastro));
    }

    @GetMapping
    public PagedModel<EntityModel<PacienteRetornoListaDTO>> listar(@PageableDefault(size=10, sort={"nome"}) Pageable pagination) {

        Page<PacienteRetornoListaDTO> page = repository.findAll(pagination).map(PacienteRetornoListaDTO::new);

        return pagedResourcesAssembler.toModel(page);
    }    
}
