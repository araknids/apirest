package br.com.desafio.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.apirest.domain.Person;
import br.com.desafio.apirest.service.PersonService;

@RestController
@RequestMapping("person")
public class PersonController {
	
	@Autowired
	private PersonService pessoaService;
	
	/**
	 * 
	 * Método responsável em listar todas as pessoas cadastradas no banco de dados 
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 16/07/2021 17:36:00
	 */
	@GetMapping("list")
	public List<Person> listPeople(){
//		List<Pessoa> listamock = new ArrayList<>();
//		Pessoa p = new Pessoa();
//		p.setNome("rodrgo");
//		p.setCpf("123123");
//		p.setEnd(new Endereco("rua 1", "chavantes"));
//		listamock.add(p);
//		return listamock;
		return pessoaService.listPeople();
	}
	
	/**
	 * 
	 * Método responsável em realizar a inclusão de uma pessoa no banco de dados 
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 16/07/2021 17:32:44
	 */
	@PostMapping("save")
	public Person savePerson(@RequestBody Person newPerson){
		return pessoaService.savePerson(newPerson);
	}

	/**
	 * 
	 * Método responsável em alterar uma pessoa já existente no banco de dados
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 17/07/2021 10:47:45
	 */
	@PostMapping("update/{id}")
	public Person updatePerson(@RequestBody Person newPerson, @PathVariable String id){
		return pessoaService.updatePerson(newPerson, id);
	}
	
	/**
	 * 
	 * Método responsável em realizar uma exclusão de uma pessoa no banco de dados
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 17/07/2021 10:59:37
	 */
	@PostMapping("delete/{cpf}")
	public void deletePerson(@PathVariable String id){
		pessoaService.deletePerson(id);
	}
}
