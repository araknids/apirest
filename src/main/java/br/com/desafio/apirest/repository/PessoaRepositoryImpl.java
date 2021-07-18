package br.com.desafio.apirest.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;

import br.com.desafio.apirest.domain.Pessoa;

@Service
public class PessoaRepositoryImpl implements PessoaRepository{
	
	@Autowired
	private DynamoDBMapper mapper;
	
	/**
	 * 
	 * Método responsável em listar todas as pessoas cadastradas no banco de dados
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 17/07/2021 11:06:31
	 */
	public List<Pessoa> listarPessoas(){
		return mapper.scan(Pessoa.class, new DynamoDBScanExpression());
	}
	
	/**
	 * 
	 * Método responsável em realizar a inclusão de uma pessoa no banco de dados
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 17/07/2021 11:06:36
	 */
	public Pessoa incluirPessoa(Pessoa novaPessoa){
		mapper.save(novaPessoa);
		return novaPessoa;
	}

	/**
	 * 
	 * Método responsável em alterar uma pessoa já existente no banco de dados
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 17/07/2021 11:06:38
	 */
	public Pessoa alterarPessoa(Pessoa novaPessoa, String cpf){
		Pessoa pessoa = mapper.load(Pessoa.class, cpf);
		mapper.save(pessoa);
		return pessoa;
	}
	
	/**
	 * 
	 * Método responsável em realizar uma exclusão de uma pessoa no banco de dados 
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 17/07/2021 11:06:45
	 */
	public void excluirPessoa(String cpf){
		mapper.delete(cpf);
	}

}
