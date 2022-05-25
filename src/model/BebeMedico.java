package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "bebe_medico")
public class BebeMedico {

	@Id
	@ManyToOne
	@JoinColumn(name = "cpf_bebe")
	@NotNull
	private Bebe bebe;

	@Id
	@ManyToOne
	@JoinColumn(name = "crm")
	@NotNull
	private Medico crm;

	public Bebe getBebe() {
		return bebe;
	}

	public void setBebe(Bebe bebe) {
		this.bebe = bebe;
	}

	public Medico getCrm() {
		return crm;
	}

	public void setCrm(Medico crm) {
		this.crm = crm;
	}

	@Override
	public String toString() {
		return "BebeMedico [bebe=" + bebe + ", crm=" + crm + "]";
	}

}