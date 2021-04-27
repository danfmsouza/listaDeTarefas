package br.com.gabrielaedaniel.listaDeTarefas.controle;

import br.com.gabrielaedaniel.listaDeTarefas.modelo.Tarefa;
import br.com.gabrielaedaniel.listaDeTarefas.repositorio.TarefaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(value= "/listar")
public class TarefaController {

    @Autowired
    private TarefaRepo tarefaRepo;

    @GetMapping
    public List<Tarefa> findAll(){
        return tarefaRepo.findAll();
    }

    @PostMapping
    public Tarefa save(@Valid @NotNull @RequestBody Tarefa tarefa) {
        return tarefaRepo.save(tarefa);
    }

    @PutMapping
    public Tarefa update(@Valid @NotNull @RequestBody Tarefa tarefa) {
        return tarefaRepo.save(tarefa);
    }

    @DeleteMapping(value =  "/{id}")
    public void delete(@PathVariable Long id) {
        tarefaRepo.deleteById(id);
    }
}
