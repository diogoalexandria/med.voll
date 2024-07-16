package med.voll.api.paciente;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;
    
    @PostMapping
    public void cadastrar(@RequestBody PacienteDTO cadastro) {
        System.out.println(cadastro);

        repository.save(new Paciente(cadastro));
    }
    
}
