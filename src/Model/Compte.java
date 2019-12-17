package Model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

public abstract class Compte implements Serializable {
	private String codeCompte;
	private Date dateCreation;
	private double solde;
	private Client client;
	private Collection<Operations> operations;
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(String codeCompte, Date dateCreation, double solde, Client client) {
		super();
		this.codeCompte = codeCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;
		this.client = client;
	}
	public String getCodeCompte() {
		return codeCompte;
	}
	public void setCodeCompte(String codeCompte) {
		this.codeCompte = codeCompte;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Collection<Operations> getOperation() {
		return operations;
	}
	public void setOperation(Collection<Operations> operation) {
		this.operations = operation;
	}
	
}
