package br.com.kronos.casting.domain;

import java.io.Serializable;

import br.com.kronos.casting.domain.enumeration.PrioridadeContato;

public class Email implements Serializable{

	private static final long serialVersionUID = 443772251946998898L;
	
	private String email;
	private PrioridadeContato prioridade;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PrioridadeContato getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(PrioridadeContato prioridade) {
		this.prioridade = prioridade;
	}

}
