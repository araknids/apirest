package br.com.desafio.apirest.repository;

import java.util.List;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;

import br.com.desafio.apirest.domain.Person;

@EnableScan
public interface PersonRepository {
	
	public List<Person> listPeople();
	public Person save(Person pessoa);
	public void listPeople(String cpf);
	
}
