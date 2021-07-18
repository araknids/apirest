package br.com.desafio.apirest.domain;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "Pessoa")
public class Pessoa {

	@DynamoDBHashKey
	private String cpf;
	
	@DynamoDBAttribute
	private String nome;
	
	@DynamoDBAttribute
	private Endereco end;
	
}
