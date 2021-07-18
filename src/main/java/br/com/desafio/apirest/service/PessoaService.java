package br.com.desafio.apirest.service;

import java.util.List;

import br.com.desafio.apirest.domain.Pessoa;

public interface PessoaService {
	
	public List<Pessoa> listarPessoas();
	public Pessoa incluirPessoa(Pessoa novaPessoa);
	public Pessoa alterarPessoa(Pessoa novaPessoa, String cpf);
	public void excluirPessoa(String cpf);

}
