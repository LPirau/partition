package org.iepscf.pid.DAO.beans;

public class Utilisateur {

	private String nom;
	private String prenom;
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) throws BeanException {
		if (nom.length() > 10) {
			throw new BeanException("Le nom est trop grand ! 10 caractères maximum.");
		} else {
			this.nom = nom;
		}
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) throws BeanException {
		if (prenom.length() > 10) {
			throw new BeanException("Le prénom est trop grand ! 10 caractères maximum.");
		} else {
			this.prenom = prenom;			
		}
	}
	
}