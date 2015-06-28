package br.com.kronos.casting.target;

import java.net.URI;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

public class CastingWebTarget implements WebTarget {

	private static final String ENDERECO = "http://localhost:8088";
	
	private Client cliente;
	private WebTarget target;

	public CastingWebTarget() {
		cliente = ClientBuilder.newClient();

		target = cliente.target(ENDERECO);
		target.register(gerarProviderParaJSON());
	}

	private JacksonJaxbJsonProvider gerarProviderParaJSON() {

		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, Boolean.FALSE);
		mapper.registerModule(new JodaModule());

		JacksonJaxbJsonProvider jacksonJaxbJsonProvider = new JacksonJaxbJsonProvider();
		jacksonJaxbJsonProvider.setMapper(mapper);

		return jacksonJaxbJsonProvider;

	}

	public Configuration getConfiguration() {
		return target.getConfiguration();
	}

	public WebTarget property(String arg0, Object arg1) {
		return target.property(arg0, arg1);
	}

	public WebTarget register(Class<?> arg0) {
		return target.register(arg0);
	}

	public WebTarget register(Object arg0) {
		return target.register(arg0);
	}

	public WebTarget register(Class<?> arg0, int arg1) {
		return target.register(arg0);
	}

	public WebTarget register(Class<?> arg0, Class<?>... arg1) {
		return target.register(arg0, arg1);
	}

	public WebTarget register(Class<?> arg0, Map<Class<?>, Integer> arg1) {
		return target.register(arg0, arg1);
	}

	public WebTarget register(Object arg0, int arg1) {
		return target.register(arg0, arg1);
	}

	public WebTarget register(Object arg0, Class<?>... arg1) {
		return target.register(arg0, arg1);
	}

	public WebTarget register(Object arg0, Map<Class<?>, Integer> arg1) {
		return target.register(arg0, arg1);
	}

	public URI getUri() {
		return target.getUri();
	}

	public UriBuilder getUriBuilder() {
		return target.getUriBuilder();
	}

	public WebTarget matrixParam(String arg0, Object... arg1) {
		return target.matrixParam(arg0, arg1);
	}

	public WebTarget path(String arg0) {
		return target.path(arg0);
	}

	public WebTarget queryParam(String arg0, Object... arg1) {
		return target.queryParam(arg0, arg1);
	}

	public Builder request() {
		return target.request();
	}

	public Builder request(String... arg0) {
		return target.request(arg0);
	}

	public Builder request(MediaType... arg0) {
		return target.request(arg0);
	}

	public WebTarget resolveTemplate(String arg0, Object arg1) {
		return target.resolveTemplate(arg0, arg1);
	}

	public WebTarget resolveTemplate(String arg0, Object arg1, boolean arg2) {
		return target.resolveTemplate(arg0, arg1, arg2);
	}

	public WebTarget resolveTemplateFromEncoded(String arg0, Object arg1) {
		return target.resolveTemplate(arg0, arg1);
	}

	public WebTarget resolveTemplates(Map<String, Object> arg0) {
		return target.resolveTemplates(arg0);
	}

	public WebTarget resolveTemplates(Map<String, Object> arg0, boolean arg1) {
		return target.resolveTemplates(arg0, arg1);
	}

	public WebTarget resolveTemplatesFromEncoded(Map<String, Object> arg0) {
		return target.resolveTemplates(arg0);
	}

}
