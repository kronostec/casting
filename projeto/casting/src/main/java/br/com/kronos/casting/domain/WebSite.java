package br.com.kronos.casting.domain;

import br.com.kronos.casting.domain.enumeration.TipoSite;

public class WebSite {

	private TipoSite tipo;
	private String nome;
	private String url;

	public WebSite(TipoSite tipo, String nome, String url) {
		this.tipo = tipo;
		this.nome = nome;
		this.url = url;
	}
	
	public TipoSite getTipo(){
		return this.tipo;
	}

	public String getNome() {
		return nome;
	}

	public String getUrl() {
		return url;
	}

}
