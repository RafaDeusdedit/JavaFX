package br.com.raeldsm.GerenciamentoTarefas.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.raeldsm.GerenciamentoTarefas.models.Topico;

public interface TopicoRepository 
	extends CrudRepository<Topico, Integer> {

	
	
}
