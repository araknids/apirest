package br.com.desafio.apirest.repository;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;

import br.com.desafio.apirest.domain.Pessoa;

@EnableScan
public interface PessoaRepository {
	
	public List<Pessoa> listarPessoas();
	public Pessoa incluirPessoa(Pessoa novaPessoa);
	public Pessoa alterarPessoa(Pessoa novaPessoa, String cpf);
	public void excluirPessoa(String cpf);
	
}
