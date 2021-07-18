package br.com.desafio.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafio.apirest.domain.Person;
import br.com.desafio.apirest.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonRepository pessoaRepository;

	/**
	 * 
	 * Método responsável em listar todas as pessoas cadastradas no banco de dados
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 17/07/2021 10:58:58
	 */
	public List<Person> listPeople(){
		return pessoaRepository.listPeople();
	}
	
	/**
	 * 
	 * Método responsável em realizar a inclusão de uma pessoa no banco de dados
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 17/07/2021 10:59:01
	 */
	public Person savePerson(Person novaPessoa){
		return pessoaRepository.save(novaPessoa);
	}

	/**
	 * 
	 * Método responsável em alterar uma pessoa já existente no banco de dados
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 17/07/2021 10:59:04
	 */
	public Person updatePerson(Person novaPessoa, String id){
		novaPessoa.setId(id);
		return pessoaRepository.save(novaPessoa);
	}
	
	/**
	 * 
	 * Método responsável em realizar uma exclusão de uma pessoa no banco de dados
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 17/07/2021 10:59:07
	 */
	public void deletePerson(String id){
		pessoaRepository.listPeople(id);
	}
	
}
