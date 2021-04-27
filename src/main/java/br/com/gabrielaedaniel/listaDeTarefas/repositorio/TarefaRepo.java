package br.com.gabrielaedaniel.listaDeTarefas.repositorio;

import br.com.gabrielaedaniel.listaDeTarefas.modelo.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepo extends JpaRepository<Tarefa, Long> { }