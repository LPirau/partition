package org.iepscf.pid.DAO.fwk;

import java.sql.*;

public class DaoFactory {
	
    // JDBC driver name and database URL
	static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    static final String DB_URL = "jdbc:mariadb://127.0.0.1/javaee";
    
    // Database credential
    static final String USER = "root";
    static final String PASS = "cefalu";
    
	private String url;
    private String username;
    private String password;

    DaoFactory(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public static DaoFactory getInstance() {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
        	System.out.println(e);
        }

        DaoFactory instance = new DaoFactory(
        		DB_URL, USER, PASS);
        return instance;
    }

    public Connection getConnection() throws SQLException {
    	Connection connexion = DriverManager.getConnection(
    			url, username, password);
    	connexion.setAutoCommit(false);
        return connexion;
    }

    // Recuperation du Dao
    public UtilisateurDao getUtilisateurDao() {
        return new UtilisateurDaoImpl(this);
    }
}