package br.com.kronos.casting.domain;

import java.io.Serializable;
import java.util.List;

public final class Contatos implements Serializable {

	private static final long serialVersionUID = -6448411507721832302L;

	private List<Email> listaEmail;
	private List<Telefone> listaTelefone;
	private String skype;
	private List<WebSite> listaSitesPessoais;
	private List<String> informacoesAdicionais;

	public List<Email> getListaEmail() {
		return listaEmail;
	}

	public void setListaEmail(List<Email> listaEmail) {
		this.listaEmail = listaEmail;
	}

	public List<Telefone> getListaTelefone() {
		return listaTelefone;
	}

	public void setListaTelefone(List<Telefone> listaTelefone) {
		this.listaTelefone = listaTelefone;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public List<WebSite> getListaSitesPessoais() {
		return listaSitesPessoais;
	}

	public void setListaSitesPessoais(List<WebSite> listaSitesPessoais) {
		this.listaSitesPessoais = listaSitesPessoais;
	}

	public List<String> getInformacoesAdicionais() {
		return informacoesAdicionais;
	}

	public void setInformacoesAdicionais(List<String> informacoesAdicionais) {
		this.informacoesAdicionais = informacoesAdicionais;
	}

}
