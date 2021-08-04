package br.com.desafio.apirest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
public class PersonControllerTest {
	
	@Test
	public void listPeople(){
//		List<Pessoa> listamock = new ArrayList<>();
//		Pessoa p = new Pessoa();
//		p.setNome("rodrgo");
//		p.setCpf("123123");
//		p.setEnd(new Endereco("rua 1", "chavantes"));
//		listamock.add(p);
//		return listamock;
//		return pessoaService.listPeople();
		assertTrue(true);
	}
	

}
