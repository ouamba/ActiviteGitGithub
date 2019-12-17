package Model;

import java.sql.Date;

public class Versement extends Operations {

	public Versement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Versement(Long numero, Date dateOPeration, double montant, Compte compte) {
		super(numero, dateOPeration, montant, compte);
		// TODO Auto-generated constructor stub
	}
	
}
