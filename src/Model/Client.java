package Model;

import java.io.Serializable;
import java.util.Collection;

public class Client implements Serializable {
	private Long code;
	private String nom;
	private String email;
	private Collection<Compte> compte;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(Long code, String nom, String email, Collection<Compte> compte) {
		super();
		this.code = code;
		this.nom = nom;
		this.email = email;
		this.compte = compte;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Collection<Compte> getCompte() {
		return compte;
	}
	public void setCompte(Collection<Compte> compte) {
		this.compte = compte;
	}
	

}
