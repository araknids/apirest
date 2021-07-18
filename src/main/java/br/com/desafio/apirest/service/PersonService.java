package br.com.desafio.apirest.service;

import java.util.List;

import br.com.desafio.apirest.domain.Person;

public interface PersonService {
	
	public List<Person> listPeople();
	public Person savePerson(Person novaPessoa);
	public Person updatePerson(Person novaPessoa, String cpf);
	public void deletePerson(String cpf);

}
