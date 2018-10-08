package agendaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import agendaspring.models.Contato;

@Controller
public class ContatosController {
	
	@RequestMapping("/contatos/form")
	public String form() {
		System.out.println("Chamou o meu método");
		return "contatos/form";
	}
	
	@RequestMapping("/contatos")
	public String adicionar(Contato contato) {
		System.out.println("Chamou o método de adicionar");
		System.out.println("Nome: " + contato.getNome());
		System.out.println("Email: " + contato.getEmail());
		System.out.println("Endereço: " + contato.getEndereco());
		System.out.println("Data de Nascimento: " + contato.getDataNascimento());
		return "contatos/ok";
	}

}
