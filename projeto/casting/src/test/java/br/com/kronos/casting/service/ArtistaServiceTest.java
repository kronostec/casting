package br.com.kronos.casting.service;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.junit.Test;
import org.springframework.http.HttpStatus;

import br.com.kronos.casting.api.CastingWebTarget;

public class ArtistaServiceTest {

	@Test
	public void test() {
		WebTarget target = new CastingWebTarget();
		Response response = target.path("artista").request().get();
		assertEquals(HttpStatus.OK.value(), response.getStatus());
	}

}
