package br.com.raeldsm.GerenciamentoTarefas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.raeldsm.GerenciamentoTarefas.models.Topico;
import br.com.raeldsm.GerenciamentoTarefas.repositories.TopicoRepository;

@Controller
public class TopicoController {

	@Autowired
	private TopicoRepository er;
	
	@RequestMapping(value ="/topicos", method = RequestMethod.GET)
	public String form() {
		
		return "main";
	}

	@RequestMapping(value="/topicos", method =RequestMethod.POST)
	public String form(Topico topico) {
		
		er.save(topico);
		return "redirect:/topicos";
	}
}
