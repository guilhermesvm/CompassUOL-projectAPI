package arc.gui.rest;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;


import org.junit.Test;



public class Serializador {

	@Test
	public void deveSalvarUsuarioUsandoMap() {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", "Devin");
		params.put("age", 23);
		
		given()
			.log().all()
			.contentType("application/json")
			.body(params)
		.when()
			.post("https://restapi.wcaquino.me/users")
		.then()
			.log().all()
			.statusCode(201)
			.body("id", is(notNullValue()))
			.body("name", is("Devin"))
			.body("age", is(23))
		;
	}
	
	@Test
	public void deveSalvarUsuarioUsandoObjeto() {
		User user = new User("Usuario objeto", 35);
		
		given()
			.log().all()
			.contentType("application/json")
			.body(user)
		.when()
			.post("https://restapi.wcaquino.me/users")
		.then()
			.log().all()
			.statusCode(201)
			.body("id", is(notNullValue()))
			.body("name", is("Usuario objeto"))
			.body("age", is(35))
		;
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void deveDeserializarObjetoAoSalvarUsuario() { //DESERIALIZADOR
		User user = new User("Usuario deserializado", 35);
		
		User usuarioInserido = 
		given()
			.log().all()
			.contentType("application/json")
			.body(user)
		.when()
			.post("https://restapi.wcaquino.me/users")
		.then()
			.log().all()
			.statusCode(201)
			.extract().body().as(User.class)
		;
		assertEquals("Usuario deserializado", usuarioInserido.getName());
		assertThat(usuarioInserido.getAge(), is(35));
		assertThat(usuarioInserido.getId(), notNullValue());
	}
}
