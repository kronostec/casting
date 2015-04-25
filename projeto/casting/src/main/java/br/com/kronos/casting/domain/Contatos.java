package br.com.kronos.casting.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.kronos.casting.domain.enumeration.PrioridadeContato;

public final class Contatos {

	private final List<Email> listaEmail;
	private final List<Telefone> listaTelefone;
	private String skype;
	private List<WebSite> listaSitesPessoais;
	private List<String> informacoesAdicionais;

	public Contatos(Email email, Telefone telefone) {
		this.listaEmail = new ArrayList<Email>();
		this.listaTelefone = new ArrayList<Telefone>();
		this.listaEmail.add(email);
		this.listaTelefone.add(telefone);
	}

	public void adicionaEmail(Email email) {
		for (Email emailDaLista : listaEmail) {
			if (isPrincipal(emailDaLista.getPrioridade())) {
				throw new IllegalArgumentException("Só pode existir um e-mail prioritario por artista.");
			}
		}
		this.listaEmail.add(email);
	}

	public void removerEmail(Email email){
		this.listaEmail.remove(email);
	}
	
	public Email pegarEmailPrincipal() {
		for (Email emailDaLista : listaEmail) {
			if (isPrincipal(emailDaLista.getPrioridade())) {
				return emailDaLista;
			}
		}
		throw new RuntimeException("Artista não possui e-mail principal.");
	}

	public void substituiEmail(Email original, Email novo) {
		this.listaEmail.remove(original);
		this.listaEmail.add(novo);
	}

	public List<Email> pegarListaEmail() {
		return Collections.unmodifiableList(this.listaEmail);
	}

	public void adicionaTelefone(Telefone telefone) {
		for (Telefone telefoneDaLista : listaTelefone) {
			if (isPrincipal(telefoneDaLista.getPrioridade())) {
				throw new IllegalArgumentException("Só pode existir um telefone prioritario por artista.");
			}
		}
	}

	public void removerTelefone(Telefone telefone){
		this.listaTelefone.remove(telefone);
	}
	
	public Telefone getTelefonePrincipal() {
		for (Telefone telefoneDaLista : listaTelefone) {
			if (isPrincipal(telefoneDaLista.getPrioridade())) {
				return telefoneDaLista;
			}
		}
		throw new RuntimeException("Artista não possui telefone principal.");
	}

	public void substituiTelefone(Telefone original, Telefone novo) {
		this.listaTelefone.remove(original);
		this.listaTelefone.add(novo);
	}

	public List<Telefone> pegarListaTelefone() {
		return Collections.unmodifiableList(this.listaTelefone);
	}

	private boolean isPrincipal(PrioridadeContato prioridade) {
		return PrioridadeContato.PRINCIPAL.equals(prioridade);
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}
	
	public void adicionaSite(WebSite site){
		this.listaSitesPessoais.add(site);
	}
	
	public void removeSite(WebSite site){
		this.listaSitesPessoais.remove(site);
	}
	
	public List<WebSite> pegarTodosOsSites(){
		return Collections.unmodifiableList(this.listaSitesPessoais);
	}
	
	public void adicionaInformacoesAdicionais(String informacoes){
		this.informacoesAdicionais.add(informacoes);
	}
	
	public void removeInformacoesAdicionais(String informacoes){
		this.informacoesAdicionais.remove(informacoes);
	}

	public List<String> pegarInformacoesAdicionais(){
		return Collections.unmodifiableList(this.informacoesAdicionais);
	}
	
}
