package br.com.gabrielaedaniel.listaDeTarefas.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Tarefa {

    private Long id;
    @NotBlank
    private String titulo;
    private boolean feito;

    public Tarefa() {

    }

    public Tarefa(Long id, String titulo, boolean feito) {
        this.id = id;
        this.titulo = titulo;
        this.feito = feito;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isFeito() {
        return feito;
    }

    public void setFeito(boolean feito) {
        this.feito = feito;
    }
}
