package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "bebe")
@Inheritance(strategy = InheritanceType.JOINED)
public class Bebe {

	@Id
	@Column(name = "cpf_bebe", length = 11)
	@NotNull
	private String cpf_bebe;

	@Column(name = "nome", length = 60)
	@NotNull
	private String nome;

	@Column(name = "data_nascimento")
	@NotNull
	private LocalDate dataNascimento;

	@Column(name = "altura")
	@NotNull
	private float altura;

	@ManyToOne
	@JoinColumn(name = "cpf_mae")
	@NotNull
	private Mae mae;

	public String getCpf_bebe() {
		return cpf_bebe;
	}

	public void setId_bebe(String cpf_bebe) {
		this.cpf_bebe = cpf_bebe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public Mae getMae() {
		return mae;
	}

	public void setMae(Mae mae) {
		this.mae = mae;
	}

	@Override
	public String toString() {
		return "Bebe [cpf_bebe=" + cpf_bebe + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", altura="
				+ altura + ", mae=" + mae + "]";
	}

}