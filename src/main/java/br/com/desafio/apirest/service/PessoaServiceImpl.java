package br.com.desafio.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafio.apirest.domain.Pessoa;
import br.com.desafio.apirest.repository.PessoaRepository;

@Service
public class PessoaServiceImpl implements PessoaService{
	
	@Autowired
	private PessoaRepository pessoaRepository;

	/**
	 * 
	 * Método responsável em listar todas as pessoas cadastradas no banco de dados
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 17/07/2021 10:58:58
	 */
	public List<Pessoa> listarPessoas(){
		return pessoaRepository.listarPessoas();
	}
	
	/**
	 * 
	 * Método responsável em realizar a inclusão de uma pessoa no banco de dados
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 17/07/2021 10:59:01
	 */
	public Pessoa incluirPessoa(Pessoa novaPessoa){
		return pessoaRepository.incluirPessoa(novaPessoa);
	}

	/**
	 * 
	 * Método responsável em alterar uma pessoa já existente no banco de dados
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 17/07/2021 10:59:04
	 */
	public Pessoa alterarPessoa(Pessoa novaPessoa, String cpf){
		return pessoaRepository.alterarPessoa(novaPessoa, cpf);
	}
	
	/**
	 * 
	 * Método responsável em realizar uma exclusão de uma pessoa no banco de dados
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 17/07/2021 10:59:07
	 */
	public void excluirPessoa(String cpf){
		pessoaRepository.excluirPessoa(cpf);
	}
	
}
