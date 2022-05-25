package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "mae")
public class Mae {

	@Id
	@Column(name = "cpf_mae", length = 11)
	@NotNull
	private String cpf_mae;

	@Column(name = "nome", length = 60)
	@NotNull
	private String nome;

	@Column(name = "logradouro_endereco", length = 100)
	@NotNull
	private String logradouro_endereco;

	@Column(name = "numero_endereco")
	@NotNull
	private int numero_endereco;

	@Column(name = "cep_endereco", length = 8)
	@NotNull
	private String cep_endereco;

	@Column(name = "complemento_endereco", length = 8)
	private String complemento_endereco;

	@Column(name = "telefone", length = 10)
	@NotNull
	private String telefone;

	@Column(name = "data_nasc")
	@NotNull
	private LocalDate data_nasc;

	public String getCpf_mae() {
		return cpf_mae;
	}

	public void setCpf_mae(String cpf_mae) {
		this.cpf_mae = cpf_mae;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogradouro_endereco() {
		return logradouro_endereco;
	}

	public void setLogradouro_endereco(String logradouro_endereco) {
		this.logradouro_endereco = logradouro_endereco;
	}

	public int getNumero_endereco() {
		return numero_endereco;
	}

	public void setNumero_endereco(int numero_endereco) {
		this.numero_endereco = numero_endereco;
	}

	public String getCep_endereco() {
		return cep_endereco;
	}

	public void setCep_endereco(String cep_endereco) {
		this.cep_endereco = cep_endereco;
	}

	public String getComplemento_endereco() {
		return complemento_endereco;
	}

	public void setComplemento_endereco(String complemento_endereco) {
		this.complemento_endereco = complemento_endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(LocalDate data_nasc) {
		this.data_nasc = data_nasc;
	}

	@Override
	public String toString() {
		return "Mae [cpf_mae=" + cpf_mae + ", nome=" + nome + ", logradouro_endereco=" + logradouro_endereco
				+ ", numero_endereco=" + numero_endereco + ", cep_endereco=" + cep_endereco + ", complemento_endereco="
				+ complemento_endereco + ", telefone=" + telefone + ", data_nasc=" + data_nasc + "]";
	}

}