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
@RequestMapping("/contatos")
public class ContatosController {

	@RequestMapping("/form")
	public String form() {
		System.out.println("Chamou o meu m�todo");
		return "contatos/form";
	}

	@PostMapping
	public String adicionar(Contato contato) {
		System.out.println("Chamou o m�todo de adicionar");
		ContatoDAO contatoDao = new ContatoDAO();
		contatoDao.inserir(contato);
		return "redirect:contatos";
	}

	@GetMapping
	public ModelAndView listar() {
		System.out.println("Chamou o met�do de listagem");
		ContatoDAO contatoDao = new ContatoDAO();
		List<Contato> lista = contatoDao.getLista();
		ModelAndView model = new ModelAndView("contatos/lista");
		model.addObject("contatos", lista);
		return model;
	}

	@RequestMapping("/remover")
	public String remover(Contato contato) {
		System.out.println("Chamou o m�todo remover");
		ContatoDAO contatoDao = new ContatoDAO();
		contatoDao.remover(contato);
		return "redirect:../contatos";

	}
	
	@RequestMapping("/selecionar")
	public ModelAndView selecionar(Contato contato) {
		ContatoDAO contatoDAO = new ContatoDAO();
		contato = contatoDAO.getById(contato.getId());
		
		ModelAndView model = new ModelAndView("contatos/form-alterar"); 
		model.addObject("contato", contato);
		return model;
	}
	
	@PostMapping("/alterar")
	public String alterar(Contato contato) {
		System.out.println("Chamou o m�todo alterar");
		ContatoDAO contatoDAO = new ContatoDAO();
		contatoDAO.alterar(contato);
		return "redirect:../contatos";
	}

}
