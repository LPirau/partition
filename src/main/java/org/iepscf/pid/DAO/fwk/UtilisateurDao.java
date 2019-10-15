package org.iepscf.pid.DAO.fwk;

import java.util.List;

import org.iepscf.pid.DAO.beans.Utilisateur;

public interface UtilisateurDao {

	void ajouter( Utilisateur utilisateur ) throws DaoException;

	public boolean LogUser(Utilisateur utilisateur) throws DaoException;

	public List<Utilisateur> lister() throws DaoException;

}