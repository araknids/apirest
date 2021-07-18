package br.com.desafio.apirest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.apirest.domain.Endereco;
import br.com.desafio.apirest.domain.Pessoa;
import br.com.desafio.apirest.service.PessoaService;

@RestController
@RequestMapping("pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;
	
	/**
	 * 
	 * Método responsável em listar todas as pessoas cadastradas no banco de dados 
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 16/07/2021 17:36:00
	 */
	@GetMapping("listar")
	public List<Pessoa> listarPessoas(){
//		List<Pessoa> listamock = new ArrayList<>();
//		Pessoa p = new Pessoa();
//		p.setNome("rodrgo");
//		p.setCpf("123123");
//		p.setEnd(new Endereco("rua 1", "chavantes"));
//		listamock.add(p);
//		return listamock;
		return pessoaService.listarPessoas();
	}
	
	/**
	 * 
	 * Método responsável em realizar a inclusão de uma pessoa no banco de dados 
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 16/07/2021 17:32:44
	 */
	@PostMapping("incluir")
	public Pessoa incluirPessoa(@RequestBody Pessoa novaPessoa){
		return pessoaService.incluirPessoa(novaPessoa);
	}

	/**
	 * 
	 * Método responsável em alterar uma pessoa já existente no banco de dados
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 17/07/2021 10:47:45
	 */
	@PostMapping("alterar/{cpf}")
	public Pessoa alterarPessoa(@RequestBody Pessoa novaPessoa, @PathVariable String cpf){
		return pessoaService.alterarPessoa(novaPessoa, cpf);
	}
	
	/**
	 * 
	 * Método responsável em realizar uma exclusão de uma pessoa no banco de dados
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 17/07/2021 10:59:37
	 */
	@PostMapping("excluir/{cpf}")
	public void excluirPessoa(@PathVariable String cpf){
		pessoaService.excluirPessoa(cpf);
	}
}
