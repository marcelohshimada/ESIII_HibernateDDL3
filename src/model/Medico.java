package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "medico")
public class Medico {

	@Id
	@Column(name = "crm", length = 7)
	@NotNull
	private String crm;

	@Column(name = "nome", length = 60)
	@NotNull
	private String nome;

	@Column(name = "telefone", length = 11)
	@NotNull
	private String telefone;

	@Column(name = "especialidade", length = 30)
	@NotNull
	private String especialidade;

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		return "Medico [crm=" + crm + ", nome=" + nome + ", telefone=" + telefone + ", especialidade=" + especialidade
				+ "]";
	}

}