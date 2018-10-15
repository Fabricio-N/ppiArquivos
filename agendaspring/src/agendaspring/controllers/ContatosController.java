package agendaspring.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import agendaspring.daos.ContatoDAO;
import agendaspring.models.Contato;

@Controller
public class ContatosController {
	
	@RequestMapping("/contatos/form")
	public String form() {
		System.out.println("Chamou o meu método");
		return "contatos/form";
	}
	
	@PostMapping("/contatos")
	public String adicionar(Contato contato) {
		System.out.println("Chamou o método de adicionar");
		ContatoDAO contatoDao = new ContatoDAO();
		contatoDao.inserir(contato);
		return "contatos/ok";
	}
	
	@GetMapping("/contatos")
	public ModelAndView listar( ) {
		System.out.println("Chamou o metódo de listagem");
		ContatoDAO contatoDao = new ContatoDAO();
		List<Contato> lista = contatoDao.getLista();
		ModelAndView model = new ModelAndView("contatos/lista");
		model.addObject("contatos", lista);
		return model;
	}

}
