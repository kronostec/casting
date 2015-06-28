package br.com.kronos.casting.domain;

import java.io.Serializable;

import br.com.kronos.casting.domain.enumeration.TipoSite;

public class WebSite implements Serializable {

	private static final long serialVersionUID = 3254989946550938674L;

	private TipoSite tipo;
	private String nome;
	private String url;

	public TipoSite getTipo() {
		return tipo;
	}

	public void setTipo(TipoSite tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
