package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "residente")
public class Residente extends Medico {

	@Column(name = "instituicao_ensino", length = 50)
	@NotNull
	private String instituicao_ensino;

	@Column(name = "ano_ingresso")
	@NotNull
	private int ano_ingresso;

	@Override
	public String toString() {
		return "Residente [instituicao_ensino=" + instituicao_ensino + ", ano_ingresso=" + ano_ingresso + "]";
	}

	public String getInstituicao_ensino() {
		return instituicao_ensino;
	}

	public void setInstituicao_ensino(String instituicao_ensino) {
		this.instituicao_ensino = instituicao_ensino;
	}

	public int getAno_ingresso() {
		return ano_ingresso;
	}

	public void setAno_ingresso(int ano_ingresso) {
		this.ano_ingresso = ano_ingresso;
	}

}