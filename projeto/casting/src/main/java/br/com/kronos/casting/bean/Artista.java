package br.com.kronos.casting.bean;

import java.util.List;

import org.joda.time.LocalDate;

import br.com.kronos.casting.enumeration.EstadoCivil;

public class Artista implements Bean {

	private Long cpf;

	private String nome;
	private String nomeArtistico;
	private Sexo sexo;
	private LocalDate dataNascimento;
	private EstadoCivil estadoCivil;
	private String nacionalidade;
	private List<String> agenciamentos;
	private String informacoesAdicionais;

	public Artista(Long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeArtistico() {
		return this.nomeArtistico;
	}

	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}

	public Sexo getSexo() {
		return this.sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public LocalDate getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public EstadoCivil getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getNacionalidade() {
		return this.nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public List<String> getAgenciamentos() {
		return this.agenciamentos;
	}

	public void setAgenciamentos(List<String> agenciamentos) {
		this.agenciamentos = agenciamentos;
	}

	public String getInformacoesAdicionais() {
		return this.informacoesAdicionais;
	}

	public void setInformacoesAdicionais(String informacoesAdicionais) {
		this.informacoesAdicionais = informacoesAdicionais;
	}

	public Long getCpf() {
		return this.cpf;
	}

	@Override
	public String toString() {
		return "Artista [cpf=" + this.cpf + ", nome=" + this.nome + ", nomeArtistico=" + this.nomeArtistico + ", sexo=" + this.sexo + ", dataNascimento=" + this.dataNascimento + ", estadoCivil="
				+ this.estadoCivil + ", nacionalidade=" + this.nacionalidade + ", agenciamentos=" + this.agenciamentos + ", informacoesAdicionais=" + this.informacoesAdicionais + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (this.agenciamentos == null ? 0 : this.agenciamentos.hashCode());
		result = prime * result + (this.cpf == null ? 0 : this.cpf.hashCode());
		result = prime * result + (this.dataNascimento == null ? 0 : this.dataNascimento.hashCode());
		result = prime * result + (this.estadoCivil == null ? 0 : this.estadoCivil.hashCode());
		result = prime * result + (this.informacoesAdicionais == null ? 0 : this.informacoesAdicionais.hashCode());
		result = prime * result + (this.nacionalidade == null ? 0 : this.nacionalidade.hashCode());
		result = prime * result + (this.nome == null ? 0 : this.nome.hashCode());
		result = prime * result + (this.nomeArtistico == null ? 0 : this.nomeArtistico.hashCode());
		result = prime * result + (this.sexo == null ? 0 : this.sexo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Artista other = (Artista) obj;
		if (this.agenciamentos == null) {
			if (other.agenciamentos != null) {
				return false;
			}
		} else if (!this.agenciamentos.equals(other.agenciamentos)) {
			return false;
		}
		if (this.cpf == null) {
			if (other.cpf != null) {
				return false;
			}
		} else if (!this.cpf.equals(other.cpf)) {
			return false;
		}
		if (this.dataNascimento == null) {
			if (other.dataNascimento != null) {
				return false;
			}
		} else if (!this.dataNascimento.equals(other.dataNascimento)) {
			return false;
		}
		if (this.estadoCivil != other.estadoCivil) {
			return false;
		}
		if (this.informacoesAdicionais == null) {
			if (other.informacoesAdicionais != null) {
				return false;
			}
		} else if (!this.informacoesAdicionais.equals(other.informacoesAdicionais)) {
			return false;
		}
		if (this.nacionalidade == null) {
			if (other.nacionalidade != null) {
				return false;
			}
		} else if (!this.nacionalidade.equals(other.nacionalidade)) {
			return false;
		}
		if (this.nome == null) {
			if (other.nome != null) {
				return false;
			}
		} else if (!this.nome.equals(other.nome)) {
			return false;
		}
		if (this.nomeArtistico == null) {
			if (other.nomeArtistico != null) {
				return false;
			}
		} else if (!this.nomeArtistico.equals(other.nomeArtistico)) {
			return false;
		}
		if (this.sexo != other.sexo) {
			return false;
		}
		return true;
	}

}
