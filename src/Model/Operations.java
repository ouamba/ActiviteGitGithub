package Model;

import java.io.Serializable;
import java.sql.Date;

public abstract class Operations implements Serializable {
	private Long numero;
	private Date dateOPeration;
	private double montant;
	private Compte compte;
	public Operations() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Operations(Long numero, Date dateOPeration, double montant, Compte compte) {
		super();
		this.numero = numero;
		this.dateOPeration = dateOPeration;
		this.montant = montant;
		this.compte = compte;
	}

	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Date getDateOPeration() {
		return dateOPeration;
	}
	public void setDateOPeration(Date dateOPeration) {
		this.dateOPeration = dateOPeration;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
}
