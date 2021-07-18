package br.com.desafio.apirest.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;

import br.com.desafio.apirest.domain.Person;

@Service
public class PersonRepositoryImpl implements PersonRepository{
	
	@Autowired
	private DynamoDBMapper mapper;
	
	/**
	 * 
	 * Método responsável em listar todas as pessoas cadastradas no banco de dados
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 17/07/2021 11:06:31
	 */
	public List<Person> listPeople(){
		return mapper.scan(Person.class, new DynamoDBScanExpression());
	}
	
	/**
	 * 
	 * Método responsável em realizar a inclusão de uma pessoa no banco de dados
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 17/07/2021 11:06:36
	 */
	public Person save(Person pessoa){
		mapper.save(pessoa);
		return pessoa;
	}

	
	/**
	 * 
	 * Método responsável em realizar uma exclusão de uma pessoa no banco de dados 
	 * @author Rodrigo de Lima Horacio <rodrigo.horacio.contato@gmail.com>
	 * @since 17/07/2021 11:06:45
	 */
	public void listPeople(String id){
		mapper.delete(id);
	}

}
